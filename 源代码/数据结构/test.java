public class test {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 9 };
        int[] Help = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // ÏÈ½«Help¸³Öµ
            if (i == 0) {
                Help[i] = arr[i];
            } else {
                Help[i] = Help[i - 1] + arr[i];
            }
        }
        for (int i = 0; i < Help.length; i++) {
            System.out.print(" " + Help[i]);

        }

    }

}
