package sg.edu.rp.c346.id22022260.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;
    ArrayList<String> answers = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Log.d("AnswerActivity1", "onCreate() called.");

        tvAnswer = findViewById(R.id.textView);
        answers.add("Queue");
        answers.add("Gone");

//        tvAnswer.setText("In Second Activity");

        Intent intentReceived = getIntent();
        int questionsSelected = intentReceived.getIntExtra("Question", 1);
        tvAnswer.setText("Q" + questionsSelected + " answer is: " + answers.get(questionsSelected - 1));
//        tvAnswer.setText(questionsSelected + " answer is: Queue");
    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }
}