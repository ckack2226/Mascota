package com.example.mascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button begin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.begin = findViewById(R.id.btnBegin);
    }

    public void beginRegister(View view){
        Intent start = new Intent(this,MainActivity.class);
        startActivity(start);
    }
}