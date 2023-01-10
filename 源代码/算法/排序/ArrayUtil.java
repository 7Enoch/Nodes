public class ArrayUtil {
    // ������С����������麯��
    public int[] generteRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) (Math.random() * (maxSize + 1))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue * (Math.random())) - (maxValue * (Math.random())));
        }
        return arr;
    }

    // �ж������Ƿ���Ⱥ���
    public boolean isEqual(int[] a, int[] b) {
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

    // ������麯��
    public void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // �������麯��
    public int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int help[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            help[i] = arr[i];
        }
        return help;
    }

    public void swap(int[] arr, int a, int b) {

        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

    }

}
