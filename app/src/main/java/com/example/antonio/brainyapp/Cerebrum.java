package com.example.antonio.brainyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.antonio.brainyapp.Adapter.CerebrumAdapter;
import com.example.antonio.brainyapp.Models.Section;

import java.util.ArrayList;
import java.util.List;

public class Cerebrum extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Section> listSections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_recycler);

        recyclerView = (RecyclerView) findViewById(R.id.sectionrecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listSections = new ArrayList<>();
        String[] cerebrum_parts = {"What is the cerebrum?", "Frontal lobe", "Parietal lobe", "Temporal lobe", "Occipital lobe", "Community facts", "Add a new fact"};
        String[] descriptions = {"The cerebrum also known as the telencephalon, is the largest and most highly developed part of the human brain. It encompasses about two-thirds of the brain mass and lies over and around most of teh structures of the brain. The cerebrum is dvidied into right and left hemispheres that are connected by the corpus callosum. The outer portion of the cerebrum is covered by a thin layer of gray tissue called the cerebral cortex. The cerebral cortex is in turn divided into four lobes: frontal lobes, parietal lobes, temporal lobes, occipital lobes.", "The frontal lobes are one of the four main lobes or regions of the cerebral cortex. They are positioned at the front-most region of the cerebral cortex and are involved in movement, decision-making, problem-solving, and planning. The frontal lobes can be subdivided into two main areas: the prefrontal cortex and the motor cortex. The motor cortex contains the premotor cortex and primary motor cortex." +
                "The prefrontal cortex is responsible for personality expression and the planning of complex cognitive behaviors. The premotor and primary motor areas of the motor cortex contain nerves that control the execution of voluntary muscle movement.",  "The parietal lobes are involved in a number of important functions in the body. One of the main functions is to receive and process sensory information from all over the body.", "The temporal lobes are one of the four main lobes or regions of the cerebral cortex. They are located in the largest division of the brain known as the forebrain (prosencephalon). As with the three other brain lobes (frontal,  occipital, and parietal), there is one temporal lobe located in each brain hemisphere. The temporal lobes play an important role in organizing sensory input, auditory perception, language and speech production, as well as memory association and formation", "The occipital lobes are one of the four main lobes or regions of the cerebral cortex. These lobes are vital for receiving, processing, and interpreting sensory information. The occipital lobes are positioned at the posterior region of the cerebral cortex and are the main centers for visual processing. " +
                "In addition to the occipital lobes, posterior portions of the parietal lobes and temporal lobes are also involved in visual perception.", "See what the community shared", "Contribute to the community"};
        for(int i = 0; i < cerebrum_parts.length; i++){
            Section listSection;
            listSection = new Section(
                    cerebrum_parts[i],
                    descriptions[i]
            );
            listSections.add(listSection);
            adapter = new CerebrumAdapter(listSections, this);
            recyclerView.setAdapter(adapter);
        }
    }
}

