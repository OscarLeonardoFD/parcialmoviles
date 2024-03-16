package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class Factura2 extends AppCompatActivity {
    private TextView nombres;
    private EditText preciotomate;
    private EditText preciocebolla;
    private Button button2;
    private TextView textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura2);
        textView5 = findViewById(R.id.textView5);
        preciotomate = findViewById(R.id.preciotomate);
        preciocebolla = findViewById(R.id.preciocebolla);


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             textView5.setText(precio (Integer.parseInt(preciotomate.getText().toString()),Integer.parseInt(preciocebolla.getText().toString()))+"");
            }
        });


        nombres = findViewById(R.id.nombres);

        Bundle extras = getIntent().getExtras();
        if(extras != null && extras.getString("texto" )!= null){
            String texto = extras.getString("texto");
            nombres.setText(texto);
    }
}
public int precio(int a, int b){

        return a*800+b*500;
}

}
