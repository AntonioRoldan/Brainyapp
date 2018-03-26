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

public class FrontalSliderAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public String[] lst_title={
            "LOCATION AND FUNCTION",
            "BROCA'S AREA AND PREFRONTAL CORTEX",
            "PRIMARY MOTOR CORTEX",
            "CURIOSITIES"
    };

    public String[] lst_description = {
            "Directionally, the frontal lobes are located in the anterior portion of the cerebral cortex. They are directly anterior to the parietal lobes and superior to the temporal lobes. The central sulcus, a large deep groove, separates the parietal and frontal lobes. The frontal lobes are the largest brain lobes and are involved in several functions of the body including: motor functions, higher order functions, planning, reasoning, judgment ,impulse control, memory, language and speech",
            "The right frontal lobe controls activity on the left side of the body and the left frontal lobe controls activity on the right side. An area of the brain involved in language and speech production, known as Broca's area, is located in the left frontal lobe. The prefrontal cortex is the front portion of the frontal lobes and manages complex cognitive process such as memory, planning, reasoning, and problem-solving. This area of the frontal lobes functions to help us set and maintain goals, curb negative impulses, organize events in time order, and form our individual personalities.",
            "The primary motor cortex of the frontal lobes is involved in voluntary movement. It has nerve connections with the spinal cord, which enable this brain area to control muscle movements. Movement in the various areas of the body is controlled by the primary motor cortex, with each area linked to a specific region of the motor cortex. Body parts requiring fine motor control take up larger areas of the motor cortex, while those requiring simpler movements take up less space.",
            "For example, areas of the motor cortex controlling movement in the face, tongue, and hands take up more space than areas linked to the hips and trunk. The premotor cortex of the frontal lobes has neural connections with the primary motor cortex, spinal cord, and brainstem. The premotor cortex enables us to plan and perform proper movements in response to external cues. This cortical region helps to determine the specific direction of a movement."};

    public int[] lst_background_colour = {
            Color.rgb(239, 85, 85),
            Color.rgb(1, 188, 212),
            Color.rgb(110, 49, 49),
            Color.rgb(139, 35, 35)
    };
    //Color.rgb(239, 85, 85),
    //Color.rgb(1, 188, 212),
    //Color.rgb(110, 49, 49),

    public FrontalSliderAdapter(Context context){
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