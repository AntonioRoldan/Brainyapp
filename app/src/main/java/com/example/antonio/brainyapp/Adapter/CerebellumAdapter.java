package com.example.antonio.brainyapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.antonio.brainyapp.Sliders.Cerebellum_slider;
import com.example.antonio.brainyapp.Models.Section;
import com.example.antonio.brainyapp.R;

import java.util.List;

/**
 * Created by Antonio on 25/12/2017.
 */

public class CerebellumAdapter extends RecyclerView.Adapter<CerebellumAdapter.ViewHolder>{

    private List<Section> listSections;
    private Context context;


    public CerebellumAdapter(List<Section> listSections, Context context) {
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
        final Intent slider = new Intent(this.context, Cerebellum_slider.class);
        Section listSection = listSections.get(position);
        holder.textViewHead.setText(listSection.getName());
        holder.textViewDesc.setText(listSection.getDescription());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (index){
                    case 0: context.startActivity(slider);
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
