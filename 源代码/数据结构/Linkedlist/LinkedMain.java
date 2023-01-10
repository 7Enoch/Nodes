package 数据结构.Linkedlist;

public class LinkedMain {
	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(9);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Linkedlist link = new Linkedlist();
		link.add(n1);
		link.add(n2);
		link.add(n3);
		link.add(n4);
		link.add(n5);
		link.add(n6);
		System.out.println("=========单链表==========");
		link.show();	
		System.out.println();
		link.find(4);
		link.delete(4);
		link.show();
		System.out.println();
		link.find(4);
		link.insert(4,2);
		link.show();
		System.out.println();
		link.find(4);
		System.out.println("=========================");
	
	}

}
