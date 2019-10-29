package com.devco.unittest;

public class Calculadora {
    public String calcular(int i) {
        return mapNumber(i);
    }

    public String mapNumber(int i) {
        if(i==5){
            return "V";
        }else{
            return "I";
        }
    }
}
