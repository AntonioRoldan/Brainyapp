package com.example.antonio.brainyapp.Intros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.antonio.brainyapp.Cerebellum;
import com.example.antonio.brainyapp.R;

public class Cerebellum_intro extends AppCompatActivity {
    private Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent cerebellum = new Intent(this, Cerebellum.class);
        setContentView(R.layout.activity_cerebellum);
        explore = (Button) findViewById(R.id.explore);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cerebellum);
            }
        });
    }
}
