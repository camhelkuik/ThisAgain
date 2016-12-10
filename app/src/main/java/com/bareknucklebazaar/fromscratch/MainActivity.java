package com.bareknucklebazaar.fromscratch;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        AssetManager assetManager = getAssets();

        BufferedReader in = new BufferedReader(new FileReader(assetManager.open("/assets/randomWordList.txt")));
        String str;

        List<String> list = new ArrayList<>();
        while((str = in.readLine()) != null) {
            list.add(str);
        }
        String[] randomKnucks = list.toArray(new String[0]);

        //String [] randomKnucks = {"Punk Cats", "Funk Bats", "RLRR LRLL"};
        String random = (randomKnucks[new Random().nextInt(randomKnucks.length)]);
        knucksDisplay.setText(random);
    }
}
