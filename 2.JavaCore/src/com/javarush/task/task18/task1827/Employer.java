package com.javarush.task.task18.task1827;

public class Employer {

    private String productName;
    private Float price;
    private Integer quantity;

    public Employer(String productName, Float price, Integer quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
