//����n ��ӡ���1��+2��+3��+......+n��

public class demo2 {
    public static long f1(int n) {
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += factorial(i);
            // ����ÿһ�εĽ׳�
        }
        return ans;
    }// ����f1����

    public static long factorial(int n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        // ÿһ�εĽ׳�
        return ans;
    }

    // ����factorial����
    public static long f2(int n) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= n; i++) {
            cur = cur * i;
            // cur��ȡ��һ�εĽ�����ٳ���ÿһ�ε���һ��������һ���׳�
            ans += cur;
            // �ѽ׳˽���ۼ��������浽ans��
        }
        return ans;
    }

    // ����f2����
    public static void main(String args[]) {
        int n = 10;
        System.out.println(f1(n));
        System.out.println(f2(n));
    }

}
