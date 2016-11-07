package com.nanodegree.yadavviv.portfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToastOnButtonClick(R.id.PopularMoviesButton, "Popular Movies");

        setToastOnButtonClick(R.id.StockHawkButton, "Stock Hawk");

        setToastOnButtonClick(R.id.BuildItBiggerButton, "Build It Bigger");

        setToastOnButtonClick(R.id.MakeYourAppMaterialButton, "Make Your App Material");

        setToastOnButtonClick(R.id.GoUbiquitousButton, "Go Ubiquitous");

        setToastOnButtonClick(R.id.CapstoneButton, "Capstone: My Ownn App");
    }


    private void setToastOnButtonClick(int viewId, final String projectName){
        ((Button) findViewById(viewId)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("This Button will Launch ");
                stringBuffer.append(projectName);
                stringBuffer.append(" Project");
                CharSequence text = stringBuffer.toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

}
