package com.example.quizzgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home_screen extends AppCompatActivity {

    CardView card_java,card_python,card_cplus,card_c,card_javascript;

    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        card_java=findViewById(R.id.card_java);
        card_python=findViewById(R.id.card_python);
        card_cplus=findViewById(R.id.card_cplus);
        card_c=findViewById(R.id.card_c);
        card_javascript=findViewById(R.id.card_javascript);

        mysong=MediaPlayer.create(home_screen.this,R.raw.back_music);
        mysong.start();
        mysong.setLooping(true);


        card_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(home_screen.this,java.class);
                i.putExtra("v","java");
                startActivity(i);
            }
        });


        card_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(home_screen.this,java.class);
                i.putExtra("v","python");
                startActivity(i);
            }
        });


        card_cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(home_screen.this,java.class);
                i.putExtra("v","cplus");
                startActivity(i);
            }
        });


        card_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(home_screen.this,java.class);
                i.putExtra("v","c");
                startActivity(i);
            }
        });


        card_javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(home_screen.this,java.class);
                i.putExtra("v","javascript");
                startActivity(i);
            }
        });


    }
}