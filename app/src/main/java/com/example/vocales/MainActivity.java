package com.example.vocales;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editadito;
    Button botoncito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editadito = findViewById(R.id.texto);
        botoncito = findViewById(R.id.voc);
        botoncito.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Clasesita objetito = new Clasesita();
        objetito.setTexto(editadito.getText().toString());
        if (objetito.vocalA() == 1){
        Toast.makeText(this, "Tiene " + objetito.vocalA() + " a", Toast.LENGTH_SHORT).show();}
        else {
            Toast.makeText(this, "Tiene " + objetito.vocalA() + " as", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Tiene " + objetito.vocalE() + " es", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Tiene " + objetito.vocalI() + " is", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Tiene " + objetito.vocalO() + " os", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Tiene " + objetito.vocalU() + " us", Toast.LENGTH_SHORT).show();
    }
}