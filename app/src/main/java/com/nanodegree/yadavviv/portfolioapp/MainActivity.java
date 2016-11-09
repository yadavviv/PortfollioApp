package com.nanodegree.yadavviv.portfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void showToastPopularMovies(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This Button will Launch Popular Movies Project.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void showToastStockHawk(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This Button will Launch Stock Hawk Project.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void showToastBuildItBigger(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This Button will Launch Build It Bigger Project.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void showToastMakeYourAppMaterial(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This Button will Launch Make Your App Material Project.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void showToastGoUbiquitous(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This Button will Launch GoUbiquitous Project.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void showToastCapstone(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This Button will Launch Capstone: My Ownn App Project.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
