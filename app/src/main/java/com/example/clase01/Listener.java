package com.example.clase01;

import android.util.Log;
import android.view.View;

public class Listener implements View.OnClickListener {

    public Listener(MainActivity m) {

    }

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.btnCopiar){
            Log.d("mensaje","boton copiar");
        }
        if(v.getId()==R.id.btnBorrar){
            Log.d("mensaje","Boton borrar");
        }
    }

}
