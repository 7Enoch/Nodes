//输入n 打印结果1！+2！+3！+......+n！

public class demo2 {
    public static long f1(int n) {
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += factorial(i);
            // 加上每一次的阶乘
        }
        return ans;
    }// 创建f1函数

    public static long factorial(int n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        // 每一次的阶乘
        return ans;
    }

    // 创建factorial函数
    public static long f2(int n) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= n; i++) {
            cur = cur * i;
            // cur获取上一次的结果，再乘以每一次的下一个就是下一个阶乘
            ans += cur;
            // 把阶乘结果累加起来保存到ans中
        }
        return ans;
    }

    // 创建f2函数
    public static void main(String args[]) {
        int n = 10;
        System.out.println(f1(n));
        System.out.println(f2(n));
    }

}
