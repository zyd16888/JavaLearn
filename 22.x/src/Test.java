import data.FileOperation;
import service.StudentClass;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * ����:
 * ���������
 * д���ļ�
 * 22.3
 *
 * @author dong
 * @date 2018-11-15 14:50
 */
public class Test {
    public static void main(String[] args) {
        List<Map<String, String>>lst;

        //�����༶����
        StudentClass xg = new StudentClass();

        //���༶���ѧ��
        xg.createClass();

        //��ʽ��ѧ����Ϣ
        lst = xg.formatStudent();

        try {
            FileOperation xgStudent = new FileOperation("student.txt");
            //����ѧ����Ϣ���ļ�
            xgStudent.save(lst);
            //�ر��ļ�
            xgStudent.close();
            //��ʾ������ʾ
            System.out.println("�ļ�����ɹ���");
        } catch (IOException e) {
            System.out.println("IO�����ļ�����ʧ�ܣ�");
        }
    }
}
