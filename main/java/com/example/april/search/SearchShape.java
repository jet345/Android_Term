package com.example.april.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SearchShape extends AppCompatActivity {

    public Button shapeSearch;
    public Button selsectBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_shape);

        shapeSearch=(Button)findViewById(R. id. doShapeSearch);
        selsectBack=(Button)findViewById(R. id. backFromSearchShape);

    }
}
