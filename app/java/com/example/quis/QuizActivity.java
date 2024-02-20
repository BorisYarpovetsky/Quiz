package com.example.quis;

import static android.app.job.JobInfo.PRIORITY_HIGH;
import static android.app.job.JobInfo.PRIORITY_LOW;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    MediaPlayer mediaPlayerFail, mediaPlayerFinish;

    private TextView questions;
    private TextView queestion;
    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextBtn;
    private Timer quezTimer;
    private int seconds = 0;
    private int totalTimeMins = 1;
    private List<QuestionsList> questionsList;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";
    private ImageView gromkostBtn;

    private NotificationManager notificationManager;
    private static final int NOTIFY_ID = 1;
    private static final String CHANNEL_ID = "CHANEL_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quis);

        mediaPlayerFail = MediaPlayer.create(this, R.raw.start_quiz);
        mediaPlayerFinish = MediaPlayer.create(this, R.raw.quiz_finish);

        final ImageView backBtn = findViewById(R.id.back_btn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedTopicName = findViewById(R.id.topicName);
        final String getSeleectedTopic = getIntent().getStringExtra("selectedTopic");

        questions = findViewById(R.id.questions);
        queestion = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        nextBtn = findViewById(R.id.nextBtn);
        gromkostBtn = findViewById(R.id.gromkostBtn);

        selectedTopicName.setText(getSeleectedTopic);

        questionsList = QuestionsBank.getQuestions(getSeleectedTopic);

        startTimer(timer);

        questions.setText((currentQuestionPosition+1)+"/"+questionsList.size());
        queestion.setText(questionsList.get(0).getQuestion());
        option1.setText(questionsList.get(0).getOption1());
        option2.setText(questionsList.get(0).getOption2());
        option3.setText(questionsList.get(0).getOption3());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quezTimer.purge();
                quezTimer.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });

        // Кнопка при нажатии, на которую громкость в приложении станет НУЛЕВОЙ (MUTE_btn).
        // Сама кнопка станет невидимой, а ВИДИМОЙ станет кнопка ВКЛючения звука (UNMUTE_btn).

        gromkostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 0, 0);
                gromkostBtn.setVisibility(View.INVISIBLE);
                gromkostBtn.setVisibility(View.VISIBLE);
            }
        });

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.round_back_red);
                    option1.setTextColor(Color.WHITE);

                    revelAnswer();
                    questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red);
                    option2.setTextColor(Color.WHITE);

                    revelAnswer();
                    questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red);
                    option3.setTextColor(Color.WHITE);

                    revelAnswer();
                    questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()) {
                    mediaPlayerFail.start();
                    Toast.makeText(QuizActivity.this, "Пожалуйста, сделайте выбор", Toast.LENGTH_SHORT).show();
                } else {
                    changeNextQuestion();
                }
            }
        });
    }
    private void startTimer (TextView timerTextView) {
        quezTimer = new Timer();
        quezTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(seconds == 0) {
                    totalTimeMins = totalTimeMins - 1;
                    seconds = 59;
                } else if (seconds == 0 && totalTimeMins == 0) {
                    quezTimer.purge();
                    quezTimer.cancel();
                    Toast.makeText(QuizActivity.this, "Время закончилось", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                    intent.putExtra("correct", getCorectAnswer());
                    intent.putExtra("incorrect",getinCorectAnswer());
                    startActivity(intent);
                    finish();
                }
                else {
                    seconds = seconds - 1;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes = String.valueOf(totalTimeMins);
                        String finalSeconds = String.valueOf(seconds);
                        if (finalMinutes.length() == 1) {
                            finalMinutes = "0" + finalMinutes;
                        }
                        if (finalSeconds.length() == 1) {
                            finalSeconds = "0" + finalSeconds;
                        }
                        timerTextView.setText(finalMinutes + ":" + finalSeconds);
                    }
                });
            }
        }, 1000, 1000);
    }

    private int getCorectAnswer () {
        int correctAnswer = 0;
        for (int i = 0; i < questionsList.size(); i++) {
            final String getUserSlectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();
            if (getUserSlectedAnswer.equals(getAnswer)) {
                correctAnswer = correctAnswer + 1;
            }
        }
        return correctAnswer;
    }

    private int getinCorectAnswer () {
        int correctAnswer = 0;
        for (int i = 0; i < questionsList.size(); i++) {
            final String getUserSlectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();
            if (!getUserSlectedAnswer.equals(getAnswer)) {
                correctAnswer = correctAnswer + 1;
            }
        }
        return correctAnswer;
    }

    @Override
    public void onBackPressed() {
        quezTimer.purge();
        quezTimer.cancel();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    private void revelAnswer () {
        final String getAnswer = questionsList.get(currentQuestionPosition).getAnswer();
        if (option1.getText().toString().equals(getAnswer)) {
            option1.setBackgroundResource(R.drawable.round_back_green_answare);
            option1.setTextColor(Color.WHITE);
        }
        else if (option2.getText().toString().equals(getAnswer)) {
            option2.setBackgroundResource(R.drawable.round_back_green_answare);
            option2.setTextColor(Color.WHITE);
        }
        else if (option3.getText().toString().equals(getAnswer)) {
            option3.setBackgroundResource(R.drawable.round_back_green_answare);
            option3.setTextColor(Color.WHITE);
        }
    }

    private void changeNextQuestion () {
        currentQuestionPosition = currentQuestionPosition + 1;
        if ((currentQuestionPosition+1) == questionsList.size()) {
            nextBtn.setText("Завершить викторину");
        }
        if (currentQuestionPosition < questionsList.size()) {
            selectedOptionByUser = "";
            option1.setBackgroundResource(R.drawable.round_back_white_stroke_blue);
            option1.setTextColor(Color.parseColor("#1F6BB8"));
            option2.setBackgroundResource(R.drawable.round_back_white_stroke_blue);
            option2.setTextColor(Color.parseColor("#1F6BB8"));
            option3.setBackgroundResource(R.drawable.round_back_white_stroke_blue);
            option3.setTextColor(Color.parseColor("#1F6BB8"));
            questions.setText((currentQuestionPosition+1)+"/"+questionsList.size());
            queestion.setText(questionsList.get(currentQuestionPosition).getQuestion());
            option1.setText(questionsList.get(currentQuestionPosition).getOption1());
            option2.setText(questionsList.get(currentQuestionPosition).getOption2());
            option3.setText(questionsList.get(currentQuestionPosition).getOption3());
        }
        else {
            mediaPlayerFinish.start();
            notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
            Intent intent = new Intent(QuizActivity.this, QuizResults.class);
            intent.putExtra("correct", getCorectAnswer());
            intent.putExtra("incorrect",getinCorectAnswer());
            PendingIntent pendingIntent = PendingIntent.getActivities(getApplicationContext(), 0, new Intent[]{intent}, PendingIntent.FLAG_UPDATE_CURRENT);
            NotificationCompat.Builder notificationBuilder =
                    new NotificationCompat.Builder(getApplicationContext(), "CHANEL_ID")
                            .setAutoCancel(false)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setWhen(System.currentTimeMillis())
                            .setContentIntent(pendingIntent)
                            .setContentTitle("Поздравляем")
                            .setContentText("С победой в викторине")
                            .setPriority(PRIORITY_HIGH);
            createChanelIfNeeded(notificationManager);
            notificationManager.notify(NOTIFY_ID, notificationBuilder.build());
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }
    }

    public static void createChanelIfNeeded (NotificationManager manager) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }
    }
}