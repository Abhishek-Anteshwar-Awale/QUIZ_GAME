package com.example.quizzgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class final_result extends AppCompatActivity {

  TextView textView,textView1,status;
  LottieAnimationView lottieAnimationView;
  LottieAnimationView lottieAnimationView1;

  MediaPlayer muzic1,muzic2;

  ImageView back_button;
  int st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_final_result);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView=findViewById(R.id.tx1);
        back_button=findViewById(R.id.back);
        status=findViewById(R.id.status);
        lottieAnimationView=findViewById(R.id.lottie1);
        lottieAnimationView1=findViewById(R.id.lottie2);

        muzic1=MediaPlayer.create(final_result.this,R.raw.win);
        muzic2=MediaPlayer.create(final_result.this,R.raw.lose);

        st=getIntent().getExtras().getInt("value");

        textView.setText(st+"/10");

        if(st>5){
            status.setTextColor(getResources().getColor(R.color.green));
            status.setText("Pass");
            lottieAnimationView.playAnimation();
            lottieAnimationView1.setVisibility(View.INVISIBLE);

            lottieAnimationView.loop(true);
            muzic1.start();
            muzic1.setLooping(false);
        }else {
            status.setTextColor(getResources().getColor(R.color.red));
            status.setText("Fail");
            lottieAnimationView.setVisibility(View.INVISIBLE);

            muzic2.start();
            muzic2.setLooping(false);
        }


        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(final_result.this,home_screen.class);
                startActivity(i);
            }
        });

    }
}