package com.example.antonio.brainyapp.Sliders;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.antonio.brainyapp.Adapter.CerebellumSliderAdapter;
import com.example.antonio.brainyapp.R;

public class Cerebellum_slider extends AppCompatActivity{
    private ViewPager viewPager;
    private CerebellumSliderAdapter CerebellumSliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cerebellum_slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        CerebellumSliderAdapter = new CerebellumSliderAdapter(this);
        viewPager.setAdapter(CerebellumSliderAdapter);
    }
}
