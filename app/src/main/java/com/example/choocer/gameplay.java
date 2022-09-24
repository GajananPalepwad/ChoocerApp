package com.example.choocer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class gameplay extends AppCompatActivity {

    ImageView check;
    EditText input;
    TextView show;
    int number,times=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        input = findViewById(R.id.editTextNumber);
        check = findViewById(R.id.imageView2);
        show = findViewById(R.id.textView5);
        Random  r = new Random();
        number = r.nextInt(100);
    }

    @SuppressLint("SetTextI18n")
    public  void game(View view){

            int  guess;

                String s = input.getText().toString();
                guess = Integer.parseInt(s);

                if (number < guess)
                {
                    show.setText(guess + " is big number \nGuess lower number");
                }
                if (number > guess)
                {
                    show.setText(guess + " is small number \nGuess higher number");
                }
                if (number==guess)
                {
                    show.setText("\uD83E\uDD73\uD83E\uDD73\uD83E\uDD73 you guess right number in "+ times + " attempt!!!!!");
                }
                times++;
                input.setText("");

    }
}