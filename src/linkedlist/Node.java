package linkedlist;

public class Node {

	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList Program");
		
		
		LinkedList linkedList = new LinkedList();
		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);
		linkedList.print();
		linkedList.searchNode(30);
		//System.out.println(linkedList.i);
		 int popLast = linkedList.popLast();
		 System.out.println(popLast);
		
		 linkedList.print();
	}
}
