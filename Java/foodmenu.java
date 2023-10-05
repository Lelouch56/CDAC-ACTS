import java.util.Scanner;
class FoodMenu{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int bill=0;
		int cost;
		int q;
		int n;
		do{System.out.println("Enter\n1.Dosa\n2.Samosa\n3.Idli\n4.Poha\n5.Vadapav\n6.Breadpattice\n7.Upma\n8.ABC\n9.XYZ\n10.Exit\n");
			n=sc.nextInt();
		switch(n){
			
			
			case 1:	
					cost=30;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 2:	
					cost=40;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 3:
					cost=50;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 4:	
					cost=60;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 5:	
					cost=70;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 6:
					cost=80;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 7:
					cost=90;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 8:
					cost=55;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			case 9:
					cost=38;
					System.out.println("Mention the Quntity : ");
					q=sc.nextInt();
					bill=bill+q*cost;
					break;
			default:
					System.out.println("Printing bill : ");
					break;
					
		}
		}
		while(n<10);
		System.out.println(bill);

	}
	
}
