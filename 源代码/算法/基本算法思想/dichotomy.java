//二分
public class dichotomy {
    public static void main(String[] args) {
        int maxlen = 10;
        int maxvalue = 100;
        int testTimes = 100000;
        System.out.println("测试开始");
        for (int i = 0; i < testTimes; i++) {
            int arr[] = randomArray(maxlen, maxvalue);
            int ans = oneMinIndex(arr);
            if (!check(arr, i)) {
                printArray(arr);
                System.out.println(ans + " ");
                break;
            }
        }
        System.out.println("测试结束");
    }

    public static boolean find(int[] arr, int num) {
        // 在有序数组里寻找num
        if (arr == null || arr.length == 0) {
            return false;
        } else {
            int L = 0;
            // 左边界
            int R = arr.length - 1;
            // 右边界
            while (L <= R) {
                int mid = (L + R) / 2;
                // 中间位置
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
        // 寻找>=num最左的位置索引
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            // ans更新
            int mid = (L + R) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                // 把中间位置拿到
                R = mid - 1;
                // 将mid-arr.length位置的数全部忽略
            } else {// arr[mid]<num
                L = mid + 1;
                // 将0-mid位置的数全部忽略

            }

        }
        return ans;
    }

    public static int oneMinIndex(int[] arr) {
        // 寻找局部最小索引
        // 数组无序，相邻的数不相等

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
        // 以上是边界条件
        int L = 0;
        int R = N - 1;

        while (L < R - 1) {
            int mid = (L + R) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                // 如果二分位置正好小于左边也小于右边就返回当前值
                // 左>当前 当前<右

                return mid;

            } else {
                // 这里剩下三种情况
                // 左>当前 当前>右
                // 左<当前 当前<右
                // 左<当前 当前>右
                if (arr[mid] > arr[mid - 1]) {
                    // 左<当前 当前<右
                    // 左<当前 当前>右
                    // 如果二分位置大于左边位置就更新R位置
                    R = mid - 1;
                } else {
                    L = mid + 1;
                }

            }

            // if (arr[mid] > arr[mid - 1]) {
            // // 左<当前 当前<右
            // // 左<当前 当前>右
            // // 如果二分位置大于左边位置就更新R位置
            // R = mid - 1;
            // continue;
            // }
            // if (arr[mid] > arr[mid + 1]) {
            // // 左>当前 当前>右
            // // 如果二分位置大于右边位置就更新L位置
            // L = mid + 1;
            // continue;
            // }

        }
        return arr[L] < arr[R] ? L : R;
    }

    public static int[] randomArray(int maxLen, int maxValue) {
        // 生成随机数组
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
