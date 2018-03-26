package com.example.antonio.brainyapp.Intros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.antonio.brainyapp.Cerebrum;
import com.example.antonio.brainyapp.R;

public class Cerebrum_intro extends AppCompatActivity {
    private Button explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent cerebrum = new Intent(this, Cerebrum.class);
        setContentView(R.layout.activity_cerebrum);
        explore = (Button) findViewById(R.id.explore);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cerebrum);
            }
        });
    }
}
