package com.bareknucklebazaar.fromscratch;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView)findViewById(R.id.knucks_display);

    }

    public void loadDataFromAsset() {
        try {
            // get input stream for text
            InputStream is = getAssets().open("randomWordList.txt");
            // check size
            int size = is.available();
            // create buffer for IO
            byte[] buffer = new byte[size];
            // get data to buffer
            is.read(buffer);
            // close stream
            is.close();
            // set result to TextView
            //mText.setText(new String(buffer));
            mText.setText(new String(buffer));

        } catch (IOException ex) {
            return;
        }
    }
    //called when user clicks button
    public void showKnucks (View view){
        //show a random knucks
        TextView knucksDisplay = (TextView) findViewById(R.id.knucks_display);

        List<String> list = new ArrayList<>();
        while (is != null) {
            String str = "";
            list.add(str);
        }
        String[] randomKnucks = list.toArray(new String[0]);

        //String [] randomKnucks = {"Punk Cats", "Funk Bats", "RLRR LRLL"};
        String random = (randomKnucks[new Random().nextInt(randomKnucks.length)]);
        knucksDisplay.setText(random);
    }
}
