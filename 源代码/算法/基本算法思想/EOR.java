//�������
public class EOR {

    public static void main(String[] args) {
        int a = 9;
        int b = 11;
        // 1.���ñ�������ֵ
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
        System.out.println("=========================================");

        // 2.һ����������һ���������������Σ�������������ż���Σ���ô�ҵ����������ӡ
        /*
         * ��������������������������õ�����ʲô������ͳ�����������
         */
        int[] arr = { 1, 2, 3, 3, 3, 3, 2, 1, 6 };
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor = eor ^ arr[i];

        }
        System.out.println(eor);

        // 3.һ��int���͵�������ȡ�����ұߵ�1
        /*
         * N&((~N)+1)
         */

        // 4.�������������������ֳ����������Σ�������������ż���Σ�����ҵ�����ӡ��������

    }

}