//�鲢����
public class mergeSort {
    public static void main(String[] args) {
        ArrayUtil utilM = new ArrayUtil();
        int maxsize = 100;
        int maxvalue = 100;
        int timetest = 10000;
        System.out.println("���Կ�ʼ");
        for (int i = 0; i < timetest; i++) {

            int[] arr1 = utilM.generteRandomArray(maxsize, maxvalue);
            int[] arr2 = utilM.copyArray(arr1);

            mergeSort1(arr1);
            mergeSort2(arr2);
            if (!utilM.isEqual(arr1, arr2)) {
                System.out.println("������");
                utilM.printArray(arr1);
                utilM.printArray(arr2);
                break;
            }

        }
        System.out.println("���Խ���");
    }

    // �ݹ�ʵ��
    public static void mergeSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    // �������������������arr[L...R]�����򣬵ݹ�ʵ��
    public static void process(int[] arr, int L, int R) {

        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);// ȡ�м���
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);

    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];// ����L��R������ô���ĸ�������
        int i = 0;
        int p1 = L;// ָ����ߵ�ָ��
        int p2 = M + 1;// ָ���ұߵ�ָ��
        // ������ͬʱԽ��
        while (p1 <= M && p2 <= R) {// ���߶�ûԽ��ʱ
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {// �ұ�Խ��ʱִ��
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {// ���Խ��ʱִ��
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];// �ӿ�ʼ���������齫��������һ��һ����ֵ
        }
    }

    // �ǵݹ�ʵ��
    public static void mergeSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int step = 1;// ����
        int N = arr.length;
        while (step < N) {// ��ֹ����Խ��
            int L = 0;

            while (L < N) {
                int M = 0;
                if (N - L >= step) {// L��N-1�ܴ���һ������
                    M = L + step - 1;
                } else {
                    M = N - 1;
                } // ��ȡ�е���

                if (M == N - 1) {// û�չ����飬û�����飬ֱ���˳�
                    break;
                }
                int R = 0;
                // �������һ����
                if (N - 1 - M >= step) {
                    R = M + step;
                } else {
                    R = N - 1;
                }
                merge(arr, L, M, R);
                if (R == N - 1) {
                    break;
                } else {
                    L = R + 1;// ָ����һ�����鿪ͷ
                }
            }
            if (step > (N / 2)) {// ��step�ı��������ֹ���
                break;
            } else {
                step *= 2;
            }
        }
    }
}