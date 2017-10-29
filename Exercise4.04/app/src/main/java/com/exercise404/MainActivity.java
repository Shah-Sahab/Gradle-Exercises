package com.exercise404;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.JokeSmith;
import com.myandroidlibrary.JokeTellerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View v) {
        Intent intent = new Intent(this, JokeTellerActivity.class);
        intent.putExtra(Intent.EXTRA_REFERRER, new JokeSmith().getJoke());
        startActivity(intent);
    }
}
