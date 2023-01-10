package 数据结构.Linkedlist;

public class Linkedlist {
	private Node head = new Node();
	


	// 添加
	public void add(Node n) {
		Node temp = head;
		// 从head位置开始遍历
		while (true) {

			if (temp.next == null) {
				temp.next = n;
				break;
			}
			temp = temp.next;
		}
	}

	// 显示
	public void show() {
		Node temp = head.next;
		// 从head下一个位置开始遍历
		if(isEmpty()) {
			System.out.println("链表为空");
			return;
		}
		while (true) {
			if (temp == null) {
				break;
			}
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
	}

	// 判空
	public boolean isEmpty() {
		return head.next == null;
	}
	//测试当前位置是否为链表尾部
	public boolean isLast(int position) {
		Node temp = head.next;
		int i = 0;
		if(isEmpty()) {
			System.out.println("链表为空");
			return true;
		}
		while(i<position) {
			temp = temp.next;	
			i++;
		}
		return temp==null;
	}
	//寻找
	public void find(int position) {
		Node temp = head.next;
		int count = 1;
		if(isEmpty()) {
			System.out.println("链表为空");
			return;
		}
		while(count<position) {
			count++;
			temp = temp.next;
			
		}
		System.out.println(position+"位置上的值是:"+temp.value);	
	}
	//删除
	public void delete(int position) {
		Node temp = head;
		int count = 1;
		if(isEmpty()) {
			System.out.println("链表为空");
			return;
		}
		while(count<position) {
			count++;
			temp = temp.next;
			//temp = xxx.next 是指 temp移动到谁的指针后面
		}
		temp.next = temp.next.next;
		//temp.next = xxx.next.next 是指链表节点指向谁的指针
		
	}
	//插入
	public void insert(int position,int value) {
		if(isEmpty()) {
			System.out.println("链表为空");
			return;
		}
		Node temp = head;
		int count = 1;
		
		while(count<position) {
			count++;
			temp = temp.next;
			
		}
		Node ntmp = new Node(value);
		ntmp.next = temp.next;
		temp.next = ntmp;
		
	}
}

//定义一个节点
class Node {
	Node next;
	int value;

	public Node(int value) {
		this.value = value;

	}
	public Node() {
		
	}
	
}