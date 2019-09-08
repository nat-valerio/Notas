package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView textViewNotaMaior;
    private TextView textViewNotaMenor;
    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textViewNotaMaior = findViewById(R.id.text_view_notaMaior);
        textViewNotaMenor = findViewById(R.id.text_view_notaMenor);
        textViewInfo = findViewById(R.id.text_view_informacao);

        Intent intent = getIntent();
        String nota = intent.getStringExtra("Suas notas: ");
        textViewInfo.setText(nota);

    }
}
