package com.rkoramtin.whowouldurather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        Button female=findViewById(R.id.femaleGender);
        Button male=findViewById(R.id.maleGender);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pass dadan bein activity ha
                Intent intent = new Intent(gender.this,gameOption.class);
                intent.putExtra("female",true);
                intent.putExtra("male",false);
                startActivity(intent);
                finish();
            }
        });
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pass dadan bein activity ha
                Intent intent = new Intent(gender.this,gameOption.class);
                intent.putExtra("male",true);
                intent.putExtra("female",false);
                startActivity(intent);
                finish();
            }
        });
    }
}
