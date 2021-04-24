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

        countryList.add("Germany_FFP2_Click&Collect_Test Pflicht");
        countryList.add("USA_FFP2_Eis");
        countryList.add("Brazil_FFP2");
        countryList.add("Canada_FFP2");
        countryList.add("Italy_FFP2");
        countryList.add("Sweden_FFP2");
        countryList.add("Austria_FFP2");
        countryList.add("China_FFP2");
        countryList.add("Russia_FFP2_Test Notwendig");
        countryList.add("Spain_FFP2");
        countryList.add("Netherlands_FFP2");


        displayList = countryList.toArray(new String[11]);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(displayList);

        recyclerView.setAdapter(recyclerAdapter);

    }


}
