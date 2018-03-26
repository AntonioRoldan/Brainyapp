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

public class OccipitalSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "LOCATION",
            "FUNCTION",
            "EXAMPLES"
    };

    public String[] lst_description = {
            "Directionally, the occipital lobes are positioned posterior to the temporal lobes and inferior to the parietal lobes. They are located in the largest division of the brain known as the forebrain (prosencephalon). Located within the occipital lobes is the primary visual cortex. This region of the brain receives visual input from the retina. These visual signals are interpreted in the occipital lobes.",
            "The occipital lobes receive and interpret visual information. Vision is the ability to detect images of visible light. The eyes transmit this information via nerve impulses to the visual cortex. The visual cortex takes this information and processes it so that we are able to determine colors, identify objects, identify shapes, and other aspects of visual perception. The visual information is then sent to the parietal lobes and temporal lobes for further processing. " +
                    "The parietal lobes use this visual information in conjunction with motor processes to perform such tasks as opening a door or brushing your teeth. " +
                    "The temporal lobes help to connect the visual information received with memories.",
            "Visual perception, colour recognition, reading, reading comprehension, depth perception, recognition of object movement"
    };

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(110, 49, 49),
            Color.rgb(1, 188, 212)
    };

    public OccipitalSliderAdapter(Context context){
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