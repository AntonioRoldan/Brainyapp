package com.example.antonio.brainyapp.Sliders;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.brainyapp.Adapter.FrontalSliderAdapter;
import com.example.antonio.brainyapp.R;

public class FrontalSlider extends AppCompatActivity {

    private ViewPager viewPager;
    private FrontalSliderAdapter frontalSliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontal_slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        frontalSliderAdapter = new FrontalSliderAdapter(this);
        viewPager.setAdapter(frontalSliderAdapter);
    }
}
