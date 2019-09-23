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
            }
            Toast.makeText(recebe.this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
        }

        
    }
}
