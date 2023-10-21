package com.core;

public enum Brand {
	CELLO(50),PARKER(150),REYNOLDS(80);
	
	private double price;
	private Brand(int price) {
		this.price=price;
	}
	
	

	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return name()+" Price ";
	}
}
