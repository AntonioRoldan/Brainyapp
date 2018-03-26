package com.example.antonio.brainyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.antonio.brainyapp.Intros.Brainstem_intro;
import com.example.antonio.brainyapp.Intros.Cerebellum_intro;
import com.example.antonio.brainyapp.Intros.Cerebrum_intro;
import com.example.antonio.brainyapp.Intros.Corpus_callosum_intro;

public class Menu extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);
    }

    public void transition(final Intent event, String text){
        Toast.makeText(Menu.this, text, Toast.LENGTH_SHORT).show();
        startActivity(event);
    }

    private void setSingleEvent(GridLayout mainGrid){
        final Intent cerebrum = new Intent(this, Cerebrum_intro.class);
        final Intent brainstem = new Intent(this, Brainstem_intro.class);
        final Intent corpus_callosum = new Intent(this, Corpus_callosum_intro.class);
        final Intent cerebellum = new Intent(this, Cerebellum_intro.class);
        for(int i = 0; i<mainGrid.getChildCount(); i++){
            final int final_index = i;
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    if(final_index == 0){
                        transition(cerebrum,"Accessing cerebrum");
                    }
                    if (final_index == 1){
                        transition(brainstem,"Accessing brainstem");
                    }
                    if (final_index == 2){
                        transition(corpus_callosum, "Accessing corpus callosum");
                    }
                    if (final_index == 3){
                        transition(cerebellum, "Accessing cerebellum");
                    }
                }

            });
        }
    }

}
