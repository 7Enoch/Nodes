//异或运算
public class EOR {

    public static void main(String[] args) {
        int a = 9;
        int b = 11;
        // 1.不用变量交换值
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
        System.out.println("=========================================");

        // 2.一个数组中有一种数出现了奇数次，其他数出现了偶数次，怎么找到这个数并打印
        /*
         * 把数组所有数字异或起来，最后得到的是什么这个数就出现了奇数次
         */
        int[] arr = { 1, 2, 3, 3, 3, 3, 2, 1, 6 };
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor = eor ^ arr[i];

        }
        System.out.println(eor);

        // 3.一个int类型的数，提取出最右边的1
        /*
         * N&((~N)+1)
         */

        // 4.数组中有两种数，两种出现了奇数次，其他数出现了偶数次，如何找到并打印这两种数

    }

}