package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.imc.model.Imc;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Imc usuario = new Imc();
    EditText peso;
    EditText altura;
    Button calcular;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = findViewById(R.id.editPeso);
        altura = findViewById(R.id.editAltura);
        calcular = findViewById(R.id.button);
        resultado = findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setAltura(Double.parseDouble(altura.getText().toString()));
                usuario.setPeso(Double.parseDouble(peso.getText().toString()));
                usuario.calcularImc();
                DecimalFormat formato = new DecimalFormat("#.#");

                if (usuario.getImc() <= 18.5) {
                    resultado.setText("Abaixo do Peso; Imc: " + formato.format(usuario.getImc()));
                }else if (usuario.getImc() <= 24.9) {
                    resultado.setText("Normal; Imc: " + formato.format(usuario.getImc()));
                }
                else if (usuario.getImc() <= 30){
                    resultado.setText("Sobrepeso; Imc: " + formato.format(usuario.getImc()));
                }
                else if (usuario.getImc() <= 34.9){
                    resultado.setText("Obesidade grau 1; Imc: " + formato.format(usuario.getImc()));
                }
                else if (usuario.getImc() <= 40) {
                    resultado.setText("Obesidade grau 2; Imc: " + formato.format(usuario.getImc()));
                }
                else{
                    resultado.setText("Obesidade grau 3; Imc: " + formato.format(usuario.getImc()));
                }
            }
        });
    }
}