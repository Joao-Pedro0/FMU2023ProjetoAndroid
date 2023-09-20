package com.example.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText txt1;
    private EditText txt2;
    private EditText txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.editTextNumber);
        txt2 = (EditText) findViewById(R.id.editTextNumber2);
        txt3 = (EditText) findViewById(R.id.editTextNumber3);
    }

    public void Soma (View view){
        int n1 = Integer.parseInt(txt1.getText().toString());
        int n2 = Integer.parseInt(txt2.getText().toString());
        int result = n1 + n2;
        txt3.setText(String.valueOf(result));
    }

    public void abrirJanela (View View){
        int n1 = Integer.parseInt(txt1.getText().toString());
        int n2 = Integer.parseInt(txt2.getText().toString());
        int result = n1 + n2;
        Intent intent = new Intent(this,  MainActivity2.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

}