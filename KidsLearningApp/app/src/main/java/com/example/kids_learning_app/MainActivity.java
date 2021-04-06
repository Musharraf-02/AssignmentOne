package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAlphabetsActivity(View view) {
        Intent intent=new Intent(this,alphabetsActivity.class);
        startActivity(intent);
    }

    public void switchToCountingActivity(View view) {
        Intent intent=new Intent(this,countingActivity.class);
        startActivity(intent);
    }

    public void switchToColorsActivity(View view) {
        Intent intent=new Intent(this,colorsActivity.class);
        startActivity(intent);
    }
}