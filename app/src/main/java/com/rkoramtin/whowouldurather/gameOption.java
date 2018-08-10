package com.rkoramtin.whowouldurather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class gameOption extends AppCompatActivity {
    public CheckBox singer,actress;
    public Button Play;
    public boolean female;
    public boolean male;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_option);
        singer=findViewById(R.id.singerChecked);
        actress=findViewById(R.id.actressChecked);
        Play=findViewById(R.id.PlayButton);
        female=getIntent().getExtras().getBoolean("female");
        male=getIntent().getExtras().getBoolean("male");
        ImageView singerImage=findViewById(R.id.singerImage);
        ImageView actImage=findViewById(R.id.actImage);
        if (female)
        {
            singerImage.setImageResource(R.drawable.o_f_s);
            actImage.setImageResource(R.drawable.o_f_a);
            actress.setText("Actress");
        }
        else
        {
            singerImage.setImageResource(R.drawable.o_m_s);
            actImage.setImageResource(R.drawable.o_m_a);
            actress.setText("Actor");
        }
        singer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBtShow();
            }
        });
        actress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBtShow();
            }
        });
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pass dadan bein activity ha
                Intent intent = new Intent(gameOption.this,gameScreen.class);
                intent.putExtra("singer",singer.isChecked());
                intent.putExtra("actress",actress.isChecked());
                intent.putExtra("male",male);
                intent.putExtra("female",female);
                startActivity(intent);
                finish();
            }
        });


    }
    public void playBtShow()
    {
        if (singer.isChecked() || actress.isChecked())
        {
            Play.setVisibility(View.VISIBLE);
        }
        else
            Play.setVisibility(View.INVISIBLE);
    }

}

