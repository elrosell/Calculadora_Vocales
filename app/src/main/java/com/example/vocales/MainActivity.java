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

        botoncito = findViewById(R.id.cons);
        botoncito.setOnClickListener(this);

        botoncito = findViewById(R.id.esp);
        botoncito.setOnClickListener(this);

        botoncito = findViewById(R.id.num);
        botoncito.setOnClickListener(this);

        botoncito = findViewById(R.id.car);
        botoncito.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Clasesita objetito = new Clasesita();
        objetito.setTexto(editadito.getText().toString());
        if (objetito.vocalA() == 1)
        {
        Toast.makeText(this, "Tiene " + objetito.vocalA() + " a", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Tiene " + objetito.vocalA() + " aes", Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocalE() == 1)
        {
        Toast.makeText(this, "Tiene " + objetito.vocalE() + " e", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Tiene " + objetito.vocalE() + " es", Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocalI() == 1)
        {
        Toast.makeText(this, "Tiene " + objetito.vocalI() + " i", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Tiene " + objetito.vocalI() + " íes", Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocalO() == 1)
        {
        Toast.makeText(this, "Tiene " + objetito.vocalO() + " o", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Tiene " + objetito.vocalO() + " oes", Toast.LENGTH_SHORT).show();
        }

        if (objetito.vocalU() == 1)
        {
        Toast.makeText(this, "Tiene " + objetito.vocalU() + " u", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Tiene " + objetito.vocalU() + " úes", Toast.LENGTH_SHORT).show();
        }

    }


}