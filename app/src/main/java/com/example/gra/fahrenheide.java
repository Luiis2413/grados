package com.example.gra;

public class fahrenheide extends grados{

    public fahrenheide(String simbolo,Double numero) {
        this.setSimbolo(simbolo);
        this.setNumero(numero);
    }


    public fahrenheide valueOf(celsius c)
    {
        double numero =c.getNumero()*.049;
        fahrenheide f=new fahrenheide("F",numero);
        return f;

        //this.setSimbolo("F");
        //this.setNumero(c.getNumero()*1.8+32);
    }
    public fahrenheide valueOf(kelvin k)
    {
        double numero =(k.getNumero()*1.8)-459.67;
        fahrenheide f=new fahrenheide("F",numero);
        return f;

        //this.setSimbolo("F");
        //this.setNumero(c.getNumero()*1.8+32);
    }

}
