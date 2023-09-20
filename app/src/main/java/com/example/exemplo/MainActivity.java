package com.example.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        private EditText txt1;
        private EditText txt2;
        private EditText txt3;
        public void Soma (View view){

        txt1 = (EditText) findViewById(R.id.editTextNumber);
        txt2 = (EditText) findViewById(R.id.editTextNumber2);
        txt3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(txt1.getText().toString());
        int n2 = Integer.parseInt(txt2.getText().toString());
        int result = n1 + n2;
        txt3.setText(result);
    }

}