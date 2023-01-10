package 数据结构.Stack;

public class Stack {
	private Node head = new Node(); 
	//判空
	public boolean isEmpty() {
		return head.next==null;
	}
	//出栈
	public void pop() {
		if(isEmpty()) {
			System.out.println("栈空");
			return;
		}
		Node temp = head;
		head.next = head.next.next;

	}
	//进栈
	public void push(int value) {	
		Node temp = head;	 
		Node ntmp = new Node(value);
		while(true) {
			if(temp==head.next) {//head的下一个位置要拿新元素来顶 旧元素依次往后移动
				ntmp.next=temp;//新元素指向head的下一个位置
				head.next = ntmp;//head指向新元素位置
				return;
			}
			temp = temp.next;
			
		}
		
	}
	//输出栈顶元素
	public void top() {
		if(isEmpty()) {
			System.out.println("栈空");
			return;
		}
		Node temp = head.next;
		System.out.println(temp.value);
		
	}
	//输出栈所有元素
	public void show() {
		if(isEmpty()) {
			System.out.println("栈空");
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
				System.out.println("栈顶元素是:"+temp.value+"\n弹出后:");
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