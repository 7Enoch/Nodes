
public class Math_random {
    public static void main(String[] args) {
        double c = 0;
        // ������
        double t = 100000;
        // ���Դ���
        for (int i = 0; i < t; i++) {
            if (0.3 > Math.random()) {
                // С��0.3�ĸ���
                c++;
            }

        }
        System.out.print(" ����Ϊ��" + c / t + "    \n ");
        System.out.print("===================================\n");
        /************ ���ü�����������һ��ʵ�� **********/
        c = 0;
        double x = 0.7;
        for (int i = 0; i < t; i++) {
            if (x > toXpaw2()) {
                // ������ζ�С��0.7�ĸ���
                c++;
            }

        }
        System.out.println(" ���ζ�С��x����Ϊ��" + c / t);
        // С��x�ĸ��� �Լ�д�ĺ���
        System.out.print(" ���ζ�С��x�ĸ���Ϊ��" + Math.pow(x, 2));
        // pow����
        System.out.print("===================================\n");
    }

    public static double toXpaw2() {
        return Math.max(Math.random(), Math.random());
        // ��0-x�ϵĸ��ʱ�ΪΪx^2����
    }

}