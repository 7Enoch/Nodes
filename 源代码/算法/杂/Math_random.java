
public class Math_random {
    public static void main(String[] args) {
        double c = 0;
        // ������
        double t = 100000;
        // ���Դ���
        System.out.println();
        System.out.print("*********���Ը����Ƿ������͸ı����*********\n");
        for (int i = 0; i < t; i++) {
            if (0.3 > Math.random()) {
                // С��0.3�ĸ���
                c++;
            }

        }
        System.out.print(" С��0.3�ĸ���Ϊ��" + c / t + "    \n ");
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
        System.out.println(" ���ζ�С��x�ĸ���Ϊ��" + Math.pow(x, 2));
        // pow����
        System.out.print("*********��1-5�����1-7��� ��a-b�����c-d��� 01���ȸ��ʵ�01�ȸ���*********\n");

        c = 0;
        for (int i = 0; i < t; i++) {

            if (g() == 0) {
                c++;
            }
        }
        System.out.println("0���ֵĸ���Ϊ��" + c / t);
        System.out.println("1���ֵĸ���Ϊ��" + (1.0 - (c / t)));
        System.out.print("===================================\n");

        int[] gprove = new int[8];
        for (int j = 0; j < t; j++) {
            int ans = g();

            gprove[ans]++;

        }
        for (int i = 0; i < gprove.length; i++) {
            System.out.println(i + "���ֵĸ���Ϊ:" + (double) gprove[i] / t);

        }

        System.out.println();
    }

    public static double toXpaw2() {
        // ��0-x�ϵĸ��ʱ�ΪΪx^2����
        return Math.max(Math.random(), Math.random());

    }

    public static int f() {
        // �ȸ��ʷ���1-5����
        return (int) ((Math.random() * 5) + 1);
    }

    public static int g() {
        return (gauxiliary2() + 1);

    }

    public static int gauxiliary0() {
        // ʹ��f����ʵ��1-7�ȸ��ʷ���

        int ans;
        do {
            ans = f();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    } // 1.�ȸ��ʷ���0��1

    public static int gauxiliary1() {
        // 2.�õ�0-7�����ȸ���
        return (gauxiliary0() << 2) + (gauxiliary0() << 1) + (gauxiliary0() << 0);
        // ���һ����������xxx

    }

    public static int gauxiliary2() {
        // 3.����0-6�ȸ���
        int ans = 0;
        do {
            ans = gauxiliary1();

        } while (ans == 7);
        return ans;

    }

}