package com.example.cristianvillanueva.diceroll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;
    private ImageView imageviewdice;
    private Random rng = new Random();

//    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageviewdice = findViewById(R.id.imageView);
        imageviewdice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                rollDice();
            }
        });
//        text.findViewById(R.id.criticaltext);
//        text.setText("");

    }


    public void playcritical(){
        player = MediaPlayer.create(this, R.raw.fortnite);

        player.start();
    }
    public void playroll(){

        player = MediaPlayer.create(this,R.raw.rollsfx);
        player.start();
    }
    public void playmiss(){
        player = MediaPlayer.create(this,R.raw.kirby);
        player.start();
    }

    private void rollDice(){
        int randomNumber = rng.nextInt(20) + 1;

        switch (randomNumber){
            case 1:
                imageviewdice.setImageResource(R.drawable.d201);

                playmiss();
                break;
            case 2:
                imageviewdice.setImageResource(R.drawable.d202);
                playroll();
                break;
            case 3:
                imageviewdice.setImageResource(R.drawable.d203);
                playroll();
                break;
            case 4:
                imageviewdice.setImageResource(R.drawable.d204);
                playroll();
                break;
            case 5:
                imageviewdice.setImageResource(R.drawable.d205);
                playroll();
                break;
            case 6:
                imageviewdice.setImageResource(R.drawable.d206);
                playroll();
                break;
            case 7:
                imageviewdice.setImageResource(R.drawable.d207);
                playroll();
                break;
            case 8:
                imageviewdice.setImageResource(R.drawable.d208);
                playroll();
                break;
            case 9:
                imageviewdice.setImageResource(R.drawable.d209);
                playroll();
                break;
            case 10:
                imageviewdice.setImageResource(R.drawable.d2010);
                playroll();
                break;
            case 11:
                imageviewdice.setImageResource(R.drawable.d2011);
                playroll();
                break;
            case 12:
                imageviewdice.setImageResource(R.drawable.d2012);
                playroll();
                break;
            case 13:
                imageviewdice.setImageResource(R.drawable.d2013);
                playroll();
                break;
            case 14:
                imageviewdice.setImageResource(R.drawable.d2014);
                playroll();
                break;
            case 15:
                imageviewdice.setImageResource(R.drawable.d2015);
                playroll();
                break;
            case 16:
                imageviewdice.setImageResource(R.drawable.d2016);
                playroll();
                break;
            case 17:
                imageviewdice.setImageResource(R.drawable.d2017);
                playroll();
                break;
            case 18:
                imageviewdice.setImageResource(R.drawable.d2018);
                playroll();
                break;
            case 19:
                imageviewdice.setImageResource(R.drawable.d2019);
                playroll();
                break;
            case 20:
                imageviewdice.setImageResource(R.drawable.d2020);
                playcritical();
                break;
        }

    }
}
