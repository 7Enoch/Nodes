package ���ݽṹ.Stack;

public class Stack {
	private Node head = new Node(); 
	//�п�
	public boolean isEmpty() {
		return head.next==null;
	}
	//��ջ
	public void pop() {
		if(isEmpty()) {
			System.out.println("ջ��");
			return;
		}
		Node temp = head;
		head.next = head.next.next;

	}
	//��ջ
	public void push(int value) {	
		Node temp = head;	 
		Node ntmp = new Node(value);
		while(true) {
			if(temp==head.next) {//head����һ��λ��Ҫ����Ԫ������ ��Ԫ�����������ƶ�
				ntmp.next=temp;//��Ԫ��ָ��head����һ��λ��
				head.next = ntmp;//headָ����Ԫ��λ��
				return;
			}
			temp = temp.next;
			
		}
		
	}
	//���ջ��Ԫ��
	public void top() {
		if(isEmpty()) {
			System.out.println("ջ��");
			return;
		}
		Node temp = head.next;
		System.out.println(temp.value);
		
	}
	//���ջ����Ԫ��
	public void show() {
		if(isEmpty()) {
			System.out.println("ջ��");
			return;
		}
		Node temp = head.next;
		while(true) {
			if(temp==null) {
				return;
			}
			System.out.println(temp.value);
			temp =temp.next;
		}
		
	}
	public void topandpop() {
		Node temp = head;
		while(true) {
			if(temp == head.next) {
				System.out.println("ջ��Ԫ����:"+temp.value+"\n������:");
				head.next = temp.next;
				return;
				
				
			}
			temp = temp.next;
		}
	}

}

class Node {
	Node next;
	int value;
	public Node(int value){
		this.value=value;
	}
	public Node(){
		
	}
}