package binarySearch;

public class BinarySearch {
	
	static int search(int target,int[]arr) {
		
			int start=0;
			int end=arr.length;
			while(start<=end) {
				int mid=(start+end)/2;
				if(arr[mid]==target) {
					return mid;
				}
				if(arr[0]<arr[arr.length-1]) {
				if(arr[mid]<target) {
					start=mid+1;
					
				}
				else {
					end=mid-1;
				}
				
				}
				else {
					if(arr[mid]<target) {
						end=mid-1;
						
					}
					else {
						start=mid+1;
					}
				}
				
			}
		
		
		
		
		
		return -1;
	}
	
	public static void main(String []args) {
	int[]arr= {1,2,3,4,5,69,78,89,600};
	
	int index=search(89, arr);
	System.out.println(index);	
	int [] arr1= {600,89,78,69,5,4,3,2,1};	
	index=search(89, arr1);
	System.out.println(index);	
		
		
	}
}
