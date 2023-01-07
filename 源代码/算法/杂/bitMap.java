
import java.util.HashSet;

public class bitMap {
    public static void main(String[] args) {
        System.out.println("测试开始");
        int max = 100000;// 加入到集合的最大值
        int testtime = 10000000;// 测试次数
        bitMap bitMap = new bitMap(max);// 我的方法
        HashSet<Integer> set = new HashSet<>();// 系统方法
        for (int i = 0; i < testtime; i++) {
            int num = (int) (Math.random() * (max + 1));// num范围是[0-max]
            double decide = Math.random();// 概率数
            if (decide < 0.333) {// 三分之一的概率同时加一个数
                bitMap.add(num);
                set.add(num);
            } else if (decide < 0.666) {// 三分之一的概率同时删除一个数
                bitMap.delete(num);
                set.remove(num);
            } else {// 三分之一的概率同时查询一个数
                if (bitMap.contains(num) != set.contains(num)) {
                    System.out.println("出错了!");
                    System.out.println("我的方法值是" + bitMap.contains(num) + "\n系统方法值是" + set.contains(num));
                    break;
                }

            }
        }
        for (int num = 0; num <= max; num++) {
            if (bitMap.contains(num) != set.contains(num)) {
                System.out.println("出错了!");
                System.out.println("我的方法值是" + bitMap.contains(num) + "\n系统方法值是" + set.contains(num));

            }
        }
        System.out.println("测试结束");
    }

    private long[] bits;// 这个就是集合

    // 构造方法一定要拿到最大值
    public bitMap(int max) {
        // 利用最大值算出需要多少空间
        // +64的原因是如果max小于了64就只需要一位，不加的话结果为0
        // >>等价于除法
        bits = new long[(max + 64) >> 6];
        // 等价bits = new long[(max + 64) / 64];
    }

    // 添加一个数字到bits集合
    public void add(int num) {
        // 1.先判断这个数字属于集合中的哪一个long 具体操作num >> 6
        // 举例:假如这个数字是64，我们就需要num(64)/64==1;得到的1就是需要的集合位置
        // 因为0-63 需要集合(数组bits[0])第一位来储存
        // 64-127需要集合(数组bits[1])第二位来储存
        // 2.寻找num在64位中的哪个位置 具体操作num & 63
        // 3.将位置放进集合中 具体操作 |= 1L <<
        // 拿一个64位整数1 让它左移第2步拿到的位置大小 就得到了一个00..001000..0
        // 再将这个数跟集合的数或|一下 就添加完成了
        // 1L就是1不过是long型64位
        bits[num >> 6] |= 1L << (num & 63);

    }

    public void delete(int num) {
        // bits[num >> 6]找到集合中的第几个数

        // 1L << (num & 63)拿到num在集合数中的位置 得到了一个00..001000..0
        // 取反得到11..110111..1
        // 将它与集合数&(有0就0),其他位置保持不变 但是num位置会被更改为为0
        bits[num >> 6] &= ~(1L << (num & 63));
    }

    public boolean contains(int num) {
        // 集合数与上查询数 要是不为0就存在 为0就不存在
        return ((bits[num >> 6]) & (1L << (num & 63))) != 0;

    }

}