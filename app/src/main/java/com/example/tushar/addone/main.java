package com.example.tushar.addone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import static com.example.tushar.addone.R.styleable.View;

public class main extends AppCompatActivity {


    int count;
    Button add, sub;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count=0;
        add = (Button) findViewById(R.id.badd);
        sub = (Button) findViewById(R.id.bsub);
        display=(TextView) findViewById(R.id.tdisplay);

        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                count= count+1;
                display.setText("Numbar is " +count);
            }


        });

        sub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                count=count-1;
                display.setText("Numbar is " +count);

            }


        });


    }
}
