package com.productUtility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

import com.core.Material;
import com.core.OS;
import com.core.Product;
import com.productExceptionHandling.ProductManagementException;

public class ProductUtility {

	public static void addNewProduct(String name, String brand, String os, String material, int stock, double price,
			Map<Integer, Product> productMap) throws ProductManagementException {
// Validate non-negative stock quantity
		if (stock < 0) {
			throw new ProductManagementException("Stock quantity must be non-negative.");
		}

// Validate positive price
		if (price <= 0) {
			throw new ProductManagementException("Price must be a positive value.");
		}

		try {
// Validate os and material enums
			OS validatedOS = OS.valueOf(os.toUpperCase());
			Material validatedMaterial = Material.valueOf(material.toUpperCase());

// Create a new Product with validated inputs
			Product newProduct = new Product(name, brand, validatedOS, validatedMaterial, stock, price);
			productMap.put(newProduct.getId(), newProduct);
		} catch (IllegalArgumentException e) {
// Separate catch blocks for brand and material exceptions
			if (e.getMessage().contains("Brand")) {
				throw new ProductManagementException("Invalid brand provided.");
			} else if (e.getMessage().contains("Material")) {
				throw new ProductManagementException("Invalid material provided.");
			} else {
// Generic exception handling
				throw new ProductManagementException("Invalid os or material provided.");
			}
		}
	}

	public static void updateStock(int productId, int newStock, Map<Integer, Product> productMap)
			throws ProductManagementException {
		Product product = productMap.get(productId);
		if (product == null) {
			throw new ProductManagementException("Product with ID " + productId + " not found.");
		}

		product.setStock(newStock);
		product.setStockUpdateDate(LocalDate.now());
	}

	public static void setDiscountForNonAppleProducts(Map<Integer, Product> productMap)
			throws ProductManagementException {
		for (Product product : productMap.values()) {
			if (!"Apple".equalsIgnoreCase(product.getBrand())) {
				product.setDiscount(10); // 10% discount for products with a brand other than "Apple"
			}
		}
	}

	public static void removeUnusedProducts(Map<Integer, Product> productMap) {
	    Iterator<Map.Entry<Integer, Product>> iterator = productMap.entrySet().iterator();
	    LocalDate currentDate = LocalDate.now();

	    while (iterator.hasNext()) {
	        Map.Entry<Integer, Product> entry = iterator.next();
	        Product product = entry.getValue();

	        // Calculate the time difference between lastUpdated and currentDate in months
	        long monthsDifference = ChronoUnit.MONTHS.between(product.getStockUpdateDate(), currentDate);

	        // 9 months as the threshold for considering a product as unused
	        if (monthsDifference >= 9) {
	            iterator.remove(); // Remove the product from the map
	        }
	    }
	}


	public static void sortProductsByDiscount(Map<Integer, Product> productMap) {
		productMap.values().stream().sorted(Comparator.comparingDouble(Product::getDiscount))
				.forEach(System.out::println);
	}
	
	public static void displayAllProducts(Map<Integer, Product> productMap) {
        System.out.println("All Products:");
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }
}