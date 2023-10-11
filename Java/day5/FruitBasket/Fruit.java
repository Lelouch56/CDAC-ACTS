package day5;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruit(String color,double weight,String name,boolean fresh) {
		this.color=color;
		this.weight=weight;
		this.fresh=fresh;
		this.name=name;
	}
	
	public String taste() {
		return "no specific taste";
	}
	
	public String toString() {
		return "name "+name+" color "+color+" weight "+weight	;	
	}

}
