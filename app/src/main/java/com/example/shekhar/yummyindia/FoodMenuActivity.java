package com.example.shekhar.yummyindia;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FoodMenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RelativeLayout soupsLayout = (RelativeLayout) findViewById(R.id.soupsLayout);
        soupsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                        "Soups functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent = new Intent(v.getContext(), FoodItemsActivity.class);
                intent.putExtra("food_type", "soups");
                v.getContext().startActivity(intent);
            }
        });

        RelativeLayout dessertsLayout = (RelativeLayout) findViewById(R.id.dessertsLayout);
        dessertsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                        "Desserts functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent = new Intent(v.getContext(), FoodItemsActivity.class);
                intent.putExtra("food_type", "desserts");
                v.getContext().startActivity(intent);
            }
        });

        RelativeLayout beveragesLayout = (RelativeLayout) findViewById(R.id.beveragesLayout);
        beveragesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                        "Beverages functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent = new Intent(v.getContext(), FoodItemsActivity.class);
                intent.putExtra("food_type", "beverages");
                v.getContext().startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
