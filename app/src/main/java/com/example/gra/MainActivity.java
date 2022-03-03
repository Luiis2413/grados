package com.example.gra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

//un cambio

public class MainActivity extends AppCompatActivity {

    //variable para editar texto
    EditText grados;


    public void calcular(View view)
    {
     grados=findViewById(R.id.grado);
        double n= Double.parseDouble(grados.getText().toString());

        celsius celsius= new celsius("C",n);
//sobre carga de metodos convertir un double a string
        String t = String.valueOf(99.0);
//-------------------------------------------------------------------------------
        fahrenheide f=new fahrenheide("F",n);
        fahrenheide r=f.valueOf(celsius);

        Toast.makeText(this,r.getNumero().toString(),Toast.LENGTH_SHORT).show();

        TextView resultado = (TextView) findViewById(R.id.faren);
        resultado.setText(r.getNumero().toString()+r.getSimbolo());
        //editar texto
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsius celsius= new celsius("C",58.8);
//sobre carga de metodos convertir un double a string
    //    String t = String.valueOf(99.0);

      //  fahrenheide f=new fahrenheide("F",0.0);
        //fahrenheide r=f.valueOf(celsius);

       // Toast.makeText(this,r.getNumero().toString(),Toast.LENGTH_SHORT).show();

//        TextView faren = (TextView) findViewById(R.id.faren);
  //      faren.setText(r.getNumero().toString());







    }
}