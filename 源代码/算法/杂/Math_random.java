
public class Math_random {
    public static void main(String[] args) {
        double c = 0;
        // 计数器
        double t = 100000;
        // 测试次数
        System.out.println();
        System.out.print("*********测试概率是否等随机和改变概率*********\n");
        for (int i = 0; i < t; i++) {
            if (0.3 > Math.random()) {
                // 小于0.3的概率
                c++;
            }

        }
        System.out.print(" 小于0.3的概率为：" + c / t + "    \n ");
        System.out.print("===================================\n");
        /************ 重置计数器进行下一次实验 **********/
        c = 0;
        double x = 0.7;
        for (int i = 0; i < t; i++) {
            if (x > toXpaw2()) {
                // 随机两次都小于0.7的概率
                c++;
            }

        }
        System.out.println(" 两次都小于x概率为：" + c / t);
        // 小于x的概率 自己写的函数
        System.out.println(" 两次都小于x的概率为：" + Math.pow(x, 2));
        // pow函数
        System.out.print("*********从1-5随机到1-7随机 从a-b随机到c-d随机 01不等概率到01等概率*********\n");

        c = 0;
        for (int i = 0; i < t; i++) {

            if (g() == 0) {
                c++;
            }
        }
        System.out.println("0出现的概率为：" + c / t);
        System.out.println("1出现的概率为：" + (1.0 - (c / t)));
        System.out.print("===================================\n");

        int[] gprove = new int[8];
        for (int j = 0; j < t; j++) {
            int ans = g();

            gprove[ans]++;

        }
        for (int i = 0; i < gprove.length; i++) {
            System.out.println(i + "出现的概率为:" + (double) gprove[i] / t);

        }

        System.out.println();
    }

    public static double toXpaw2() {
        // 将0-x上的概率变为为x^2概率
        return Math.max(Math.random(), Math.random());

    }

    public static int f() {
        // 等概率返回1-5的数
        return (int) ((Math.random() * 5) + 1);
    }

    public static int g() {
        return (gauxiliary2() + 1);

    }

    public static int gauxiliary0() {
        // 使用f函数实现1-7等概率返回

        int ans;
        do {
            ans = f();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    } // 1.等概率返回0和1

    public static int gauxiliary1() {
        // 2.得到0-7做到等概率
        return (gauxiliary0() << 2) + (gauxiliary0() << 1) + (gauxiliary0() << 0);
        // 获得一个二进制数xxx

    }

    public static int gauxiliary2() {
        // 3.做到0-6等概率
        int ans = 0;
        do {
            ans = gauxiliary1();

        } while (ans == 7);
        return ans;

    }

}