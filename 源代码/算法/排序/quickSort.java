import java.util.Arrays;

//快速排序
public class quickSort {
    static ArrayUtil utilQ = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtil utilQ = new ArrayUtil();
        int maxSize = 100;
        int maxValue = 1000;
        int timetest = 1000000;
        System.out.println("测试开始");
        for (int i = 0; i < timetest; i++) {
            int[] arr1 = utilQ.generteRandomArray(maxSize, maxValue);
            int[] arr2 = utilQ.copyArray(arr1);
            quickSort1(arr1);
            Arrays.sort(arr2);
            if (!utilQ.isEqual(arr1, arr2)) {
                System.out.println("出错了");
                utilQ.printArray(arr1);
                utilQ.printArray(arr2);
                break;
            }

        }
        System.out.println("测试完成");
    }

    public static void quickSort1(int[] arr) {
        if (arr == null && arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);

    }

    public static void process(int[] arr, int L, int R) {
        if (L >= R) {
            return;
        }
        int[] border = partition(arr, L, R);
        // border[0]是中间数左边界
        // border[1]是中间数右边界
        process(arr, L, border[0] - 1);
        process(arr, border[1] + 1, R);

    }

    // 两个引出函数
    public static void splitNum1(int[] arr) {
        int lessEqualR = -1;// 小于等于区域的右边界
        int index = 0;// 当前下标
        int mostR = arr.length - 1;// 获取最后一个数字
        while (index < arr.length) {
            if (arr[index] <= arr[mostR]) {
                utilQ.swap(arr, ++lessEqualR, index++);
                // lessEqualR++;// 小于等于区域往下扩展
                // index++;
            } else {
                index++;
            }

        }
    }

    public static void splitNum2(int[] arr) {
        int index = 0;// 当前指针
        int less = -1;// 小于区域指针
        int greater = arr.length - 1;// 大于区域指针
        int mostR = arr.length - 1;// 最右边的角标
        while (index < greater) {
            if (arr[index] > arr[mostR]) {
                utilQ.swap(arr, index, --greater);// 当前数与大于区域前一个交换

            } else if (arr[index] < arr[mostR]) {
                utilQ.swap(arr, index++, ++less);
            } else {
                index++;
            }

        }
        utilQ.swap(arr, greater, mostR);
    }

    // 目的函数
    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;// 左边界指针
        int greater = R;// 右边界指针
        int index = L;// 当前数指针
        while (index < greater) {
            if (arr[index] > arr[R]) {
                utilQ.swap(arr, --greater, index);
            } else if (arr[index] < arr[R]) {
                utilQ.swap(arr, ++less, index++);
            } else {
                index++;
            }
        }
        utilQ.swap(arr, greater, R);
        return new int[] { less + 1, greater };// 返回的左右边界数组
        // 比如一个数组 2 4 5 2 6 6 6 6 6 7 8 7 9 7
        // 这里的两个边界就是第一个6的角标和最后一个6的角标
    }
}
