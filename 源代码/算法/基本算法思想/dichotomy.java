//����
public class dichotomy {
    public static void main(String[] args) {
        int maxlen = 10;
        int maxvalue = 100;
        int testTimes = 100000;
        System.out.println("���Կ�ʼ");
        for (int i = 0; i < testTimes; i++) {
            int arr[] = randomArray(maxlen, maxvalue);
            int ans = oneMinIndex(arr);
            if (!check(arr, i)) {
                printArray(arr);
                System.out.println(ans + " ");
                break;
            }
        }
        System.out.println("���Խ���");
    }

    public static boolean find(int[] arr, int num) {
        // ������������Ѱ��num
        if (arr == null || arr.length == 0) {
            return false;
        } else {
            int L = 0;
            // ��߽�
            int R = arr.length - 1;
            // �ұ߽�
            while (L <= R) {
                int mid = (L + R) / 2;
                // �м�λ��
                if (arr[mid] == num) {
                    return true;
                } else if (arr[mid] < num) {
                    L = mid + 1;
                } else {
                    R = mid - 1;
                }
            }
            return false;
        }
    }

    public static int findMostLeftNoMoreNumIndex(int[] arr, int num) {
        // Ѱ��>=num�����λ������
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            // ans����
            int mid = (L + R) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                // ���м�λ���õ�
                R = mid - 1;
                // ��mid-arr.lengthλ�õ���ȫ������
            } else {// arr[mid]<num
                L = mid + 1;
                // ��0-midλ�õ���ȫ������

            }

        }
        return ans;
    }

    public static int oneMinIndex(int[] arr) {
        // Ѱ�Ҿֲ���С����
        // �����������ڵ��������

        if (arr == null || arr.length == 0) {
            return -1;
        }
        int N = arr.length;
        if (arr.length == 1) {
            return 0;
        }
        if (arr[0] < arr[1]) {
            return 0;
        }
        if (arr[N - 1] < arr[N - 2]) {
            return N - 1;
        }
        // �����Ǳ߽�����
        int L = 0;
        int R = N - 1;

        while (L < R - 1) {
            int mid = (L + R) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                // �������λ������С�����ҲС���ұ߾ͷ��ص�ǰֵ
                // ��>��ǰ ��ǰ<��

                return mid;

            } else {
                // ����ʣ���������
                // ��>��ǰ ��ǰ>��
                // ��<��ǰ ��ǰ<��
                // ��<��ǰ ��ǰ>��
                if (arr[mid] > arr[mid - 1]) {
                    // ��<��ǰ ��ǰ<��
                    // ��<��ǰ ��ǰ>��
                    // �������λ�ô������λ�þ͸���Rλ��
                    R = mid - 1;
                } else {
                    L = mid + 1;
                }

            }

            // if (arr[mid] > arr[mid - 1]) {
            // // ��<��ǰ ��ǰ<��
            // // ��<��ǰ ��ǰ>��
            // // �������λ�ô������λ�þ͸���Rλ��
            // R = mid - 1;
            // continue;
            // }
            // if (arr[mid] > arr[mid + 1]) {
            // // ��>��ǰ ��ǰ>��
            // // �������λ�ô����ұ�λ�þ͸���Lλ��
            // L = mid + 1;
            // continue;
            // }

        }
        return arr[L] < arr[R] ? L : R;
    }

    public static int[] randomArray(int maxLen, int maxValue) {
        // �����������
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        if (len > 0) {
            arr[0] = (int) (Math.random() * maxValue);
        }
        for (int i = 1; i < len; i++) {
            do {
                arr[i] = (int) (Math.random() * maxValue);

            } while (arr[i] == arr[i - 1]);
        }
        return arr;
    }

    public static boolean check(int[] arr, int minIndex) {
        if (arr.length == 0) {
            return minIndex == -1;
        }
        int left = minIndex - 1;
        int right = minIndex + 1;
        boolean leftBigger = left >= 0 ? arr[left] > arr[minIndex] : true;
        boolean rigthBigger = right < arr.length ? arr[right] > arr[minIndex] : true;
        return leftBigger && rigthBigger;

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + "");
        }
        System.out.println();
    }
}
