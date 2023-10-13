package day7;

public class C implements A,B {
	public double calculate(double d1,double d2) {
		System.out.println("A");
		return d1+d2;
		
	}
	
	
	
	public static void main(String [] args) {
		C test=new C();
		double d= test.calculate(30.00,90);
		System.out.println(d);
		
	}

}
