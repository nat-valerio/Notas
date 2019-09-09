package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView textViewnotaMaior;
    private TextView textViewnotaMenor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textViewnotaMaior = findViewById(R.id.text_view_notaMaior);
        textViewnotaMenor = findViewById(R.id.text_view_notaMenor);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra("Resultado");
        textViewnotaMaior.setText(mensagem);
        textViewnotaMenor.setText(mensagem);
    }
}
