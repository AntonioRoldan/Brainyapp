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


public class CerebrumSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "FUNCTION",
            "FUNCTION II",
            "LOCATION"
    };

    public String[] lst_description = {
        "The cerebral cortex handles a number of important brain functions. Among these function is the processing of sensory information by the cortex lobes. Limbic system brain structures located beneath the cerebrum also assist in sensory information processing. These structures include the amygdala, thalamus, and hippocampus. Limbic system structures use sensory information to process emotions and connect our emotions with memories. ",
                "The frontal lobes of the cerebral cortex are responsible for complex cognitive planning and behaviors, language comprehension, speech production, and the planning and control of voluntary muscle movement. Nerve connections with the spinal cord and brainstem allow the cerebrum to receive sensory information from the peripheral nervous system. The cerebrum processes this information and relays signals that produce the appropriate response.",
            "Directionally, the cerebrum and the cortex that covers it is the uppermost part of the brain. It is the anterior portion of the forebrain and is superior to other brain structures such as the pons, cerebellum and medulla oblongata."
    };

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(1, 188, 212),
            Color.rgb(110, 49, 49)
    };

    public CerebrumSliderAdapter(Context context){
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