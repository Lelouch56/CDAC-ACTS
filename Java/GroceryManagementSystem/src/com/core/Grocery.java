package com.core;
import java.time.LocalDateTime;
public class Grocery {
	private String name;
	private double price;
	private int stock;
	private LocalDateTime lastUpdated;
	
	public Grocery(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		lastUpdated= LocalDateTime.now();
	}
//	public void updateStock(int quantity) {
//		
//	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
		lastUpdated=LocalDateTime.now();
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	@Override
	public String toString() {
		return "Grocery [name=" + name + ", price=" + price + ", Stock=" + stock + ", lastUpdated=" + lastUpdated + "]";
	}
	
	
	
}
