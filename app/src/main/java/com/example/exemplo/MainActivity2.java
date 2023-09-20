package com.example.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView = findViewById(R.id.textView);
        int soma = getIntent().getIntExtra("result", 0);
        TextView.setText(Integer.toString(soma));

    }
}