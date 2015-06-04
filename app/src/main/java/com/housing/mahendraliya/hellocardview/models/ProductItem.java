package com.housing.mahendraliya.hellocardview.models;

/**
 * Created by mahendraliya on 04/06/15.
 */
public class ProductItem {
    private String productName;
    private String categoryName;

    public ProductItem(String productName, String categoryName) {
        this.productName = productName;
        this.categoryName = categoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
