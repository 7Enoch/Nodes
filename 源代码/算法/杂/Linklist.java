
//������
public class Linklist {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1 = reverselLinklist(n1);
        while (n1 != null) {
            System.out.print(n1.value + " ");
            n1 = n1.next;
        }

    }

    // ������ڵ�Ķ���
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    // ˫����ڵ�Ķ���
    public static class DoubleNode {
        public int value;
        public DoubleNode next;
        public DoubleNode last;

        public DoubleNode(int value) {
            this.value = value;
        }
    }

    // ������ת����
    public static Node reverselLinklist(Node head) {
        /*
         * 1.��head����һ��λ���ø�next
         * 2.head����һ��λ��ָ��pre
         * 3.pre�õ�head��ǰλ��
         * 4.head����
         */
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    // ������k�ڵ���������
    // ���������
    public static Node Linklistadd(Node l1, Node l2) {
        // �ֱ��ȡ������
        int len1 = Listlength(l1);
        int len2 = Listlength(l2);

        // ��ȡ���̵�����
        Node l = len1 >= len2 ? l1 : l2;
        Node s = l == l1 ? l2 : l1;

        // ������������һ�ݸ�����
        Node curl = l;
        Node curs = s;

        // Ϊ�˽�λ׼������
        Node last = curl;

        int carry = 0;
        int curSum = 0;

        // ������ڵ㲻Ϊ��
        while (curs != null) {
            curSum = curl.value + curs.value + carry;
            curl.value = (curSum % 10);
            carry = curSum / 10;
            last = curl;
            curl = curl.next;
            curs = curs.next;
        }
        while (curl != null) {
            curSum = curl.value + carry;
            curl.value = (curSum % 10);
            carry = curSum / 10;
            last = curl;
            curl = curl.next;

        }
        if (carry != 0) {
            last.next = new Node(1);
        }
        return l;
    }

    // ��������
    public static int Listlength(Node head) {
        int ans = 0;
        while (head != null) {
            head = head.next;
            ans++;
        }
        return ans;
    }

    // ˫����ת����
    public static DoubleNode reverselDoubleList(DoubleNode head) {
        /*
         * 1.��head����һ��λ���ø�next
         * 2.head����һ��λ��ָ��pre
         * 3.head����һ��λ��ָ��last
         * 3.pre�õ�head��ǰλ��
         * 4.head����
         */
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

}
