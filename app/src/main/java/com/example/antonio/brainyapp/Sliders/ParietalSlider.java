package com.example.antonio.brainyapp.Sliders;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.brainyapp.Adapter.ParietalSliderAdapter;
import com.example.antonio.brainyapp.R;

public class ParietalSlider extends AppCompatActivity {

    private ViewPager viewPager;
    private ParietalSliderAdapter parietalLobeSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parietal_slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        parietalLobeSlider = new ParietalSliderAdapter(this);
        viewPager.setAdapter(parietalLobeSlider);
    }
}
