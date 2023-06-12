package org.example;

public class Tradutor implements ITradutor {

    private static Tradutor instancia = new Tradutor();

    private Tradutor() {}

    public static Tradutor getInstancia() {
        return instancia;
    }

    public String traduzir(String linguagem,String palavra) {
        if(linguagem.equalsIgnoreCase("Inglês") && palavra.equalsIgnoreCase("Oi")) {
            return "Hello";
        }
        if(linguagem.equalsIgnoreCase("Espanhol") && palavra.equalsIgnoreCase("Oi")) {
            return "Hola";
        }
        return "Incapaz de traduzir essa palavra";
    }

}
