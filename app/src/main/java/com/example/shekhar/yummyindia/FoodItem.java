package com.example.shekhar.yummyindia;

/**
 * Created by shekhar on 3/27/17.
 */

public class FoodItem {

    private String foodId;
    private String foodType;
    private String name;
    private String description;
    private double price;

    public String getFoodId() {
        return foodId;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public FoodItem(String foodId, String foodType, String name, String description, double price) {
        this.foodId = foodId;
        this.foodType = foodType;
        this.name = name;
        this.description = description;
        this.price = price;
    }

}
