package Linkedlist.LinkedlistExercise;

public class linkedlistDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        // 创建节点
        linklist list = new linklist();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);
        list.add(node6);
        // 添加节点
        list.show();
        // 显示节点
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

    // 定义头节点
    public void add(Node node) {
        Node tmp = head;
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
        // 让tmp.next指向我的node
        // 把node的地址赋给tmp.next
    }

    public void show() {
        if (head.next == null) {
            System.out.println("链表为空");
        }

        Node tmp = head.next;
        while (true) {
            if (tmp == null) {
                // 因为tmp始终为指向当前节点的下一个位置，当下一个位置为null时，当前就是null了
                System.out.println("显示完毕");
                break;
            }
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }

    }
}