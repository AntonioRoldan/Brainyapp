package com.example.antonio.brainyapp.Sliders;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.brainyapp.Adapter.FrontalSliderAdapter;
import com.example.antonio.brainyapp.Adapter.OccipitalSliderAdapter;
import com.example.antonio.brainyapp.Adapter.ParietalSliderAdapter;
import com.example.antonio.brainyapp.R;

public class OccipitalSlider extends AppCompatActivity {

    private ViewPager viewPager;
    private OccipitalSliderAdapter occipitalLobeSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.occipital_slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        occipitalLobeSlider = new OccipitalSliderAdapter(this);
        viewPager.setAdapter(occipitalLobeSlider);
    }
}
