package com.example.quizzgame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            return insets;
        });

        lottieAnimationView=findViewById(R.id.lottie);

        Intent i=new Intent(MainActivity.this,home_screen.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                lottieAnimationView.playAnimation();
                lottieAnimationView.setVisibility(View.VISIBLE);
                lottieAnimationView.loop(false);
                startActivity(i);
                finish();
            }
        },3500);


    }
}