package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewQuizBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswer);
        final TextView incorrectAnswer = findViewById(R.id.incorrectAnswer);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getInCorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnswer.setText(String.valueOf("Количество правильных ответов: " + getCorrectAnswers));
        incorrectAnswer.setText(String.valueOf("Количество неправильных ответов: " + getInCorrectAnswers));

        startNewQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}