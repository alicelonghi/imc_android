package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
=======
import android.view.View;
>>>>>>> 5ba80944408064e81557a3a96df854f98a11d0c4
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        final EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        final EditText txtAltura = (EditText) findViewById(R.id.txtAltura);
        final Button btnC = (Button) findViewById(R.id.btnC);
        btnC.setEnabled(false);
        txtAltura.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(txtPeso.getText().toString().length()== 0 || txtAltura.getText().toString().length() == 0 ) {
                    btnC.setEnabled(false);
                }
                else {
                    btnC.setEnabled(true);
                }
            }
        });

        txtPeso.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(txtPeso.getText().toString().length()== 0 || txtAltura.getText().toString().length() == 0 ) {
                    btnC.setEnabled(false);
                }
                else {
                    btnC.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
    public void btnCalcularOnClick(View v){
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);
        Button btnC = (Button) findViewById(R.id.btnC);

        float peso = Float.parseFloat(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());
=======
    }

    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

>>>>>>> 5ba80944408064e81557a3a96df854f98a11d0c4
        float resultado = peso / (altura * altura);

        //Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
        Intent intentEnvia = new Intent(this, recebe.class);
        Bundle result = new Bundle();

        result.putFloat("chave_float", resultado);

        intentEnvia.putExtras(result);

        startActivity(intentEnvia);
    }
}
