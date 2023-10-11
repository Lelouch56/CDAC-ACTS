package day5;
import java.util.*;

public class main {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	Fruit[] basket=new Fruit[n];
	int cur=0;
	boolean flag=true;
	
	do {
		System.out.println("1. Add Mango\n2. Add Orange\n3. Add Apple\n4.Exit");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			if(cur<n) {
			basket[cur]=new Mango(sc.next(),sc.nextDouble(),sc.next(),true);
			cur+=1;
			}
			else {flag=false;}
			break;
			
		case 2:
			if(cur<n) {
				basket[cur]=new Orange(sc.next(),sc.nextDouble(),sc.next(),true);
				cur+=1;
				}
			else {flag=false;}
			break;
		case 3:
			if(cur<n) {
				basket[cur]=new Apple(sc.next(),sc.nextDouble(),sc.next(),true);
				cur+=1;
				}
			else {flag=false;}
			break;
		default:
			flag=false;
			break;
		}
	}
	while(flag==true);
	
	for(Fruit i:basket) {
		if (i instanceof Mango) {
			Mango m=(Mango)i;
			System.out.println(m);
		}
		else if (i instanceof Apple) {
			Apple a=(Apple)i;
			System.out.println(a);
		}
		else {
			Orange o=(Orange)i;
			System.out.println(o);
		}
		
	}
	
	sc.close();
	
}
}
