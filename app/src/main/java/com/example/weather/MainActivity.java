package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1;
        final Button button2;
        final TextView text;
       final int storyindex = 1;
        button1 = findViewById(R.id.topbutton);
        button2 = findViewById(R.id.bottombutton);
        text = findViewById(R.id.story);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(storyindex==1){
                text.setText(R.string.story2);
                button1.setText(R.string.answer3);
                button2.setText(R.string.answer4);
                int storyindex=2;
            }
            else if(storyindex==2){

            }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            text.setText(R.string.story3);
            button1.setText(R.string.answer5);
            button1.setText(R.string.answer6);
            }
        });
    }

}
