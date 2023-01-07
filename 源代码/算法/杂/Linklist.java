
//链表类
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

    // 单链表节点的定义
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    // 双链表节点的定义
    public static class DoubleNode {
        public int value;
        public DoubleNode next;
        public DoubleNode last;

        public DoubleNode(int value) {
            this.value = value;
        }
    }

    // 单链表反转方法
    public static Node reverselLinklist(Node head) {
        /*
         * 1.把head的下一个位置拿给next
         * 2.head的下一个位置指向pre
         * 3.pre拿到head当前位置
         * 4.head后移
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

    // 单链表k节点组内逆序
    // 单链表相加
    public static Node Linklistadd(Node l1, Node l2) {
        // 分别获取链表长度
        int len1 = Listlength(l1);
        int len2 = Listlength(l2);

        // 获取长短的链表
        Node l = len1 >= len2 ? l1 : l2;
        Node s = l == l1 ? l2 : l1;

        // 将长短链表复制一份搞事情
        Node curl = l;
        Node curs = s;

        // 为了进位准备变量
        Node last = curl;

        int carry = 0;
        int curSum = 0;

        // 短链表节点不为空
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

    // 求链表长度
    public static int Listlength(Node head) {
        int ans = 0;
        while (head != null) {
            head = head.next;
            ans++;
        }
        return ans;
    }

    // 双链表反转方法
    public static DoubleNode reverselDoubleList(DoubleNode head) {
        /*
         * 1.把head的下一个位置拿给next
         * 2.head的下一个位置指向pre
         * 3.head的上一个位置指向last
         * 3.pre拿到head当前位置
         * 4.head后移
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
