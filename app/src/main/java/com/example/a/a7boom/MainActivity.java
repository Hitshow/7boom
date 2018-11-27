package com.example.a.a7boom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }

    public void count(View view) {
        x=x+1;
        btn.setText("this is click number" + x);
        if((x%7==0)||(x/10==7)||(x/100==7)||(x%10==7)) {
            btn.setText("boom!");
        }
    }
}