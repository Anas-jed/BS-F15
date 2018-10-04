package com.example.arslan.bs_app.models;

public class Product {

    private long id;
    private String name;
    private String detail;
    private int price;

    public Product(long id, String name, String detail, int price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
