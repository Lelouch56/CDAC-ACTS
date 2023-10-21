package com.core;

import java.time.LocalDate;

public class Pen {
	private static int id =0;
	private Brand brand;
	private String color;
	private Material material;
	private int stock;
	private LocalDate lastUpdatedDate;
	private final LocalDate listingDate;
	private double price;
	public static int getId() {
		return id;
	}
	
	public void currentPen() {
		System.out.println(brand+" "+color+" "+"Available : "+stock+"Price : "+price);
	}
	public void updateStock(int quantity) {
		stock+=quantity;
		lastUpdatedDate=LocalDate.now();
	}
	
	public double setDiscount(double disc) {
		price=price*(100-disc)/100;
		return price;
	}
	
	public static void setId(int id) {
		Pen.id = id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getListingDate() {
		return listingDate;
	}

	
	public Pen(Brand brand, String color, Material material, int stock, double price,LocalDate listingDate) {
		super();
		this.id=id+1;
		this.brand = brand;
		this.color = color;
		this.material = material;
		this.stock = stock;
		this.price = price;
		this.listingDate=listingDate;
		this.lastUpdatedDate=listingDate;
	}
	
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", color=" + color + ", material=" + material + ", stock=" + stock
				+ ", lastUpdatedDate=" + lastUpdatedDate + ", listingDate=" + listingDate + ", price=" + price + "]";
	}
	
	
	
}
