package com.example.clase01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCopiar = (Button) super.findViewById(R.id.btnCopiar);
        Button btnBorrar = (Button) super.findViewById(R.id.btnBorrar);
        TextView textoVista = (TextView) super.findViewById(R.id.textoVista);
        EditText textoIngreso = (EditText) super.findViewById(R.id.textoIngreso);



    }
}
