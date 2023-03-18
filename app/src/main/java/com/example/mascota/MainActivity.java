package com.example.mascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbCat;

    private  RadioButton rbDog;

    private EditText namePet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio();
    }

    private void inicio (){
        rbCat=findViewById(R.id.rbGato);
        rbDog=findViewById(R.id.rbPerro);
        namePet = findViewById(R.id.etNombre);
    }

    public void totalPago(View view){
        String tipo = (rbCat.isChecked() == true) ? "gato" : "perro";
        Mascota mascota = new Mascota(namePet.getText().toString(),tipo);
        double resultadoPago = mascota.getCalculoPago();
        irResultado(resultadoPago,mascota);
    }
    public void irResultado (double pago, Mascota mascota){
        Intent resultado = new Intent(this,Resultado.class);
        resultado.putExtra("result",(Serializable) mascota);
        resultado.putExtra("pago",pago);
        startActivity(resultado);
    }
}