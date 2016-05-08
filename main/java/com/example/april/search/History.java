package com.example.april.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class History extends AppCompatActivity {

    public Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        back=(Button)findViewById(R. id. backFromHistory);
    }
}
