//归并排序
public class mergeSort {
    public static void main(String[] args) {

        int maxsize = 100;
        int maxvalue = 1000;
        int timetest = 10;
        System.out.println("测试开始");
        for (int i = 0; i < timetest; i++) {

            int[] arr1 = generteRandomArray(maxsize, maxvalue);
            int[] arr2 = copyArray(arr1);

            mergeSort1(arr1);
            mergeSort2(arr2);
            if (!isEqual(arr1, arr2)) {
                System.out.println("出错了");
                printArray(arr1);
                printArray(arr2);
                break;
            }

        }
        System.out.println("测试结束");
    }

    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int help[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            help[i] = arr[i];
        }
        return help;
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static boolean isEqual(int[] a, int[] b) {
        if (a == null && b == null) {
            return true;
        }
        if (a.length != b.length) {
            return false;
        }
        if ((a == null && b != null) || (a != null && b == null)) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }

        }
        return true;
    }

    public static int[] generteRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) (Math.random() * (maxSize + 1))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue * (Math.random())) - (maxValue * (Math.random())));
        }
        return arr;
    }

    // 递归实现
    public static void mergeSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    // 这个函数功能是让数组arr[L...R]上有序，递归实现
    public static void process(int[] arr, int L, int R) {

        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);// 取中间数
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);

    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];// 开辟L到R距离那么长的辅助数组
        int i = 0;
        int p1 = L;// 指向左边的指针
        int p2 = M + 1;// 指向右边的指针
        // 不可能同时越界
        while (p1 <= M && p2 <= R) {// 两边都没越界时
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {// 右边越界时执行
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {// 左边越界时执行
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];// 从开始进来的数组将辅助数组一个一个赋值
        }
    }

    // 非递归实现
    public static void mergeSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int step = 1;// 步长
        int N = arr.length;
        while (step < N) {// 防止步长越界
            int L = 0;
            int M = 0;
            while (L < N) {

                if (N - L >= step) {// L到N-1能凑齐一个步长
                    M = L + step - 1;
                } else {
                    M = N - 1;
                } // 获取中点数
            }
            if (M == N - 1) {// 没凑够左组，没有右组，直接退出
                break;
            }
            int R = 0;
            // 右组最后一个数
            if (N - 1 - M >= step) {
                R = M + step;
            } else {
                R = N - 1;
            }
            merge(arr, L, M, R);
            if (R == N - 1) {
                break;
            } else {
                L = R + 1;// 指向下一个左组开头
            }
            if (step > (N / 2)) {// 对step改变操作，防止溢出
                break;
            } else {
                step *= 2;
            }
        }
    }
}