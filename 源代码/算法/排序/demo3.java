// 选择排序

public class demo3 {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        } // 考虑边界条件
        int n = arr.length;
        // 0 —— n-1
        // 1 —— n-1
        // 2 —— n-1
        for (int i = 0; i < n; i++) {
            // i —— n-1 这个for界定左侧范围
            int minIndex = i;// 设置初始位置
            for (int j = i + 1; j < n; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                // 如果后者比前者小则将minIndex更新为后面的位置，否则不变
            } // 获取最小值位置
            int cur = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = cur;
            // swap(arr,i,minIndex);
        }
    }// 获取到位置后即可交换位置

    public static void swap(int arr[], int i, int j) {
        int cur = arr[j];
        arr[j] = arr[i];
        arr[i] = cur;

    }// 交换函数

    // 打印数组
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = { 1, 5, 2, 7, 4, 8, 6, 9, 0, };
        System.out.print("排序前:");
        printArray(arr);
        selectSort(arr);
        System.out.print("排序后:");
        printArray(arr);
    }

}
