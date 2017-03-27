package com.example.shekhar.yummyindia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mainImageSlider = (ViewPager) findViewById(R.id.mainImageSlider);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(this);
        mainImageSlider.setAdapter(adapterView);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RelativeLayout foodMenuLayout = (RelativeLayout) findViewById(R.id.foodMenuLayout);
        foodMenuLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logger.getLogger("MainActivity.class").log(Level.INFO, "Clicked on Food Menu Layout");
                Intent intent = new Intent(v.getContext(), FoodMenuActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        RelativeLayout recipesLayout = (RelativeLayout) findViewById(R.id.recipesLayout);
        recipesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logger.getLogger("MainActivity.class").log(Level.INFO, "Clicked on recipes Layout");
                Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                        "Recipes functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RelativeLayout reviewsLayout = (RelativeLayout) findViewById(R.id.reviewsLayout);
        reviewsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logger.getLogger("MainActivity.class").log(Level.INFO, "Clicked on Reviews Layout");
                Snackbar.make(getWindow().getDecorView().getRootView().findViewById(android.R.id.content),
                        "Reviews functionality has not been implemented yet.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RelativeLayout signInLayout = (RelativeLayout) findViewById(R.id.signInLayout);
        signInLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logger.getLogger("MainActivity.class").log(Level.INFO, "Clicked on Signin Layout");
                Intent intent = new Intent(v.getContext(), LoginActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }

}
