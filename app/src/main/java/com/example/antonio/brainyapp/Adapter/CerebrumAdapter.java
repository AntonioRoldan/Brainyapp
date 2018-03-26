package com.example.antonio.brainyapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.antonio.brainyapp.Sliders.Cerebrum_slider;
import com.example.antonio.brainyapp.Sliders.FrontalSlider;
import com.example.antonio.brainyapp.Sliders.OccipitalSlider;
import com.example.antonio.brainyapp.Sliders.ParietalSlider;
import com.example.antonio.brainyapp.Sliders.TemporalSlider;
import com.example.antonio.brainyapp.Models.Section;
import com.example.antonio.brainyapp.R;

import java.util.List;

public class CerebrumAdapter extends RecyclerView.Adapter<CerebrumAdapter.ViewHolder>{

    private List<Section> listSections;
    private Context context;

    public CerebrumAdapter(List<Section> listSections, Context context) {
        this.listSections = listSections;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_sections, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        final int index = position;
        final Intent cerebrumSlider = new Intent(this.context, Cerebrum_slider.class);
        final Intent frontalLobeSlider = new Intent(this.context, FrontalSlider.class);
        final Intent parietalLobeSlider = new Intent(this.context, ParietalSlider.class);
        final Intent temporalLobeSlider = new Intent(this.context, TemporalSlider.class);
        final Intent occipitalLobeSlider = new Intent(this.context, OccipitalSlider.class);
        final Section listSection = listSections.get(position);
        holder.textViewHead.setText(listSection.getName());
        holder.textViewDesc.setText(listSection.getDescription());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listSection.getName() == "What is the cerebrum?"){
                    context.startActivity(cerebrumSlider);
                } else if(listSection.getName() == "Frontal lobe"){
                    context.startActivity(frontalLobeSlider);
                } else if(listSection.getName() == "Parietal lobe"){
                    context.startActivity(parietalLobeSlider);
                } else if(listSection.getName() == "Temporal lobe"){
                    context.startActivity(temporalLobeSlider);
                } else if(listSection.getName() == "Occipital lobe"){
                    context.startActivity(occipitalLobeSlider);
                }
            }
        });
    }

    @Override
    public int getItemCount(){
        return listSections.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDesc;
        public LinearLayout linearLayout;

        public ViewHolder(View itemview) {
            super(itemview);
            textViewHead = (TextView) itemview.findViewById(R.id.textViewHeader);
            textViewDesc = (TextView) itemview.findViewById(R.id.textViewDescription);
            linearLayout = (LinearLayout) itemview.findViewById(R.id.LinearLayout);
        }
    }

}
