package com.tester;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.core.Material;
import com.core.OS;
import com.core.Product;
import com.productExceptionHandling.ProductManagementException;
import com.productUtility.ProductUtility;

public class ProductManagementTester {

    public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();
        
        try (Scanner sc = new Scanner(System.in)) {
            boolean flag = true;

            while (flag) {
                System.out.println("Select option:\n1. Add new product\n2. Update stock of a product\n"
                        + "3. Set discount of 10% for non-Apple products\n"
                        + "4. Remove products never sold once listed in 9 months\n"
                        + "5. Sort products by discounts\n"
                        + "6. Display all products\n"
                        + "0. Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        try {
                            // Add new product
                            System.out.print("Enter product name: ");
                            String name = sc.next();
                            System.out.print("Enter product brand: ");
                            String brand = sc.next();
                            System.out.print("Enter OS (ANDROID or WINDOWS): ");
                            String os = sc.next();
                            System.out.print("Enter material (PLASTIC or METAL): ");
                            String material = sc.next();
                            System.out.print("Enter stock: ");
                            int stock = sc.nextInt();
                            System.out.print("Enter price: ");
                            double price = sc.nextDouble();

                            ProductUtility.addNewProduct(name, brand, os, material, stock, price, productMap);
                            System.out.println("Product added successfully.");
                        } catch (ProductManagementException e) {
                            System.out.println(e.getMessage());
                            sc.nextLine(); // Consume newline
                        }
                        break;
                    case 2:
                        try {
                            // Update stock of a product
                            System.out.print("Enter product ID: ");
                            int productId = sc.nextInt();
                            System.out.print("Enter new stock: ");
                            int newStock = sc.nextInt();

                            ProductUtility.updateStock(productId, newStock, productMap);
                            System.out.println("Stock updated successfully.");
                        } catch (ProductManagementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            // Set discount of 10% for non-Apple products
                            ProductUtility.setDiscountForNonAppleProducts(productMap);
                            System.out.println("Discount set successfully.");
                        } catch (ProductManagementException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        // Remove products never sold once listed in 9 months (placeholder logic)
                        ProductUtility.removeUnusedProducts(productMap);
                        System.out.println("Unused products removed.");
                        break;
                    case 5:
                        // Sort products by discounts
                        ProductUtility.sortProductsByDiscount(productMap);
                        break;
                    case 6:
                    	ProductUtility.displayAllProducts(productMap);
                    	break;
                    case 0:
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}