package Linkedlist.LinkedlistExercise;

public class linkedlistDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        // �����ڵ�
        linklist list = new linklist();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        list.add(node6);
        // ��ӽڵ�
        list.show();
        // ��ʾ�ڵ�
    }

}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

class linklist {
    private Node head = new Node(0);

    // ����ͷ�ڵ�
    public void add(Node node) {
        Node tmp = head;
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
        // ��tmp.nextָ���ҵ�node
        // ��node�ĵ�ַ����tmp.next
    }

    public void show() {
        if (head.next == null) {
            System.out.println("����Ϊ��");
        }

        Node tmp = head.next;
        while (true) {
            if (tmp == null) {
                // ��Ϊtmpʼ��Ϊָ��ǰ�ڵ����һ��λ�ã�����һ��λ��Ϊnullʱ����ǰ����null��
                System.out.println("��ʾ���");
                break;
            }
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }

    }
}