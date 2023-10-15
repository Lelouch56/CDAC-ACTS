package day7;

public class StackGrowable implements StackI {
	private int top=-1;
	private final int size;
	private Customer[] arr;
	
	public StackGrowable(int s) {
		size=s;
		arr=new Customer[size];
		
	}
	
	public void push(Customer a) {
		if (isFull()) {
			int t=0;
			Customer [] temp=new Customer[arr.length*2];
			for(Customer i: arr) {
				temp[t++]=i;
			}
			
			arr=temp;
			
			arr[++top]=a;
			System.out.println(top);
			System.out.println("Element added...");
		}
		else {
			
			arr[++top]=a;
			
			System.out.println(top);
			System.out.println("Element added...");
		}
		
	};
	
	public boolean isFull() {
		if(top==(arr.length-1)) {
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
