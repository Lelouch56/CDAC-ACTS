package linkedList;

public class LinkedList {
	private Node head;
	static class Node{
		private int data;
		private Node next;
		
		Node(){
			data=0;
			next=null;
		}
		Node(int val){
			data=val;
			next=null;
		}
				
	}
	
	public void addFirst(int val) {
		Node newNode =new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void addLast(int val) {
		Node newNode =new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
			Node trav=head;
			while(trav.next!=null) {
				trav=trav.next;
				
			}
			trav.next=newNode;
		}
	}

	public void display() {
		Node trav =head;
		
		while(trav!=null) {
			System.out.println(trav.data);
			trav=trav.next;
		}
	}
	
	public int removeFirst() {
		int temp=-1;
		if(head==null) {
			System.out.println("List is empty...");
			
		}
		else if(head.next==null) {
			temp=head.data;
			head=null;
			
		}
		else {
			temp=head.data;
			head=head.next;
		}
		
		return temp;
	}
	
	public int removeLast() {
		int temp=-1;
		if(head==null) {
			System.out.println("List is empty...");
			
		}
		else if(head.next==null) {
			temp=head.data;
			head=null;
			
		}
		else {
			Node trav=head;
			while(trav.next.next!=null) {
				trav=trav.next;
			}
			temp=trav.next.data;
			trav.next=null;
		}
		
		return temp;
	}
	
	public void addAtIndex(int index,int val) {
		Node temp=new Node(val);
		if(index==0) {
			addFirst(val);
		}
		else {
			Node trav=head;
			for(int i=0;i<index-1;i++) {
				if(trav.next!=null)
					trav=trav.next;
				else {
					break;
				}
			}
			temp.next=trav.next;
			trav.next=temp;
			
		}
	}
	
	public void removeAtIndex(int index) {
		if(head==null) {
			System.out.println("List is empty...");
		}
		else if(index==0) {
			head=head.next;
		}
		else {
			Node trav=head;
			for(int i=0;i<index-1;i++) {
				if(trav.next!=null)
					trav=trav.next;
				else {
					break;
				}
			}
			trav.next=trav.next.next;
			
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
//		l1.addFirst(1);
//		l1.addFirst(4);
//		l1.addFirst(2);
//		l1.addFirst(3);
//		
		l1.addLast(1);
		l1.addLast(4);
		l1.addLast(2);
		l1.addLast(3);
		l1.addAtIndex(0, 49);
		l1.display();
		
		l1.removeAtIndex(4);
		l1.display();
		

	}

}
