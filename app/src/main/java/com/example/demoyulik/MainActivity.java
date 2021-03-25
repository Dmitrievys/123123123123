package com.example.demoyulik;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final static String PHOTO_URL = "http://cinema.areas.su/up/images/";
    TextView textView;
    ImageView preview;
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);


    }
}