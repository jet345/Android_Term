package com.example.april.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.nio.BufferUnderflowException;

public class SearchMain extends AppCompatActivity {

    public Button nameSelect;
    public Button shapeSelect;
    public Button backSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_main);

        nameSelect=(Button) findViewById(R. id. selectName);
        shapeSelect=(Button) findViewById(R. id. selectShape);
        backSelect=(Button) findViewById(R. id. selectBack);
    }
}
