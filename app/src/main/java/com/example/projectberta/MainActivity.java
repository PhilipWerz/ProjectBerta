package com.example.projectberta;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView randomMessage;
    Random random = new Random();

    String[] messages = {"stay safe! ", "good luck! ", "eat healthy! "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomMessage = findViewById(R.id.randomMessage);
        int randomInt = random.nextInt(3);
        randomMessage.setText(messages[randomInt]);

        /*message = findViewById(R.id.viewCounter);
        myButton = findViewById(R.id.button);
        secondPage = findViewById(R.id.secondPage);*/

        /*myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                message.setText("Counter: " + counter);
            }
        });*/

        /*secondPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
            }
        });*/


    }
}