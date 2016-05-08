package com.example.april.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public ImageButton searchDrug;
    public ImageButton historyDrug;
    public ImageButton plusDrug;
    public ImageButton alarmDrug;
    public EditText quichSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchDrug=(ImageButton) findViewById(R. id. drugSearch);
        historyDrug=(ImageButton) findViewById(R. id. drugHistroy);
        plusDrug=(ImageButton) findViewById(R. id. drugPlus);
        alarmDrug=(ImageButton) findViewById(R. id. drugAlarm);
        quichSearch=(EditText) findViewById(R. id. QuickSearch);
    }
}
