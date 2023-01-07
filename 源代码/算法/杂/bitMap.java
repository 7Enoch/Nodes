
import java.util.HashSet;

public class bitMap {
    public static void main(String[] args) {
        System.out.println("���Կ�ʼ");
        int max = 100000;// ���뵽���ϵ����ֵ
        int testtime = 10000000;// ���Դ���
        bitMap bitMap = new bitMap(max);// �ҵķ���
        HashSet<Integer> set = new HashSet<>();// ϵͳ����
        for (int i = 0; i < testtime; i++) {
            int num = (int) (Math.random() * (max + 1));// num��Χ��[0-max]
            double decide = Math.random();// ������
            if (decide < 0.333) {// ����֮һ�ĸ���ͬʱ��һ����
                bitMap.add(num);
                set.add(num);
            } else if (decide < 0.666) {// ����֮һ�ĸ���ͬʱɾ��һ����
                bitMap.delete(num);
                set.remove(num);
            } else {// ����֮һ�ĸ���ͬʱ��ѯһ����
                if (bitMap.contains(num) != set.contains(num)) {
                    System.out.println("������!");
                    System.out.println("�ҵķ���ֵ��" + bitMap.contains(num) + "\nϵͳ����ֵ��" + set.contains(num));
                    break;
                }

            }
        }
        for (int num = 0; num <= max; num++) {
            if (bitMap.contains(num) != set.contains(num)) {
                System.out.println("������!");
                System.out.println("�ҵķ���ֵ��" + bitMap.contains(num) + "\nϵͳ����ֵ��" + set.contains(num));

            }
        }
        System.out.println("���Խ���");
    }

    private long[] bits;// ������Ǽ���

    // ���췽��һ��Ҫ�õ����ֵ
    public bitMap(int max) {
        // �������ֵ�����Ҫ���ٿռ�
        // +64��ԭ�������maxС����64��ֻ��Ҫһλ�����ӵĻ����Ϊ0
        // >>�ȼ��ڳ���
        bits = new long[(max + 64) >> 6];
        // �ȼ�bits = new long[(max + 64) / 64];
    }

    // ���һ�����ֵ�bits����
    public void add(int num) {
        // 1.���ж�����������ڼ����е���һ��long �������num >> 6
        // ����:�������������64�����Ǿ���Ҫnum(64)/64==1;�õ���1������Ҫ�ļ���λ��
        // ��Ϊ0-63 ��Ҫ����(����bits[0])��һλ������
        // 64-127��Ҫ����(����bits[1])�ڶ�λ������
        // 2.Ѱ��num��64λ�е��ĸ�λ�� �������num & 63
        // 3.��λ�÷Ž������� ������� |= 1L <<
        // ��һ��64λ����1 �������Ƶ�2���õ���λ�ô�С �͵õ���һ��00..001000..0
        // �ٽ�����������ϵ�����|һ�� ����������
        // 1L����1������long��64λ
        bits[num >> 6] |= 1L << (num & 63);

    }

    public void delete(int num) {
        // bits[num >> 6]�ҵ������еĵڼ�����

        // 1L << (num & 63)�õ�num�ڼ������е�λ�� �õ���һ��00..001000..0
        // ȡ���õ�11..110111..1
        // �����뼯����&(��0��0),����λ�ñ��ֲ��� ����numλ�ûᱻ����ΪΪ0
        bits[num >> 6] &= ~(1L << (num & 63));
    }

    public boolean contains(int num) {
        // ���������ϲ�ѯ�� Ҫ�ǲ�Ϊ0�ʹ��� Ϊ0�Ͳ�����
        return ((bits[num >> 6]) & (1L << (num & 63))) != 0;

    }

}