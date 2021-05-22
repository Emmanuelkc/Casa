package com.example.casa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class viewpagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] bedrooms = {R.drawable.sittingroome,R.drawable.bedroomq,R.drawable.dinninga,R.drawable.bathrooma,R.drawable.corridor};


    public viewpagerAdapter(Context context){

        this.context = context;
    }
    @Override
    public int getCount() {
        return bedrooms.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.customlayout, null);

        ImageView imageView = (ImageView)view.findViewById(R.id.myimageview);
        imageView.setImageResource(bedrooms[position]);

        ViewPager viewPager = (ViewPager)container;
        viewPager.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager)container;
        View view = (View)object;
        viewPager.removeView(view);
    }


    }

