package com.example.projectberta;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView randomMessage;
    private Random random = new Random();
    private ImageView myButton;
    private SearchView mySearchView;

    private String[] messages = {"stay safe! ", "good luck! ", "eat healthy! "};

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private ArrayList<String> countryList = new ArrayList<String>();
    private String[] displayList = new String[11];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySearchView = findViewById(R.id.searchBar);

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



        countryList.add("Germany_FFP2_Click&Collect_Test Pflicht");
        countryList.add("USA_FFP2_Eis");
        countryList.add("Brazil_FFP2");
        countryList.add("Canada_FFP2");
        countryList.add("Italy_FFP2");
        countryList.add("Sweden_FFP2");
        countryList.add("Austria_FFP2");
        countryList.add("China_FFP2");
        countryList.add("Russia_FFP2_Test Notwendig");
        countryList.add("Spain");
        countryList.add("Netherlands_FFP2");


        displayList = countryList.toArray(new String[11]);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(displayList);

        recyclerView.setAdapter(recyclerAdapter);


    }

    public void openNewActivity() {
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }
}
