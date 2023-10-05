import java.util.Scanner;
 class DoubleCmp{
	
	public static void main(String [] args){
	double num1,num2;
	Scanner sc= new Scanner(System.in);
	if (sc.hasNextDouble()){
		num1=sc.nextDouble();
		if (sc.hasNextDouble()){
			num2=sc.nextDouble();
			System.out.println("Average is : "+(num1+num2)/2);
	}
	
	}
	
	
	}
 
 }
