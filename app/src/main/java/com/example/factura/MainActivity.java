package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText apellido;
   private Button button;
   private String texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.apellido);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto = nombre.getText().toString();
                if (texto.isEmpty()){
                    Toast.makeText(MainActivity.this,"no dejes la casilla en vacio!", Toast.LENGTH_LONG).show();
                }else{

                    Intent intent = new Intent(MainActivity.this,Factura2.class);
                    intent.putExtra("texto",texto);
                    startActivity(intent);

                }
            }
        });





    }
}