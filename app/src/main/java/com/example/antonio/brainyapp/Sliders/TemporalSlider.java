package com.example.antonio.brainyapp.Sliders;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.antonio.brainyapp.Adapter.TemporalSliderAdapter;
import com.example.antonio.brainyapp.R;

/**
 * Created by Antonio on 06/01/2018.
 */

public class TemporalSlider extends AppCompatActivity{
    private ViewPager viewPager;
    private TemporalSliderAdapter TemporalSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temporal_slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        TemporalSlider = new TemporalSliderAdapter(this);
        viewPager.setAdapter(TemporalSlider);
    }
}
