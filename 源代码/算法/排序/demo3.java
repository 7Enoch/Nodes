// ѡ������

public class demo3 {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        } // ���Ǳ߽�����
        int n = arr.length;
        // 0 ���� n-1
        // 1 ���� n-1
        // 2 ���� n-1
        for (int i = 0; i < n; i++) {
            // i ���� n-1 ���for�綨��෶Χ
            int minIndex = i;// ���ó�ʼλ��
            for (int j = i + 1; j < n; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                // ������߱�ǰ��С��minIndex����Ϊ�����λ�ã����򲻱�
            } // ��ȡ��Сֵλ��
            int cur = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = cur;
            // swap(arr,i,minIndex);
        }
    }// ��ȡ��λ�ú󼴿ɽ���λ��

    public static void swap(int arr[], int i, int j) {
        int cur = arr[j];
        arr[j] = arr[i];
        arr[i] = cur;

    }// ��������

    // ��ӡ����
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
        System.out.print("����ǰ:");
        printArray(arr);
        selectSort(arr);
        System.out.print("�����:");
        printArray(arr);
    }

}
