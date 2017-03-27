package com.example.shekhar.yummyindia;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by shekhar on 3/27/17.
 */

public class FoodItemsListAdapter extends ArrayAdapter<FoodItem> {

    private List<FoodItem> foodItems;

    public FoodItemsListAdapter(Context context, int resource, List<FoodItem> objects) {
        super(context, resource, objects);
        foodItems = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.food_menu_item, parent, false);
        }

        FoodItem foodItem = foodItems.get(position);

        TextView nameText = (TextView) convertView.findViewById(R.id.nameText);
        nameText.setText(foodItem.getName());

        TextView descriptionText = (TextView) convertView.findViewById(R.id.descriptionText);
        descriptionText.setText(foodItem.getDescription());

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String price = formatter.format(foodItem.getPrice());
        TextView priceText = (TextView) convertView.findViewById(R.id.priceText);
        priceText.setText(price);

        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView);
        Bitmap bitmap = getBitmapFromAsset(foodItem.getFoodId(), foodItem.getFoodType());
        iv.setImageBitmap(bitmap);

        return convertView;
    }

    private Bitmap getBitmapFromAsset(String foodId, String foodType) {
        AssetManager assetManager = getContext().getAssets();
        InputStream stream = null;

        try {
            stream = assetManager.open(foodType + "/"+ foodId + ".jpeg");
            return BitmapFactory.decodeStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
