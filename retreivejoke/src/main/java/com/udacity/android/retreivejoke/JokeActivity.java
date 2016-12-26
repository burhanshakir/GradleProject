package com.udacity.android.retreivejoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView joke;
    String j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        joke = (TextView) findViewById(R.id.tvJoke);

        j = getIntent().getStringExtra("joke");

        joke.setText(j);

    }
}
