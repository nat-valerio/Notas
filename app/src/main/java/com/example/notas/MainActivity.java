package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declarando objetos
    private EditText editTextNota1;
    private EditText editTextNota2;
    private EditText editTextNota3;

    private TextView textViewNotaMaior;
    private TextView textViewNotaMenor;
    private TextView textViewMedia;
    private TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculando os objetos com elementos de layout
        editTextNota1 = findViewById(R.id.edit_text_nota1);
        editTextNota2 = findViewById(R.id.edit_text_nota2);
        editTextNota3 = findViewById(R.id.edit_text_nota3);

        textViewNotaMaior = findViewById(R.id.text_view_nota_maior);
        textViewNotaMenor = findViewById(R.id.text_view_nota_menor);
        textViewMedia = findViewById(R.id.text_view_media);
        textViewStatus = findViewById(R.id.text_view_status);

        textViewStatus.setText("");
        textViewNotaMaior.setText("");
        textViewNotaMenor.setText("");
        textViewMedia.setText("Calcule a sua Média");
    }

    public void calcularMedia(View v){

        double nota1 = Double.parseDouble(editTextNota1.getText().toString());
        double nota2 = Double.parseDouble(editTextNota2.getText().toString());
        double nota3 = Double.parseDouble(editTextNota3.getText().toString());

        double resultado = (nota1 + nota2 + nota3)/3;


        if(resultado >= 7){
            textViewStatus.setText("Aprovado");
            textViewStatus.setTextColor(
                    getResources().
                            getColor(R.color.aprovado));
        }
        else if(resultado <7 && resultado >=5){
            textViewStatus.setText("Recuperação");
            textViewStatus.setTextColor(
                    getResources().
                            getColor(R.color.recuperacao)
            );
        }
        else if (resultado <5){
            textViewStatus.setText("Reprovado");
            textViewStatus.setTextColor(
                    getResources().
                            getColor(R.color.reprovado)
            );
        }
    }

    public void chamaInfo(View v){

        double n1 = Double.parseDouble(editTextNota1.getText().toString());
        double n2 = Double.parseDouble(editTextNota2.getText().toString());
        double n3 = Double.parseDouble(editTextNota3.getText().toString());

        if(n1 > n2 && n1 > n3){
            textViewNotaMaior.setText("Nota mais alta: " + n1);
        }
        else if (n2 > n3){
            textViewNotaMaior.setText("Nota mais alta:" + n2);
        }
        else if (n3 > n1 && n3 > n2){
            textViewNotaMaior.setText("Nota mais alta:" + n3);
        }

        if (n1 < n2 && n1 < n3){
            textViewNotaMenor.setText("Nota mais baixa: " + n1);
        }
        else if (n2 < n3){
            textViewNotaMenor.setText("Nota mais baixa: " + n2);
        }
        else if (n3 < n1 && n3 < n2){
            textViewNotaMenor.setText("Nota mais baixa:" + n3);
        }

    }
}
