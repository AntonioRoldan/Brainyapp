package com.example.antonio.brainyapp.Sliders;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.brainyapp.Adapter.CerebrumSliderAdapter;
import com.example.antonio.brainyapp.R;

public class Cerebrum_slider extends AppCompatActivity{
    private ViewPager viewPager;
    private CerebrumSliderAdapter cerebrumSlideAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        cerebrumSlideAdapter = new CerebrumSliderAdapter(this);
        viewPager.setAdapter(cerebrumSlideAdapter);
    }
}
