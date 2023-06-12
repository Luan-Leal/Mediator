package org.example;

public class Usuario {

    public String traduzir(String linguagem,String palavra) {
        return Tradutor.getInstancia().traduzir(linguagem, palavra);
    }



}
