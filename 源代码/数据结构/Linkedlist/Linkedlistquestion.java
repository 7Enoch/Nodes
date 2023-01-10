package Linkedlist.LinkedlistExercise;
/*
 * 1.求单链表有效节点数字(不包含头节点)
 * 2.查找单链表倒数第k个节点
 * 3.单链表反转
 * 4.从尾到头打印单链表
 * 5.合并两个有序的单链表，合并后依然有序
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

// 先定义节点
class linklist {
    private Node headNode = new Node(0);
    private Node tmp;

    // 定义头节点
    public void add(Node node) {
        // 添加节点
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
// 再定义链表