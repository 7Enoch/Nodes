package Linkedlist.LinkedlistExercise;
/*
 * 1.��������Ч�ڵ�����(������ͷ�ڵ�)
 * 2.���ҵ���������k���ڵ�
 * 3.������ת
 * 4.��β��ͷ��ӡ������
 * 5.�ϲ���������ĵ������ϲ�����Ȼ����
 */

public class Linkedlistquestion {
    public static void main(String[] args) {
        Node N1 = new Node(1);
        Node N2 = new Node(1);
        Node N3 = new Node(1);
        Node N4 = new Node(1);
        Node N5 = new Node(1);
        Node N6 = new Node(1);

        linklist list = new linklist();
        list.add(N1);
        list.add(N2);
        list.add(N3);
        list.add(N4);
        list.add(N5);
        list.add(N6);

        int a = list.getLength();
        System.out.println(a);
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}

// �ȶ���ڵ�
class linklist {
    private Node headNode = new Node(0);
    private Node tmp;

    // ����ͷ�ڵ�
    public void add(Node node) {
        // ��ӽڵ�
        tmp = headNode;
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    public int getLength() {
        int c = 0;
        if (headNode.next == null) {
            return 0;
        }
        tmp = headNode.next;
        while (true) {
            if (tmp == null) {
                break;
            }
            tmp = tmp.next;
            c++;
        }
        return c;
    }
}
// �ٶ�������