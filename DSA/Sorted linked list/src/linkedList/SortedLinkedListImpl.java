package linkedList;

public class SortedLinkedListImpl  implements SortedLinkedList {
	private Node head;
	
	static class Node{
		private int data;
		private Node next;
		
		public Node(int data)
		{
		this.data=data;
		this.next = null;
		}
	}
	
	public void insert(int data) {
		Node newNode=new Node(data);
		if(head==null||head.data >= newNode.data) {
			//newNode.data = data;
			newNode.next=head;
			head=newNode;
		}
		else {
			Node current=head;
			while(current.next!=null  && current.next.data < data) {
				current=current.next;
			}
			newNode.next=current.next;
			current.next=newNode;
		}
	}
	
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty..");
		}
		
		else {
		while(current.next!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
		}
	}
}