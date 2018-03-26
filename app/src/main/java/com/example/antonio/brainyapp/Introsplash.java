package com.example.antonio.brainyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class Introsplash extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introsplash);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation intro = AnimationUtils.loadAnimation(this, R.anim.introanimation);
        tv.startAnimation(intro);
        iv.startAnimation(intro);
        final Intent menu = new Intent(this, Menu.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(menu);
                    finish();
                }
            }
        };
        timer.start();
    }
}
