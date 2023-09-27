package com.example.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.NumberFormat;

public class TipCalculatorActivity extends AppCompatActivity {

    private EditText editTextvalor;
    private TextView textViewValor;
    private TextView textViewGorjeta;
    private TextView textViewPct;
    private TextView textViewtotal;
    private SeekBar seekBar;
    private double Valor;
    private double porcentagem;
    private double gorjeta;
    private double total;
    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    private NumberFormat percentFormat = NumberFormat.getPercentInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        editTextvalor = findViewById(R.id.editTextNumber4);
        textViewGorjeta = findViewById(R.id.textViewValor);
        textViewPct = findViewById(R.id.textViewPct);
        textViewValor = findViewById(R.id.textViewValor);
        textViewtotal = findViewById(R.id.textViewTotal);
        seekBar = findViewById(R.id.seekBar2);

        editTextvalor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                int valorInt;
                try{
                    valorInt = Integer.parseInt(editTextvalor.getText().toString());
                }catch(NumberFormatException e){
                    valorInt = 0;
                }
                Valor = valorInt/100.00;
                atualizarValores();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void atualizarValores(){
        textViewValor.setText(currencyFormat.format((Valor)));
    }



}