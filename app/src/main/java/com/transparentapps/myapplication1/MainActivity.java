package com.transparentapps.myapplication1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "";
    private Questions myQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = myQuestions.myQuestions.length;

    Button answer1, answer2, answer3, answer4;
    TextView score, question, timer;
    int[] quesNumber = IntStream.rangeClosed(0, 10).toArray();

    int counter = 0;

    CountDownTimer c = new CountDownTimer(30000, 1000) {

        public void onTick(long millisUntilFinished) {
            timer.setText("seconds remaining: " + millisUntilFinished / 1000);
        }

        public void onFinish() {
            counter++;
            updateQuestion(quesNumber[counter]);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        question = (TextView) findViewById(R.id.question);
        score = (TextView) findViewById(R.id.score);
        timer = (TextView) findViewById(R.id.timer);

        shuffleIntArray(quesNumber);
        updateQuestion(quesNumber[0]);
        score.setText("Score: "+mScore);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                c.cancel();
                if (answer1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                    }

                else {
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                c.cancel();
                if (answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                }

                else {
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                c.cancel();
                if (answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                }

                else {
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                c.cancel();
                if (answer4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                }

                else {
                    score.setText("Score: "+mScore);
                    if(counter<quesNumber.length)
                        updateQuestion(quesNumber[counter]);
                    else
                        gameOver();
                }
            }
        });
    }

    private void updateQuestion(int num){
        question.setText(myQuestions.getQuestion(num));
        shuffleCharArray(myQuestions.getChoices(num));
        answer1.setText(myQuestions.getChoice1(num));
        answer2.setText(myQuestions.getChoice2(num));
        answer3.setText(myQuestions.getChoice3(num));
        answer4.setText(myQuestions.getChoice4(num));
        mAnswer = myQuestions.getAnswer(num);

        c.start();

    }

    private void shuffleIntArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            if (i == index) {
                ++i;
            } else {
                int a = ar[index];
                ar[index] = ar[i];
                ar[i] = a;
            }
        }
    }
    private void shuffleCharArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            if (i == index) {
                ++i;
            } else {
                String a = ar[index];
                ar[index] = ar[i];
                ar[i] = a;
            }
        }
    }
    private void gameOver(){
        Intent intent = new Intent(MainActivity.this,Main3Activity.class);
        String message = Integer.toString(mScore);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}

