package com.example.antonio.brainyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.antonio.brainyapp.Adapter.BrainstemAdapter;
import com.example.antonio.brainyapp.Models.Section;

import java.util.ArrayList;
import java.util.List;

public class Brainstem extends AppCompatActivity {

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
        String[] corpus_collosum_parts = {"What is the brainstem?", "Community facts", "Add a new fact"};
        String[] descriptions = {"The brainstem is the region of the brain that connects the cerebrum with the spinal cord. It consists of the midbrain, medulla oblongata and the pons. Motor and sensory neurons travel through the brainstem allowing for the relay of signals between the brain and the spinal cord. Most cranial nerves are found in the brainstem. The brainstem coordinates motor control signals sent from the brain to the body.", "See what the community shared", "Contribute to the community"};
        for(int i = 0; i < corpus_collosum_parts.length; i++){
            Section listSection;
            listSection = new Section(
                    corpus_collosum_parts[i],
                    descriptions[i]
            );
            listSections.add(listSection);
            adapter = new BrainstemAdapter(listSections, this);
            recyclerView.setAdapter(adapter);
        }
    }
}