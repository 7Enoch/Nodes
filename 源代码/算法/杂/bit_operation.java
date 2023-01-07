public class bit_operation {
    public static void main(String[] args) {
        bit_operation test = new bit_operation();
        System.out.println(test.multi(1, 229));
    }

    public int addition(int a, int b) {// �ӷ�

        int sum = a;// �õ�a
        while (b != 0) {
            sum = a ^ b; // ����λ�����Ϣ sum
            b = (a & b) << 1;// ��λ��Ϣ b b->b'
            a = sum; // ����λ�����Ϣ a a->a'
        }
        return sum;
    }

    public int negNum(int n) {// �෴������
        return (addition(~n, 1));
    }

    public int minus(int a, int b) {// ���Ǽ���b���෴�� ~b+1����b���෴��
        return addition(a, negNum(b));
    }

    public int multi(int a, int b) {
        int ans = 0;
        while (b != 0) {// bҪ�ǵ���0�������0
            if ((b & 1) != 0) {// �жϵ�ǰb�����һλ�ǲ���0
                ans = addition(ans, a);// ������0�ͼ�a
            }
            a = a << 1;// aÿ�ζ������������ƶ�һλ
            b = b >>> 1;// ÿһ��ѭ��b���ƶ�һλ��Ŀ�����ƶ����һλ�����������ж�
        }
        return ans;
    }

}
