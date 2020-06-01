package com.example.april.search;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Alarm extends AppCompatActivity {

    public ImageButton plus;
    public Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        plus=(ImageButton)findViewById(R. id. plusAlarm);
        back=(Button)findViewById(R. id. backFromAlarm);
    }
}
