package com.example.antonio.brainyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.antonio.brainyapp.Adapter.CerebellumAdapter;
import com.example.antonio.brainyapp.Adapter.CorpusAdapter;
import com.example.antonio.brainyapp.Models.Section;

import java.util.ArrayList;
import java.util.List;


public class Cerebellum extends AppCompatActivity {

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
        String[] corpus_collosum_parts = {"What is the cerebellum?", "Community facts", "Add a new fact"};
        String[] descriptions = {"In Latin, the word cerebellum means little brain. The cerebellum is the area of the hindbrain that controls movement coordination, balance, equilibrium and muscle tone. Like the cerebral cortex the cerebellum is comprised of white matter and a thick outer layer of densely folded gray matter. The folded outer layer of the cerebellum has smaller and more compact folds than those of the cerebral cortex. The cerebellum contains hundreds of millions of neurons for processing data. It relays information between body muscles and areas of the cerebral cortex that are involved in motor control", "See what the community shared", "Contribute to the community"};
        for(int i = 0; i < corpus_collosum_parts.length; i++){
            Section listSection;
            listSection = new Section(
                    corpus_collosum_parts[i],
                    descriptions[i]
            );
            listSections.add(listSection);
            adapter = new CerebellumAdapter(listSections, this);
            recyclerView.setAdapter(adapter);
        }
    }
}