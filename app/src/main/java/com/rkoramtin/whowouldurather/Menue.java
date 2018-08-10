package com.rkoramtin.whowouldurather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);
        Button startButton;
        startButton=findViewById(R.id.startBt);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genderSelection=new Intent(Menue.this,gender.class);
                startActivity(genderSelection);
                finish();
            }
        });
    }
}