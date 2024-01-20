package com.core;

import java.time.LocalDate;

public class Product {
	private static int idCounter = 1;
    private int id;
    private String name;
    private String brand;
    private OS os;
    private Material material;
    private int stock;
    private LocalDate stockListingDate;
    private LocalDate stockUpdateDate;
    private double price;
    private double discount;

    public Product(String name, String brand, OS os, Material material, int stock, double price) {
        this.id = idCounter++;
        this.name = name;
        this.brand = brand;
        this.os = os;
        this.material = material;
        this.stock = stock;
        this.stockListingDate = LocalDate.now();
        this.stockUpdateDate = this.stockListingDate;
        this.price = price;
        this.discount = 0;
    }

    

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", os=" + os + ", material=" + material
                + ", stock=" + stock + ", stockListingDate=" + stockListingDate + ", stockUpdateDate=" + stockUpdateDate
                + ", price=" + price + ", discount=" + discount + "]";
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Product.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public OS getOs() {
        return os;
    }

    public Material getMaterial() {
        return material;
    }

    public int getStock() {
        return stock;
    }

    public LocalDate getStockListingDate() {
        return stockListingDate;
    }

    public LocalDate getStockUpdateDate() {
        return stockUpdateDate;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setStock(int stock) {
        this.stock = stock;
        this.stockUpdateDate = LocalDate.now();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public void setOs(OS os) {
		this.os = os;
	}



	public void setMaterial(Material material) {
		this.material = material;
	}



	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}



	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	 
    
	    
}
