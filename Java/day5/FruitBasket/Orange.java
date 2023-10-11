package day5;

public class Orange extends Fruit {
	
	public Orange(String color,double weight,String name,boolean fresh) {
		super(color,weight,name,fresh);
	}
	
	public String taste() {
		return "sour";
	}
	
	public void juice() {
		System.out.println("Orange extracting juice");
	}

}
