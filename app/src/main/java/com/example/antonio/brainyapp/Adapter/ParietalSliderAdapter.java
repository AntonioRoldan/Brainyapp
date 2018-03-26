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

public class ParietalSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "DESCRIPTION",
            "DESCRIPTION",
            "FUNCTIONS",
            "LOCATION"
    };

    public String[] lst_description = {
            "The somatosensory cortex is found within the parietal lobes and is essential for processing touch sensations. For instance, the somatosensory cortex helps us to identify the location of a touch sensation and to discriminate between sensations such as temperature and pain. Neurons in the parietal lobes receive touch, visual and other sensory information from a part of the brain called the thalamus.",
            "The thalamus relays nerve signals and sensory information between the peripheral nervous system and the cerebral cortex. " +
                    "The parietal lobes process the information and help us to identify objects by touch. The parietal lobes work in concert with other areas of the brain, such as the motor cortex and visual cortex, to perform certain tasks. Opening a door, combing your hair, and placing your lips and tongue in the proper position to speak all involve the parietal lobes. These lobes are also important for understanding spatial orientation and for proper navigation. Being able to identify the position, location and movement of the body and its parts is an important function of the parietal lobes.",
                    "Among its functions are: Cognition, information processing, touch Sensation (Pain, Temperature, etc.) Understanding spatial orientation, movement coordination, speech, visual perception, reading and writing, mathematical computation",
            "Directionally, the parietal lobes are superior to the occipital lobes and posterior to the central sulcus and frontal lobes. The central sulcus is the large deep groove or indentation that separates the parietal and frontal lobes"
    };

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(239, 85, 85),
            Color.rgb(1, 188, 212),
            Color.rgb(110, 49, 49)
    };

    public ParietalSliderAdapter(Context context){
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