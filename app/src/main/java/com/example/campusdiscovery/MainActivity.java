package com.example.campusdiscovery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void openLogin(View view) {
        setContentView(R.layout.activity_main);
    }

    public void exitApp(View view) {
        setContentView(R.layout.start);
    }
}