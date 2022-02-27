package com.example.security;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void in(View view){
      TextView txt=findViewById(R.id.txt);
      c++;
      txt.setText(""+c);
    }
    public void out(View view){
        TextView txt=findViewById(R.id.txt);
        c--;
        txt.setText(""+c);
    }
}