public class TableInfo_Teacher_Test {
    public static void main(String[] args) {
        TableInfo t = new  TableInfo("方形",4,300,3600);
        Teacher zhang = new Teacher("张老师",40,4580,"副教授",t);

        zhang.display();
    }



}
