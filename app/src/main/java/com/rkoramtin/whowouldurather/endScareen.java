package com.rkoramtin.whowouldurather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class endScareen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_scareen);
        int winnerId=getIntent().getExtras().getInt("finalId");
        ImageView imageView=findViewById(R.id.imageView3);
        imageView.setImageResource(winnerId);
    }
}
