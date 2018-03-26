package com.example.antonio.brainyapp.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.antonio.brainyapp.R;


public class CerebellumSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "STRUCTURE",
            "FUNCTION"
    };

    public String[] lst_description = {
            "The cerebellum can be subdivided into three lobes that coordinate information received from the spinal cord and from different areas of the brain. The anterior lobe receives input primarily from the spinal cord. The posterior lobe receives input primarily from the brainstem and cerebral cortex. The flocculonodular lobe receives input from the cranial nuclei of the vestibular nerve. The vestibular nerve is a component of the vestibulocochlear cranial nerve. The transmission of nerve input and output signals from the cerebellum occurs through bundles of nerve fibers called cerebral peduncles. These nerve bundles run through the midbrain connecting the forebrain and hindbrain.",
            "The cerebellum processes information from the brain and peripheral nervous system for balance and body control. Activities such as walking, hitting a ball, and playing a video game all involve the cerebellum. The cerebellum helps us to have fine motor control, while inhibiting involuntary movement. It coordinates and interprets sensory information in order to produce fine motor movements. It also calculates and corrects informational discrepancies in order to produce the desired movement."
    };

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(1, 188, 212)
    };

    public CerebellumSliderAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount(){
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return (view==(LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_background_colour[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((LinearLayout) object);
    }
}