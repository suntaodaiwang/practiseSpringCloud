package com.example.orderservice.pojo;

public class Order {
    private String id;
    private String userId;

    private String name;

    private String price;

    private String num;

    public String getId() {
        return id;
    }

    public Order(String id, String userId, String name, String price, String num) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
