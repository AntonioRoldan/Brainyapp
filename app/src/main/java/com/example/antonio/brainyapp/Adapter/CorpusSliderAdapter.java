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

public class CorpusSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "FUNCTIONS",
            "LOCATION",
            "CURIOSITIES"
    };

    public String[] lst_description = {
            "The corpus calllosum is the largest fiber bundle in the brain, containing nearly 200 axons" +
                    "It is composed of white matter fiber tracts known as commissural fibers. It is involved in several functions of the body including:" +
                    "Communication between brain hemispheres, eye movement and vision, maintaining the balance of arousal and attention, tactile localization",
            "From anterior to posterior, the corpus callosum can be divided into regions known as the rostrum, genu, body, and splenium. The rostrum and genu connect the left and right frontal lobes of the brain. The body and splenium connect the hemispheres of the temporal lobes." +
                    "The corpus callosum plays an important role in vision by combining the separate halves of our visual field, which process images separately in each hemisphere. It also allows us to identify the objects we see by connecting the visual cortex with the language centers of the brain. In addition, the corpus callosum transfers" +
                    "tactile information between the brain hemispheres to enable us to locate touch",
            "Agenesis of the corpus collosum is a condition in which an individual is born with a partial corpus callosum or no corpus callosum at all" +
                    "The corpus callosum typically develops between 12 to 20 weeks and continues to experience structural changes even into adulthood. AgCC can be cause by a number of factors including chromosome mutations, genetic inheritance, prenatal infections, and other causes that are unknown." +
                    "Individuals with AgCC may experience cognitive and communication developmental delays. They may have difficulty understanding language and social cues." +
                    "Researches discovered that the brain compensates for the missing corpus by rewiring itself and establishing new nerve connections between the brain hemispheres. "
    };

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(1, 188, 212),
            Color.rgb(110, 49, 49)
    };

    public CorpusSliderAdapter(Context context){
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