package day7;

public class Stack implements StackI {
	private int top=-1;
	private final int size;
	private Customer[] arr;
	
	public Stack(int s) {
		size=s;
		arr=new Customer[size];
		
	}
	
	public void push(Customer a) {
		if (isFull()) {
			System.out.println("Stack is full..");
		}
		else {
			System.out.println("Element added...");
			arr[++top]=a;
			System.out.println(top);
		}
		
	};
	
	public boolean isFull() {
		if(top==(size-1)) {
			return true;
		}
		return false;
	};
	
	public Customer pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty..");
			return null;
		}	
		return arr[top--];
	};
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	};
	
		

}
