package com.example.quizzgame;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class java extends AppCompatActivity {

    TextView totalquestion,questions,time;
    MediaPlayer mysong;
    String card,selectedAnswer="";
    Button ansA,ansB,ansC,ansD;
    Button submit;

    int score=0;
    int totalQuestions= 10;
    int currentQuestionIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_java);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        card=getIntent().getExtras().getString("v");

        totalquestion= findViewById(R.id.total_question);
        questions = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submit = findViewById(R.id.submit_btn);
        time=findViewById(R.id.time);


        ansA.setOnClickListener(this::onClick);
        ansB.setOnClickListener(this::onClick);
        ansC.setOnClickListener(this::onClick);
        ansD.setOnClickListener(this::onClick);
        submit.setOnClickListener(this::onClick);


        new CountDownTimer(300000, 1000) {
            @Override
            public void onTick(long l) {
                time.setText("TIMER: "+ l/1000);
            }

            @Override
            public void onFinish() {
                time.setText("OVER");
            }
        }.start();


        totalquestion.setText("Total Questions : "+totalQuestions);

        loadNewQuestion();
    }

    public void onClick(View view){


        ansA.setBackgroundColor(Color.BLACK);
        ansB.setBackgroundColor(Color.BLACK);
        ansC.setBackgroundColor(Color.BLACK);
        ansD.setBackgroundColor(Color.BLACK);


            Button clickedButton=(Button) view;
            if (clickedButton.getId() == R.id.submit_btn) {


                    if (card.equals("java")) {

                        if (selectedAnswer.equals(QuestionAnswer.java_correctAnswer[currentQuestionIndex])) {

                            score = score + 1;
                        }
                    }
                if (card.equals("python")) {
                    if (selectedAnswer.equals(QuestionAnswer.python_correctAnswer[currentQuestionIndex])) {

                        score = score + 1;
                    }
                }
                if (card.equals("cplus")) {
                    if (selectedAnswer.equals(QuestionAnswer.cplus_correctAnswer[currentQuestionIndex])) {

                        score = score + 1;
                    }
                }
                if(card.equals("c"))
                {
                    if (selectedAnswer.equals(QuestionAnswer.C_correctAnswer[currentQuestionIndex])) {

                        score = score + 1;
                    }
                }

                if(card.equals("javascript"))
                {
                    if (selectedAnswer.equals(QuestionAnswer.js_correctAnswer[currentQuestionIndex])) {

                        score = score + 1;
                    }
                }

                currentQuestionIndex++;
                loadNewQuestion();


            } else {

                selectedAnswer = clickedButton.getText().toString();
                clickedButton.setBackgroundColor(Color.MAGENTA);
            }
    }

    void loadNewQuestion() {

        if (card.equals("java")) {
            if (currentQuestionIndex == totalQuestions) {
                finishQuiz();
                // return;
            }
            questions.setText(QuestionAnswer.java_question[currentQuestionIndex]);
            ansA.setText(QuestionAnswer.java_choices[currentQuestionIndex][0]);
            ansB.setText(QuestionAnswer.java_choices[currentQuestionIndex][1]);
            ansC.setText(QuestionAnswer.java_choices[currentQuestionIndex][2]);
            ansD.setText(QuestionAnswer.java_choices[currentQuestionIndex][3]);
        }

        if (card.equals("python"))
        {
            if (currentQuestionIndex == totalQuestions ) {
                finishQuiz();
                // return;
            }
            questions.setText(QuestionAnswer.python_question[currentQuestionIndex]);
            ansA.setText(QuestionAnswer.python_choices[currentQuestionIndex][0]);
            ansB.setText(QuestionAnswer.python_choices[currentQuestionIndex][1]);
            ansC.setText(QuestionAnswer.python_choices[currentQuestionIndex][2]);
            ansD.setText(QuestionAnswer.python_choices[currentQuestionIndex][3]);
        }

        if (card.equals("cplus")) {
            if (currentQuestionIndex == totalQuestions) {
                finishQuiz();
                // return;
            }
            questions.setText(QuestionAnswer.cplus_question[currentQuestionIndex]);
            ansA.setText(QuestionAnswer.cplus_choices[currentQuestionIndex][0]);
            ansB.setText(QuestionAnswer.cplus_choices[currentQuestionIndex][1]);
            ansC.setText(QuestionAnswer.cplus_choices[currentQuestionIndex][2]);
            ansD.setText(QuestionAnswer.cplus_choices[currentQuestionIndex][3]);
        }

        if (card.equals("c")) {
            if (currentQuestionIndex == totalQuestions) {
                finishQuiz();
                // return;
            }
            questions.setText(QuestionAnswer.C_question[currentQuestionIndex]);
            ansA.setText(QuestionAnswer.C_choices[currentQuestionIndex][0]);
            ansB.setText(QuestionAnswer.C_choices[currentQuestionIndex][1]);
            ansC.setText(QuestionAnswer.C_choices[currentQuestionIndex][2]);
            ansD.setText(QuestionAnswer.C_choices[currentQuestionIndex][3]);
        }

        if (card.equals("javascript")) {
            if (currentQuestionIndex == totalQuestions) {
                finishQuiz();
                // return;
            }

            questions.setText(QuestionAnswer.js_question[currentQuestionIndex]);
            ansA.setText(QuestionAnswer.js_choices[currentQuestionIndex][0]);
            ansB.setText(QuestionAnswer.js_choices[currentQuestionIndex][1]);
            ansC.setText(QuestionAnswer.js_choices[currentQuestionIndex][2]);
            ansD.setText(QuestionAnswer.js_choices[currentQuestionIndex][3]);

        }
        }


        void finishQuiz() {

            int s;
            s = score;

            Intent i = new Intent(java.this, final_result.class);
            i.putExtra("value", s);
            startActivity(i);
            finish();

        }
        }
