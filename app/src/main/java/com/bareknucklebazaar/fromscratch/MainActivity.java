package com.bareknucklebazaar.fromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //called when user clicks button
    public void showKnucks (View view){
        //show a random knucks
        TextView knucksDisplay = (TextView) findViewById(R.id.knucks_display);
        String randomKnucks = "Punk Cats";
        knucksDisplay.setText(randomKnucks);
    }
}
