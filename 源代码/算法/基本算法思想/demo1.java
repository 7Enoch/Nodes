import java.util.Arrays;

public class demo1 {

    public static void main(String[] args) {
        System.out.println("������:�����װ��" + pb() + "��");
        int arr[] = { 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
        int n = 5;
        System.out.print("�ܲ�������" + n + "�仨��");
        gf(arr, n);

    }

    public static int pb() {
        // ����������
        /*
         * ��һ���̴���������һЩ���
         * ���ǵ�������һ�����Ǽ�ֵһ�������ڱ���������٣�
         * �������г�������
         * ����ô���ú��������������Ļ���,���м���
         */

        int[] ms = { 10, 2, 14, 67, 9, 4, 3, 6, 7 }; // �̴��Ļ���
        int pb = 300; // �������ܳ��ش�С
        int tmp = 0;
        int n = 0;
        Arrays.sort(ms);

        for (int i = 0; i < ms.length; i++) {
            tmp += ms[i];
            if (tmp > pb) {
                break;
            }
            n++;

        }
        return n;
    }

    public static void gf(int arr[], int n) {
        /*
         * һ���ܳ��Ļ�̳��һ�����Ѿ���ֲ�˻�����һ����ȴû�У�
         * ��������ֲ�����ڵĵؿ��ϣ���������������
         * ������һ�����������ʾ��̳�������ɸ�0��1��ɣ�
         * 0��ʾû�ֻ���1��ʾ�ֻ�����һ������n�������ܲ�������n�仨
         */
        int count = 0;
        if (n == 0) {
            System.out.println("��");
        }
        for (int i = 0; i < arr.length;) {
            if (arr[i] == 1) {
                // Ŀ�괦�л�
                i += 2;
            } else if (i > 0 && arr[i - 1] == 1) {
                // ��ǰ��ǰһ��λ���л�
                i++;

            } else if (i + 1 < arr.length && arr[i + 1] == 1) {
                // ��ǰ�ĺ�һ��λ���л�
                i += 3;
            } else {
                // ���Ҷ�û��
                arr[i] = 1;
                count++;
                i += 2;
            }

        }
        if (count >= n) {
            System.out.println("��");
        } else {
            System.out.println("����");
        }
    }
}