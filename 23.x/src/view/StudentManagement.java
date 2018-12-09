package view;

import dao.StudentDAO;
import service.Student;
import service.StudentClass;
import show.Display;
import sun.awt.DisplayChangedListener;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

/**
 * 描述:
 * 实现图形界面
 * 23.1
 *
 * @author dong
 * @date 2018-11-18 11:07
 */
public class StudentManagement implements ActionListener    {
    private final long serialVersionUID = 1L;

    private JFrame mainFrame;           //学生管理的主窗口

    private JPanel top;                 //输入区面板
    private JLabel labelTop;            //“录入”标签
    private JLabel labelName;           //“姓名”标签
    private JTextField textaName;       //“姓名”输入框
    private JLabel labelAge;            //“年龄”标签
    private JTextField textAge;         //”年龄“输入框
    private JLabel labelGrade;          //“成绩”标签
    private JTextField textGrade;       //“成绩”输入框
    private JButton btnAdd;             //“添加”按钮

    private JPanel middle;              //显示区面板，显示学生信息区域
    private JLabel labelMiddle;         //查看所有“|”标签
    private JButton btnShowALL;         //"显示"按钮
    private JButton btnSortAll;         //"排序"按钮
    private JTextArea areaShowAll;      //学生信息显示区

    private JPanel bottom;               //查询区面板
    private JLabel labelBottom;         //”查询“标签
    private JLabel labelQuery;          //”姓名：“标签
    private JTextField textQuery;       //”姓名“输入框
    private JButton btnQuery;           //”提交“按钮
    private JTextArea areaQuery;        //查询结果显示区

    public StudentManagement(String title){
        mainFrame = new JFrame(title);
    }

    public void run(){
        mainFrame.setBounds(100,100,600,250); //位置和大小
        mainFrame.setVisible(true);//窗口可见
        //单击关闭退出
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addInput();
        addShowAll();
        addQuery();

        setAction();

        mainFrame.validate();
    }

    private void addInput(){
        top = new JPanel();

        labelTop = new JLabel("录入 | ");
        labelName = new JLabel("姓名");
        labelAge = new JLabel("年龄");
        labelGrade = new JLabel("成绩");
        textaName = new JTextField(10);
        textAge = new JTextField(6);
        textGrade = new JTextField(6);
        btnAdd = new JButton("添加");

        top.add(labelTop);
        top.add(labelName);
        top.add(textaName);
        top.add(labelAge);
        top.add(textAge);
        top.add(labelGrade);
        top.add(textGrade);
        top.add(btnAdd);
        mainFrame.add(top, BorderLayout.NORTH);

    }

    private void addShowAll(){
        middle = new JPanel();

        labelMiddle = new JLabel("查看所有");
        btnShowALL = new JButton("显示");
        btnSortAll = new JButton("排序");
        areaShowAll = new JTextArea(7,25);

        middle.add(labelMiddle);
        middle.add(btnShowALL);
        middle.add(btnSortAll);
        middle.add(areaShowAll);
        mainFrame.add(middle,BorderLayout.CENTER);
    }

    private void addQuery() {
        bottom = new JPanel();

        labelBottom = new JLabel("查询| ");
        labelQuery = new JLabel("姓名：");
        textQuery = new JTextField(9);
        btnQuery = new JButton("提交");
        areaQuery = new JTextArea(1, 20);

        bottom.add(labelBottom);
        bottom.add(labelQuery);
        bottom.add(textQuery);
        bottom.add(btnQuery);
        bottom.add(areaQuery);
        mainFrame.add(bottom, BorderLayout.SOUTH);
    }

    private void setAction(){
        btnAdd.addActionListener(this);
        btnShowALL.addActionListener(this);
        btnSortAll.addActionListener(this);
        btnQuery.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String inputText  = e.getActionCommand();
        if (inputText.equals("添加")){
            addStudent();
        } else if (inputText.equals("显示")){
            displayAll();
        } else if (inputText.equals("排序")){
            sortAll();
        }else if(inputText.equals("提交")){
            queryStudent();
        }else {
            showError("error");
        }
    }

    private void addStudent(){
        String name;
        int age;
        double grade;

        try {
            name = textaName.getText();
            age = Integer.parseInt(textAge.getText());
            grade = Double.parseDouble(textGrade.getText());
        }catch (NumberFormatException e){
            showError("输入有错误");
            return;
        }

        Student student = new Student(name,age,grade);

        StudentDAO sd = new StudentDAO();
        if (sd.insert(student)){
            showMsg("添加成功");
            displayAll();
        }else {
            showError("添加失败");
        }
    }

    private void displayAll(){
        StudentDAO sd = new StudentDAO();
        StringBuilder out = new StringBuilder();
        StudentClass xg = sd.getStudentClass();
//        System.out.println(xg.formatStudent());
        /*for (Map<String, String> s : xg.formatStudent()){
            out.append("姓名："+s.get("姓名")+"      年龄："+s.get("年龄")+"      成绩："+s.get("成绩")+"\r\n");
        }
        System.out.println(out.toString());
        areaShowAll.setText(out.toString());*/
        Display display = new Display();
        String out1 = display.print(xg.formatStudent());
        areaShowAll.setText(out1);
    }

    private void sortAll(){
        StudentDAO sd = new StudentDAO();
        StudentClass xg = sd.getStudentClass();
        xg.sort();
        Display display = new Display();
        String out = display.print(xg.formatStudent());
        areaShowAll.setText(out);
    }

    private void queryStudent(){
        String name = textQuery.getText();

        StudentDAO sd = new StudentDAO();
        Student  student = sd.getByName(name);

        if (name != null && name.length()>0){
            String content = showStudent(student);
            areaQuery.setText(content);
        }else {
            showError("查询条件错误！");
        }
    }

    private String showStudent(Student student){
        String result;
        if (student != null){
            result = "姓名:"+student.getName()+" 成绩:"+student.getGrade();
        }else {
            result = "学生不存在";
        }

        return result;
    }

    public void showError(String errorMsg){
        String dialogTitle = "学生成绩管理";
        JOptionPane.showMessageDialog(mainFrame,errorMsg,dialogTitle,JOptionPane.WARNING_MESSAGE);
    }

    public void showMsg(String msg){
        String dialogTitle = "学生成绩管理";
        JOptionPane.showMessageDialog(mainFrame,msg,dialogTitle,JOptionPane.INFORMATION_MESSAGE);
    }

}
