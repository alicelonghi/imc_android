package com.example.imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class recebe extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recebe);

        Intent intentRecebe = getIntent();
        Bundle result = intentRecebe.getExtras();

        TextView resultIMC = (TextView)findViewById(R.id.resultIMC);

        if(result != null) {
            Float resultado = result.getFloat("chave_float");
<<<<<<< HEAD
            if(resultado < 19){
                //abaixo
                resultIMC.setText(R.string.abaixo);
            }
            else if(resultado > 32){
                resultIMC.setText(R.string.acima);
            }
            else{
                //ok
                resultIMC.setText(R.string.ideal);
=======
            //resultIMC.setText(resultado.toString());
            if(resultado < 19){
                //abaixo
                resultIMC.setText("Abaixo do peso!");
            }
            else if(resultado > 32){
                resultIMC.setText("Acima do peso!");
            }
            else{
                //ok
                resultIMC.setText("Peso ok!");
>>>>>>> 5ba80944408064e81557a3a96df854f98a11d0c4
            }
            Toast.makeText(recebe.this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
        }

        
    }
}
