
public class Math_random {
    public static void main(String[] args) {
        double c = 0;
        // 计数器
        double t = 100000;
        // 测试次数
        for (int i = 0; i < t; i++) {
            if (0.3 > Math.random()) {
                // 小于0.3的概率
                c++;
            }

        }
        System.out.print(" 概率为：" + c / t + "    \n ");
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
        System.out.print(" 两次都小于x的概率为：" + Math.pow(x, 2));
        // pow函数
        System.out.print("===================================\n");
    }

    public static double toXpaw2() {
        return Math.max(Math.random(), Math.random());
        // 将0-x上的概率变为为x^2概率
    }

}