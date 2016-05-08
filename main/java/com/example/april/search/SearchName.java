package com.example.april.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SearchName extends AppCompatActivity {

    public EditText inputName;
    public EditText inputCorp;
    public Button goSearch;
    public Button backSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_name);

        inputName=(EditText)findViewById(R. id. drugName);
        inputCorp=(EditText)findViewById(R. id. drugCorp);
        goSearch=(Button)findViewById(R. id. doSearch);
        backSelect=(Button)findViewById(R. id. backFromSearchName);
    }
}
