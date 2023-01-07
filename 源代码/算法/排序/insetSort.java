//插入排序
public class insetSort {

    public static void insetSort1(int[] arr) {
        // 未优化
        for (int i = 0; i < arr.length; i++) {
            if (arr == null || arr.length < 2) {
                return;
            }
            // 0~0已完成
            // 0~1
            // 0~2
            // 0~3观察结尾位置在变
            // 0~n-1
            for (int end = 1; end < arr.length; end++) {
                int newNumIndex = end;
                // 新来的数字在end位置上
                while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                    // end-1>=0 这个位置的左边有数字
                    int tmp;
                    tmp = arr[newNumIndex];
                    arr[newNumIndex] = arr[newNumIndex - 1];
                    arr[newNumIndex - 1] = tmp;

                    newNumIndex--;
                    // 交换完当前数就往前移动开始下一次对比
                }

            }

        }

    }

    public static void insetSort2(int arr[]) {
        // 优化
        for (int i = 0; i < arr.length; i++) {
            if (arr == null || arr.length < 2) {
                return;
            }
            // 0~0已完成
            // 0~1
            // 0~2
            // 0~3观察结尾位置在变
            // 0~n-1
            for (int end = 1; end < arr.length; end++) {
                for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                    // pre 新数的前一个位置
                    int tmp;
                    tmp = arr[pre];
                    arr[pre] = arr[pre + 1];
                    arr[pre + 1] = tmp;
                }
            }

        }

    }

    public static void print(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 9, 7, 12, 5, 2, 19, 2, 0, 5, 3 };
        print(arr);
        System.out.println();
        // insetSort1(arr);
        insetSort2(arr);
        print(arr);

    }

}
