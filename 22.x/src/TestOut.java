import data.FileInOperation;

import java.io.IOException;

/**
 * ����:
 * ��������򣬶�ȡ�ļ�
 * 22.9
 *
 * @author dong
 * @date 2018-11-18 10:04
 */
public class TestOut {

    public static void main(String[] args) {
        try {
            FileInOperation fo = new FileInOperation("student.txt");
            fo.read();
            fo.close();
        } catch (IOException e) {
            System.out.println("�ļ�����");
            e.printStackTrace();
        }
    }
}
