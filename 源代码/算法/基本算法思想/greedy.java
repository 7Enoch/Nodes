import java.util.Arrays;

//贪心
public class greedy {

    public static void main(String[] args) {
        System.out.println("海盗船:最多能装下" + pirateBoat() + "件");
        int arr[] = { 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 };
        int n = 5;
        System.out.print("能不能种下" + n + "朵花：");
        growFlowers(arr, n);

    }

    public static int pirateBoat() {
        // 海盗船问题
        /*
         * 有一个商船，上面有一些货物，
         * 它们的重量不一样但是价值一样，现在被海盗船打劫，
         * 海盗船有承重限制
         * ：怎么样让海盗船能拿走最多的货物,能有几件
         */

        int[] ms = { 10, 2, 14, 67, 9, 4, 3, 6, 7 }; // 商船的货物
        int pb = 300; // 海盗船能承重大小
        int tmp = 0;
        int n = 0;
        Arrays.sort(ms);

        for (int i = 0; i < ms.length; i++) {
            tmp += ms[i];
            if (tmp > pb) {
                break;
            }
            n++;

        }
        return n;
    }

    public static void growFlowers(int arr[], int n) {
        /*
         * 一个很长的花坛，一部分已经种植了花，另一部分却没有，
         * 花不能种植在相邻的地块上，否则两个都会死
         * ：给你一个整数数组表示花坛，用若干个0，1组成，
         * 0表示没种花，1表示种花，给一个整数n，给出能不能种上n朵花
         */
        int count = 0;
        if (n == 0) {
            System.out.println("能");
        }
        for (int i = 0; i < arr.length;) {
            if (arr[i] == 1) {
                // 目标处有花
                i += 2;
            } else if (i > 0 && arr[i - 1] == 1) {
                // 当前的前一个位置有花
                i++;

            } else if (i + 1 < arr.length && arr[i + 1] == 1) {
                // 当前的后一个位置有花
                i += 3;
            } else {
                // 左右都没花
                arr[i] = 1;
                count++;
                i += 2;
            }

        }
        if (count >= n) {
            System.out.println("能");
        } else {
            System.out.println("不能");
        }
    }

    public static void planet() {
        /*
         * 给定一个整数数组，表示在同一行的行星
         * 每一个元素，其绝对值表示行星的大小
         * 正负表示移动方向，正往右移动，负往左移动
         * 每一颗行星速度相同
         * 碰撞规则：两个行星碰撞较小的行星会爆炸
         * 如果大小相同两颗都会爆炸
         * 两个移动方向相同的行星永远不会发生碰撞
         */
    }

}