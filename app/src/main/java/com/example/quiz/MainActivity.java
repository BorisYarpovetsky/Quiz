package com.example.quiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quiz.R;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayerNext, mediaPlayerFail, mediaPlayerOption;

    private String SelectedTopic = "";
    private LinearLayout book;
    private LinearLayout astronomiya;
    private LinearLayout animal;
    private LinearLayout flower;

    private LinearLayout cartoons;
    private LinearLayout nature;
    private LinearLayout sport;
    private LinearLayout crafts;

    private Button startQuizBtn;


    @SuppressLint("MissingInflatedId")
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

        cartoons = findViewById(R.id.cartoons);
        nature = findViewById(R.id.nature);
        sport = findViewById(R.id.sport);
        crafts = findViewById(R.id.crafts);

        final Button startQuizBtn = findViewById(R.id.startQuizBtn);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Книги";
                clearBorderQuiz();
                book.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        astronomiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Астрономия";
                clearBorderQuiz();
                astronomiya.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectedTopic = "Животный мир";
                clearBorderQuiz();
                animal.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectedTopic = "Растительный мир";
                clearBorderQuiz();
                flower.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        cartoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Мультфильмы";
                clearBorderQuiz();
                cartoons.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Природа";
                clearBorderQuiz();
                nature.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectedTopic = "Спорт";
                clearBorderQuiz();
                sport.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });
        crafts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectedTopic = "Ремесла";
                clearBorderQuiz();
                crafts.setBackgroundResource(R.drawable.round_back_white_stroke);
                mediaPlayerOption.start();
            }
        });

        startQuizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SelectedTopic.isEmpty()) {
                    mediaPlayerFail.start();
                    Toast.makeText(MainActivity.this, "Выберите, пожалуйста, интересующую Вас викторину", Toast.LENGTH_SHORT).show();
                } else {
                    mediaPlayerNext.start();
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", SelectedTopic);
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

        cartoons.setBackgroundResource(R.drawable.round_back_white);
        nature.setBackgroundResource(R.drawable.round_back_white);
        sport.setBackgroundResource(R.drawable.round_back_white);
        crafts.setBackgroundResource(R.drawable.round_back_white);
    }
}