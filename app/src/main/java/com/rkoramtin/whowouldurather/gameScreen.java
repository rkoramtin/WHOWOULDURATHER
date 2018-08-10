package com.rkoramtin.whowouldurather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collections;

public class gameScreen extends AppCompatActivity {
public Button first;
public Button second;
public int i=0;
public int j=1;
public int count=2;
public int lastId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        boolean singerCategory=getIntent().getExtras().getBoolean("singer");
        boolean actressCategory=getIntent().getExtras().getBoolean("actress");
        boolean female=getIntent().getExtras().getBoolean("female");
        boolean male=getIntent().getExtras().getBoolean("male");
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        final ArrayList<Crushes> crushes = new ArrayList<>();
        final ArrayList<Crushes>crushes1=new ArrayList<>();//baraie vaghti 2 category dorost shode and
        if (female && actressCategory && !singerCategory) {

            femaleActressSelected(crushes);
            gameTheory(crushes);

            }

        else if (female && singerCategory && !actressCategory)
        {
            femaleSingerSelected(crushes);
            gameTheory(crushes);

        }
        else if (male && singerCategory && !actressCategory)
        {
            maleSingerSelected(crushes);
            gameTheory(crushes);

        }
        else if (male && actressCategory && !singerCategory)
        {
            maleActorSelected(crushes);
            gameTheory(crushes);

        }
        else if (female && singerCategory && actressCategory)
        {
        femaleSingerSelected(crushes);
        femaleActressSelected(crushes1);
        crushes.addAll(crushes1);
        Collections.shuffle(crushes);
            gameTheory(crushes);

        }
        else
        {
            maleSingerSelected(crushes);
            maleActorSelected(crushes1);
            crushes.addAll(crushes1);
            Collections.shuffle(crushes);
            gameTheory(crushes);

        }






    }
    public void femaleActressSelected(ArrayList<Crushes> femaleActress)
    {
        femaleActress.add(new Crushes("Angelina Jolie",R.drawable.f_a_angelina_jolie));
        femaleActress.add(new Crushes("Emma Stone",R.drawable.f_a_emma_stone));
        femaleActress.add(new Crushes("Emma Watson",R.drawable.f_a_emma_watson));
        femaleActress.add(new Crushes("Jennifer Lawerence",R.drawable.f_a_jennifer_lawerence));
        femaleActress.add(new Crushes("Jessica Alba",R.drawable.f_a_jessica_alba));
        femaleActress.add(new Crushes("Margot Robie",R.drawable.f_a_margot_robie));
        femaleActress.add(new Crushes("Megan Fox",R.drawable.f_a_megan_fox));
        femaleActress.add(new Crushes("Mila Kunis",R.drawable.f_a_mila_kunis));
        femaleActress.add(new Crushes("Nina Dobrev",R.drawable.f_a_nina_dobrev));
        femaleActress.add(new Crushes("Scarlet Johansson",R.drawable.f_a_scarlet_johansson));
        //shuffle
        Collections.shuffle(femaleActress);
    }
    public  void femaleSingerSelected(ArrayList<Crushes> femaleSinger)
    {
        femaleSinger.add(new Crushes("Beyonce",R.drawable.f_s__beyonce));
        femaleSinger.add(new Crushes("Ariana Grande",R.drawable.f_s_ariana_grande));
        femaleSinger.add(new Crushes("Brittiney Spears",R.drawable.f_s_brittiney_spears));
        femaleSinger.add(new Crushes("Inna",R.drawable.f_s_inna));
        femaleSinger.add(new Crushes("Jennifer Lopez",R.drawable.f_s_jennifer_lopez));
        femaleSinger.add(new Crushes("Katy Perry",R.drawable.f_s_katy_perry));
        femaleSinger.add(new Crushes("Rihana",R.drawable.f_s_rihana));
        femaleSinger.add(new Crushes("Selena Gomez",R.drawable.f_s_selena_gomez));
        femaleSinger.add(new Crushes("Shakira",R.drawable.f_s_shakira));
        femaleSinger.add(new Crushes("Taylor Swift",R.drawable.f_s_taylor_swift));
        Collections.shuffle(femaleSinger);
    }
    public void maleActorSelected(ArrayList<Crushes> maleActor)
    {
        maleActor.add(new Crushes("Brad Pit",R.drawable.m_a_brad_pitt));
        maleActor.add(new Crushes("Chris Evans",R.drawable.m_a_chris_evans));
        maleActor.add(new Crushes("Chris Hemsworth",R.drawable.m_a_chris_hemsworth));
        maleActor.add(new Crushes("Ian Somerhalder",R.drawable.m_a_ian_somerhalder));
        maleActor.add(new Crushes("Jason MoMoa",R.drawable.m_a_jason_momoa));
        maleActor.add(new Crushes("Johonny Depp",R.drawable.m_a_johonny_depp));
        maleActor.add(new Crushes("Leonardo DiCaprio",R.drawable.m_a_leonardo_dicaprio));
        maleActor.add(new Crushes("Paul Wasley",R.drawable.m_a_paul_wesley));
        maleActor.add(new Crushes("Rayan Gosling",R.drawable.m_a_rayan_gosling));
        maleActor.add(new Crushes("Robert Pattinson",R.drawable.m_a_robert_pattinson));
        Collections.shuffle(maleActor);
    }
    public  void maleSingerSelected(ArrayList<Crushes> maleSinger)
    {
        maleSinger.add(new Crushes("Enrique Iglesias",R.drawable.m_s_enrique_iglesias));
        maleSinger.add(new Crushes("Harry Styles",R.drawable.m_s_harry_styles));
        maleSinger.add(new Crushes("Jared Leto",R.drawable.m_s_jared_leto));
        maleSinger.add(new Crushes("Justin Bieber",R.drawable.m_s_justin_bieber));
        maleSinger.add(new Crushes("Justin Timberlake",R.drawable.m_s_justin_timberlake));
        maleSinger.add(new Crushes("Kurt cobain",R.drawable.m_s_kurt_cobain));
        maleSinger.add(new Crushes("Ricky martin",R.drawable.m_s_ricky_martin));
        Collections.shuffle(maleSinger);

    }
    public void gameTheory(final ArrayList<Crushes> crushes)
    {
        i=0;
        j=1;
        count=2;
        first.setBackgroundResource(crushes.get(i).getID());
        second.setBackgroundResource(crushes.get(i + 1).getID());
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j=count;
                count=count+1;
                if (count<=crushes.size())
                {
                    second.setBackgroundResource(crushes.get(j).getID());
                    lastId=crushes.get(i).getID();
                }
                else{
                    Intent intent = new Intent(gameScreen.this,endScareen.class);
                    intent.putExtra("finalId",lastId);
                    startActivity(intent);
                    finish();
                }}
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = count;
                count=count+1;
                if (count<=crushes.size())
                {
                    first.setBackgroundResource(crushes.get(i).getID());
                    lastId=crushes.get(j).getID();
                }
                else{
                    Intent intent = new Intent(gameScreen.this,endScareen.class);
                    intent.putExtra("finalId",lastId);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
