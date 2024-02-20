package com.example.quis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayerNext, mediaPlayerFail, mediaPlayerOption;

    private String selectedTopic = "";
    private LinearLayout book;
    private LinearLayout astronomiya;
    private LinearLayout animal;
    private LinearLayout flower;

    private LinearLayout book2;
    private LinearLayout astronomiya2;
    private LinearLayout animal2;
    private LinearLayout flower2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayerFail = MediaPlayer.create(this, R.raw.start_quiz);
        mediaPlayerNext = MediaPlayer.create(this, R.raw.quiz_next);
        mediaPlayerOption = MediaPlayer.create(this, R.raw.choose_quiz);

        book = findViewById(R.id.book);
        astronomiya = findViewById(R.id.astronomiya);
        animal = findViewById(R.id.animal);
        flower = findViewById(R.id.flower);

        book2 = findViewById(R.id.book2);
        astronomiya2 = findViewById(R.id.astronomiya2);
        animal2 = findViewById(R.id.animal2);
        flower2 = findViewById(R.id.flower2);

        final Button startQuizBtn = findViewById(R.id.startQuizBtn);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Книги";
                clearBorderQuiz();
                book.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        astronomiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Астрономия";
                clearBorderQuiz();
                astronomiya.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Животный мир";
                clearBorderQuiz();
                animal.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Растительный мир";
                clearBorderQuiz();
                flower.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Книги";
                clearBorderQuiz();
                book2.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        astronomiya2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Астрономия";
                clearBorderQuiz();
                astronomiya2.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        animal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "Животный мир";
                clearBorderQuiz();
                animal2.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        flower2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Растительный мир";
                clearBorderQuiz();
                flower2.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopic.isEmpty()) {
                    mediaPlayerFail.start();
                    Toast.makeText(MainActivity.this, "Выберите, пожалуйста, интересующую Вас викторину", Toast.LENGTH_SHORT).show();
                } else {
                    mediaPlayerNext.start();
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    public void clearBorderQuiz() {
        book.setBackgroundResource(R.drawable.round_back_white);
        astronomiya.setBackgroundResource(R.drawable.round_back_white);
        animal.setBackgroundResource(R.drawable.round_back_white);
        flower.setBackgroundResource(R.drawable.round_back_white);

        book2.setBackgroundResource(R.drawable.round_back_white);
        astronomiya2.setBackgroundResource(R.drawable.round_back_white);
        animal2.setBackgroundResource(R.drawable.round_back_white);
        flower2.setBackgroundResource(R.drawable.round_back_white);
    }
}