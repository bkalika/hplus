package com.bkalika.gql.hplus.controller;

import com.bkalika.gql.hplus.data.Product;

public class ProductInput {
    private String id;
    private String name;
    private int size;
    private String variety;
    private double price;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product getProductEntity() {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setSize(size);
        product.setVariety(variety);
        product.setPrice(price);
        product.setStatus(status);
        return product;
    }
}
