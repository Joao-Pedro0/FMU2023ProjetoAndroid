package com.example.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataBaseActivity extends AppCompatActivity {

    private  EditText editTextRe;
    private  EditText editTextNome;
    private  EditText editTextAdmissao;
    private  EditText editTextSalario;
    private  EditText editTextCargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);

        editTextRe = findViewById(R.id.editTextRe);
        editTextNome = findViewById(R.id.editTextNome);
        editTextAdmissao = findViewById(R.id.editTextDataAdmissao);
        editTextSalario = findViewById(R.id.editTextSalario);
        editTextCargo = findViewById(R.id.editTextCargo);
    }


    public void cadastrar(View view){

        int Re = Integer.parseInt(editTextRe.getText().toString());
        String Nome = editTextNome.getText().toString();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAdmissao;
        try {
            dataAdmissao = DateFormat.parse(editTextAdmissao.getText().toString());
        }
        catch(ParseException e){
            dataAdmissao = new Date();
        }
        Double Salario = Double.parseDouble(editTextSalario.getText().toString());
        String Cargo = editTextCargo.getText().toString();

        AppDatabase db = AppDatabase.getInstance(this);
        FuncionarioDAO dao = db.funcionarioDao();
        Funcionario f = new Funcionario(Re,Nome, dataAdmissao, Salario, Cargo);
        dao.insert(f);

    }

    public void Listar(View view){
        Intent intent = new Intent(this,  MainActivityListar.class);
        startActivity(intent);
    }
}