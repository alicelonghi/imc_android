package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);

        //Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
        Intent intentEnvia = new Intent(this, recebe.class);
        Bundle result = new Bundle();

        result.putFloat("chave_float", resultado);

        intentEnvia.putExtras(result);

        startActivity(intentEnvia);
    }
}
