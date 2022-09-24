package com.example.choocer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView play, help, score;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.play);
        help = findViewById(R.id.help);
        score = findViewById(R.id.highscore);
    }
    public void movetohelp(View view){
        Intent intent = new Intent(MainActivity.this,help.class);
        startActivity(intent);
    }
    public  void movetoplay(View view){
        Intent intent = new Intent(MainActivity.this,gameplay.class);
        startActivity(intent);
    }
}
