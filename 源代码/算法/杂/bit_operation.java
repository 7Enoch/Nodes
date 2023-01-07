public class bit_operation {
    public static void main(String[] args) {
        bit_operation test = new bit_operation();
        System.out.println(test.multi(1, 229));
    }

    public int addition(int a, int b) {// 加法

        int sum = a;// 拿到a
        while (b != 0) {
            sum = a ^ b; // 不进位相加信息 sum
            b = (a & b) << 1;// 进位信息 b b->b'
            a = sum; // 不进位相加信息 a a->a'
        }
        return sum;
    }

    public int negNum(int n) {// 相反数函数
        return (addition(~n, 1));
    }

    public int minus(int a, int b) {// 就是加上b的相反数 ~b+1就是b的相反数
        return addition(a, negNum(b));
    }

    public int multi(int a, int b) {
        int ans = 0;
        while (b != 0) {// b要是等于0结果就是0
            if ((b & 1) != 0) {// 判断当前b的最后一位是不是0
                ans = addition(ans, a);// 不等于0就加a
            }
            a = a << 1;// a每次都带符号向左移动一位
            b = b >>> 1;// 每一次循环b右移动一位，目的是移动最后一位，好让上面判断
        }
        return ans;
    }

}
