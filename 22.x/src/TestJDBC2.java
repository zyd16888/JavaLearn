import service.StudentClass;

/**
 * ����:
 * ���ݿ������
 * 22.7
 *
 * @author dong
 * @date 2018-11-17 10:03
 */
public class TestJDBC2 {
    public static void main(String args[]){
        System.out.println("���Բ��Բ���123");
        //�����༶����
        StudentClass xg = new StudentClass();
        //���༶���ѧ��
        xg.createClass();
        //����ѧ����Ϣ�����ݿ�
        xg.saveToDB();
        //������ݿ���Ϣ
        System.out.println(xg.outFormDB());




    }
}
