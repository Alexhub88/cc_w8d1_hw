package com.example.alexsword.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    private EditText editText;
    private TextView answerTextView;
    private Button button;
    private WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        editText = findViewById(R.id.editTextID);
        answerTextView = findViewById(R.id.outputTextViewID);
        button = findViewById(R.id.buttonID);

        answerTextView.setText("The answer will go here!");


        Log.d(getClass().toString(), "Id is:  " + R.id.editTextID);
    }

    public void onWordButtonClicked(View button){
        String words = editText.getText().toString();

        wordCounter = new WordCounter();
        answerTextView.setText("Total word count: " + wordCounter.countWords(words));
    }
}
