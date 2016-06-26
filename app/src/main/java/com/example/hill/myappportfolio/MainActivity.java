package com.example.hill.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastPopularMovies(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"Popular Movie Message",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastStockHawks(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"Stock Hawks",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastBuildItBigger(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"Build It Bigger",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastMakeYourAppMaterial(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"Make Your App Material",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastGoUbiquitous(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"Go Ubiquitous",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastCapstone(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"CapStone",Toast.LENGTH_SHORT);
        toast.show();
    }
}
