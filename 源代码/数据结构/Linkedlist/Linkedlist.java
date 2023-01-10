package ���ݽṹ.Linkedlist;

public class Linkedlist {
	private Node head = new Node();
	


	// ���
	public void add(Node n) {
		Node temp = head;
		// ��headλ�ÿ�ʼ����
		while (true) {

			if (temp.next == null) {
				temp.next = n;
				break;
			}
			temp = temp.next;
		}
	}

	// ��ʾ
	public void show() {
		Node temp = head.next;
		// ��head��һ��λ�ÿ�ʼ����
		if(isEmpty()) {
			System.out.println("����Ϊ��");
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

	// �п�
	public boolean isEmpty() {
		return head.next == null;
	}
	//���Ե�ǰλ���Ƿ�Ϊ����β��
	public boolean isLast(int position) {
		Node temp = head.next;
		int i = 0;
		if(isEmpty()) {
			System.out.println("����Ϊ��");
			return true;
		}
		while(i<position) {
			temp = temp.next;	
			i++;
		}
		return temp==null;
	}
	//Ѱ��
	public void find(int position) {
		Node temp = head.next;
		int count = 1;
		if(isEmpty()) {
			System.out.println("����Ϊ��");
			return;
		}
		while(count<position) {
			count++;
			temp = temp.next;
			
		}
		System.out.println(position+"λ���ϵ�ֵ��:"+temp.value);	
	}
	//ɾ��
	public void delete(int position) {
		Node temp = head;
		int count = 1;
		if(isEmpty()) {
			System.out.println("����Ϊ��");
			return;
		}
		while(count<position) {
			count++;
			temp = temp.next;
			//temp = xxx.next ��ָ temp�ƶ���˭��ָ�����
		}
		temp.next = temp.next.next;
		//temp.next = xxx.next.next ��ָ����ڵ�ָ��˭��ָ��
		
	}
	//����
	public void insert(int position,int value) {
		if(isEmpty()) {
			System.out.println("����Ϊ��");
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

//����һ���ڵ�
class Node {
	Node next;
	int value;

	public Node(int value) {
		this.value = value;

	}
	public Node() {
		
	}
	
}