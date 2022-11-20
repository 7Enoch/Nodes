//一维二维实现表
//实现功能给指定数组和左右值输出Arr[L]+...+Arr[R]的和
public class demo1 {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 9 };
        // System.out.print("arr[1]+...+arr[3]的值为:");
        // Table1(arr, 1, 3);
        Table2(arr, 0, 3);

    }

    public static void Table1(int arr[], int L, int R) {
        // 一维表
        int[] Help = new int[arr.length];
        /****************************
         * 先将Help赋值
         *********************************************************/
        for (int i = 0; i < arr.length; i++) {
            //
            if (i == 0) {
                Help[i] = arr[i];
            } else {
                Help[i] = Help[i - 1] + arr[i];
            }
        }
        /****************************
         * 先将Help赋值
         *********************************************************/

        if (L == 0) {
            System.out.print(" " + Help[R]);
        } else {
            System.out.print(" " + (Help[R] - Help[L]));

        }
    }

    public static void Table2(int arr[], int L, int R) {
        // 二维表

        for (int Ly = 0; Ly < arr.length; Ly++) {
            int tmp = 0;
            for (int Rx = 0; Rx < arr.length; Rx++) {
                if (Ly > Rx) {
                    System.out.print("×" + " ");
                } else if (Ly == Rx) {
                    System.out.print(arr[Rx] + " ");
                    tmp = arr[Rx];
                } else {
                    // 实现赋值功能
 
                }

            }

            System.out.print("\n");
        }

    }

}