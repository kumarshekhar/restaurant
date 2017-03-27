package com.example.shekhar.yummyindia;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by shekhar on 3/26/17.
 */

public class AndroidImageAdapter extends PagerAdapter {

    Context mContext;

    AndroidImageAdapter(Context context) {
        this.mContext = context;
    }

    private int[] mainSliderImagesId = new int[]{
            R.drawable.restaurant, R.drawable.wine, R.drawable.fries, R.drawable.ice_cream
    };

    @Override
    public int getCount() {
        return mainSliderImagesId.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mImageView.setImageResource(mainSliderImagesId[i]);
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int i, Object obj) {
        ((ViewPager) container).removeView((ImageView) obj);
    }

}
