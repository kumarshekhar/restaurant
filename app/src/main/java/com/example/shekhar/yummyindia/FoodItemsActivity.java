package com.example.shekhar.yummyindia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class FoodItemsActivity extends BaseActivity {

    private List<FoodItem> foodItems = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items);
        System.out.println("Inside FoodItemsActivity");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String type = getIntent().getStringExtra("food_type");
        if ("soups".equals(type)) {
            this.setTitle("Soups");
        }
        else if("desserts".equals(type)){
            this.setTitle("Desserts");
        }
        else if("beverages".equals(type)){
            this.setTitle("Beverages");
        }
        foodItems = FoodItemsDataProvider.getFoodItemForType(type);

        FoodItemsListAdapter adapter = new FoodItemsListAdapter(this, R.layout.food_menu_item, foodItems);

        ListView lv = (ListView) findViewById(R.id.soupsList);
        lv.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
