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

public class BrainstemSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "FUNCTION",
            "COMPOSITION",
            "COMPOSITION II"
    };

    public String[] lst_description = {
            "In addition to linking the cerebrum and spinal cord, the brainstem also connects the cerebrum with the cerebellum. The cerebellum is important for regulating functions such as movement coordination, balance, equilibrium, and muscle tone. It is positioned above the brainstem and beneath the occipital lobes of the cerebral cortex. Nerve tracts traveling through the brainstem relay signals from the cerebellum to areas of the cerebral cortex that are involved in motor control. This allows for the coordination of fine motor movements needed for activities such as walking or playing video games.",
            "The brainstem is composed of the midbrain and portions of the hindbrain, specifically the pons and medulla. A major function of the midbrain is to connect the three major brain divisions: forebrain, midbrain, and hindbrain. Major structures of the midbrain include the tectum and cerebral peduncle. The tectum is composed of rounded bulges of brain matter that are involved in visual and auditory reflexes. The cerebral peduncle consists of large bundles of nerve fiber tracts that connect the forebrain to the hindbrain. ",
            "The hindbrain is composed of two subregions known as the metencephalon and myelencephalon. The metencephalon is composed of the pons and cerebellum. The pons assists in the regulation of breathing, as well as states of sleep and arousal. The cerebellum relays information between muscles and the brain. The myelencephalon consists of the medulla oblongata and functions to connect the spinal cord with higher brain regions. The medulla also helps to regulate autonomic functions, such as breathing and blood pressure."
    };

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(1, 188, 212),
            Color.rgb(139, 0, 0)
    };

    public BrainstemSliderAdapter(Context context){
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