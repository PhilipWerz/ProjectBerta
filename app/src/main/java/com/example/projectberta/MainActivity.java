package com.example.projectberta;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView message;
    private Button myButton;
    private Button secondPage;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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