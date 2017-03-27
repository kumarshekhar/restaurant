package com.example.shekhar.yummyindia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shekhar on 3/27/17.
 */

public class FoodItemsDataProvider {

    public static List<FoodItem> foodItemsList = new ArrayList<>();

    static {

        addFoodItem("tomato_soup",
                "soups",
                "Fresh Tomato Soup",
                "The unexpected kick of curry powder combines with the sweetness of sugar for a delicious variation of fresh tomato soup.",
                3.99);

        addFoodItem("garden_vegetable_soup",
                "soups",
                "Garden Vegetable Soup",
                "Fresh from the garden, the tastes of cabbage, carrots, celery, corn, tomatoes and " +
                        "potatoes combine for a chunky vegetable soup to warm your soul.",
                3.99);

        addFoodItem("ramen_noodle_soup",
                "soups",
                "Ramen Noodle Soup",
                "Traditional Toyko soya ramen noodle soup",
                4.99);

        addFoodItem("simple_chicken_soup",
                "soups",
                "Simple Chicken Soup",
                "Clear and watery soup with chunky vegetables (such as carrot, celery and onion), chicken, salt and pepper.",
                4.99);

        addFoodItem("gulab_jamun",
                "desserts",
                "Gulab Jamun",
                "Spongy milky balls soaked in rose scented syrup. Delicious with fresh cream, Kulfi, ice cream etc.",
                3.99);
        addFoodItem("besan_laddu",
                "desserts",
                "Besan Laddu",
                "",
                3.99);
        addFoodItem("rasgullas",
                "desserts",
                "Rasgullas",
                "",
                3.99);
        addFoodItem("kheer_rice_pudding",
                "desserts",
                "Kheer(Rice Pudding)",
                "",
                3.99);
        addFoodItem("kulfi",
                "desserts",
                "Kulfi",
                "",
                3.99);

        addFoodItem("brewed_iced_tea",
                "beverages",
                "Brewed Iced Tea",
                "Brewed fresh, daily.",
                2.99);
        addFoodItem("decadent_shakes",
                "beverages",
                "Decadent Shakes",
                "Choose from Oreo Cookie, chocolate, strawberry. Served with whipped cream.",
                2.99);
        addFoodItem("flavored_lemonades",
                "beverages",
                "Flavored Lemonades",
                "Pomegranate, raspberry, mango or kiwi flavors.",
                2.99);
        addFoodItem("frozen_lemonades",
                "beverages",
                "Frozen Lemonades",
                "Premium lemonade blended with ice and your choice of swirled mango, strawberry or wildberry puree.",
                2.99);
        addFoodItem("pepsi",
                "beverages",
                "Pepsi",
                "Pepsi",
                2.99);

    }

    private static void addFoodItem(String foodId, String foodType, String name,
                                String description, double price) {
        FoodItem item = new FoodItem(foodId, foodType, name, description, price);
        foodItemsList.add(item);
    }

    public static List<FoodItem> getFoodItemForType(String type){
        List<FoodItem> foodItems = new ArrayList<FoodItem>();
        for(FoodItem item : foodItemsList) {
            if (type.equals(item.getFoodType())){
                foodItems.add(item);
            }
        }
        return foodItems;
    }

}
