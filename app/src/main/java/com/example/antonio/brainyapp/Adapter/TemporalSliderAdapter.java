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

public class TemporalSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "FUNCTION",
            "FUNCTION II",
            "LOCATION"
    };

    public String[] lst_description = {
            "Limbic system structures of the temporal lobe are responsible for regulating many of our emotions, as well as forming and processing memories. " +
                    "The amygdala controls many of the autonomic responses associated with fear. It regulates our fight or flight response, as well as helps us develop a healthy sense of fear through fear conditioning. ",
                    "The amygdala receives sensory information from the thalamus and other areas of the cerebral cortex.  In addition, the olfactory cortex is located in the temporal lobe. As such, the temporal lobes are involved in organizing and processing sensory information.",
                    "Another limbic system structure, the hippocampus, aids in memory formation and connecting our emotions and senses, such as smell and sound, to memories. The temporal lobe aids in auditory processing and the perception of sound. They are also vital to language comprehension and speech. " +
                    "An area of the brain called Wernicke's Area is found in the temporal lobes. This area helps us to process words and understand spoken language.",
            "Directionally, the temporal lobes are anterior to the occipital lobes and inferior to the frontal lobes and parietal lobes. A large deep groove known as the Fissure of Sylvius separates the parietal and temporal lobes.",
    };

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(1, 188, 212),
            Color.rgb(110, 49, 49)
    };
    //Color.rgb(239, 85, 85),
    //Color.rgb(1, 188, 212),
    //Color.rgb(110, 49, 49),

    public TemporalSliderAdapter(Context context){
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