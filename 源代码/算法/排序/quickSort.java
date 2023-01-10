import java.util.Arrays;

//��������
public class quickSort {
    static ArrayUtil utilQ = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtil utilQ = new ArrayUtil();
        int maxSize = 100;
        int maxValue = 1000;
        int timetest = 1000000;
        System.out.println("���Կ�ʼ");
        for (int i = 0; i < timetest; i++) {
            int[] arr1 = utilQ.generteRandomArray(maxSize, maxValue);
            int[] arr2 = utilQ.copyArray(arr1);
            quickSort1(arr1);
            Arrays.sort(arr2);
            if (!utilQ.isEqual(arr1, arr2)) {
                System.out.println("������");
                utilQ.printArray(arr1);
                utilQ.printArray(arr2);
                break;
            }

        }
        System.out.println("�������");
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
        // border[0]���м�����߽�
        // border[1]���м����ұ߽�
        process(arr, L, border[0] - 1);
        process(arr, border[1] + 1, R);

    }

    // ������������
    public static void splitNum1(int[] arr) {
        int lessEqualR = -1;// С�ڵ���������ұ߽�
        int index = 0;// ��ǰ�±�
        int mostR = arr.length - 1;// ��ȡ���һ������
        while (index < arr.length) {
            if (arr[index] <= arr[mostR]) {
                utilQ.swap(arr, ++lessEqualR, index++);
                // lessEqualR++;// С�ڵ�������������չ
                // index++;
            } else {
                index++;
            }

        }
    }

    public static void splitNum2(int[] arr) {
        int index = 0;// ��ǰָ��
        int less = -1;// С������ָ��
        int greater = arr.length - 1;// ��������ָ��
        int mostR = arr.length - 1;// ���ұߵĽǱ�
        while (index < greater) {
            if (arr[index] > arr[mostR]) {
                utilQ.swap(arr, index, --greater);// ��ǰ�����������ǰһ������

            } else if (arr[index] < arr[mostR]) {
                utilQ.swap(arr, index++, ++less);
            } else {
                index++;
            }

        }
        utilQ.swap(arr, greater, mostR);
    }

    // Ŀ�ĺ���
    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;// ��߽�ָ��
        int greater = R;// �ұ߽�ָ��
        int index = L;// ��ǰ��ָ��
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
        return new int[] { less + 1, greater };// ���ص����ұ߽�����
        // ����һ������ 2 4 5 2 6 6 6 6 6 7 8 7 9 7
        // ����������߽���ǵ�һ��6�ĽǱ�����һ��6�ĽǱ�
    }
}
