package com.example.antonio.brainyapp.Sliders;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.antonio.brainyapp.Adapter.BrainstemSliderAdapter;
import com.example.antonio.brainyapp.R;

public class Brainstem_slider extends AppCompatActivity{
    private ViewPager viewPager;
    private BrainstemSliderAdapter brainstemSliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brainstem_slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        brainstemSliderAdapter = new BrainstemSliderAdapter(this);
        viewPager.setAdapter(brainstemSliderAdapter);
    }
}
