package com.example.antonio.brainyapp.Sliders;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.antonio.brainyapp.Adapter.CorpusSliderAdapter;
import com.example.antonio.brainyapp.R;

public class Corpuscallosum_slider extends AppCompatActivity {
    private ViewPager viewPager;
    private CorpusSliderAdapter corpusSlideAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        corpusSlideAdapter = new CorpusSliderAdapter(this);
        viewPager.setAdapter(corpusSlideAdapter);
    }
}
