package com.example.projectberta;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class secondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private ArrayList<String> countryList = new ArrayList<String>();
    private String[] displayList = new String[11];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        countryList.add("Germany");
        countryList.add("USA");
        countryList.add("Brazil");
        countryList.add("Canada");
        countryList.add("Italy");
        countryList.add("Sweden");
        countryList.add("Austria");
        countryList.add("China");
        countryList.add("Russia");
        countryList.add("Spain");
        countryList.add("Netherlands");


        displayList = countryList.toArray(new String[11]);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter((String[]) displayList);

        recyclerView.setAdapter(recyclerAdapter);

    }
}
