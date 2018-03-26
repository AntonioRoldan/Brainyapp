package com.example.antonio.brainyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.antonio.brainyapp.Adapter.CorpusAdapter;
import com.example.antonio.brainyapp.Models.Section;

import java.util.ArrayList;
import java.util.List;

public class Corpuscallosum extends AppCompatActivity {

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
        String[] corpus_collosum_parts = {"What is the corpus collosum?", "Community facts", "Add a new fact"};
        String[] descriptions = {"The corpus callosum is a thick band of nerve fibers that divides the cerebral cortex lobes into left and right hemispheres. It connects the left and right sides of the brain allowing for communication between both hemispherees. The corpus callosum transfers motor, sensory, and cognitive information between the brain hemispheres", "See what the community shared", "Contribute to the community"};
        for(int i = 0; i < corpus_collosum_parts.length; i++){
            Section listSection;
            listSection = new Section(
                corpus_collosum_parts[i],
                    descriptions[i]
            );
            listSections.add(listSection);
            adapter = new CorpusAdapter(listSections, this);
            recyclerView.setAdapter(adapter);
        }
    }
}
