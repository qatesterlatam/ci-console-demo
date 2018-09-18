package com.cidemo.service;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int calcularMayor(int a,int b,int c){

        List<Integer> lista = new ArrayList<>();

        lista.add(a);
        lista.add(b);
        lista.add(c);

        int mayor = -9999999;
        for (int i = 0; i<lista.size(); i++){
            if(lista.get(i) > mayor)
                mayor=lista.get(i);
        }
        return mayor;
    }
}
