package com.example.projectberta;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView randomMessage;
    Random random = new Random();
    ImageView myButton;

    String[] messages = {"stay safe! ", "good luck! ", "eat healthy! "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.settingsIcon);
        randomMessage = findViewById(R.id.randomMessage);
        int randomInt = random.nextInt(3);
        randomMessage.setText(messages[randomInt]);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openNewActivity();
            }
        });




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

    public void openNewActivity() {
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }
}
