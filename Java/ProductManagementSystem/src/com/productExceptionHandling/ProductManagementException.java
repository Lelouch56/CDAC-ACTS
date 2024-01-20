package com.productExceptionHandling;

public class ProductManagementException extends Exception {
    public ProductManagementException(String errMsg) {
        super(errMsg);
    }
}