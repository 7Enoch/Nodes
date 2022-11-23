//整数转二进制32位输出

public class Base {
    static int num = 1;
    int i;

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }

    }

    public static void main(String args[]) {
        print(num);
    }
}