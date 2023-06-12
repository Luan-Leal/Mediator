package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TradutorTest {

    @Test
    void deveTraduzirParaIngles() {
        Usuario usuario = new Usuario();
        assertEquals("Hello", usuario.traduzir("Inglês","Oi"));
    }

    @Test
    void deveTraduzirParaEspanhol() {
        Usuario usuario = new Usuario();
        assertEquals("Hola", usuario.traduzir("Espanhol","Oi"));
    }

    @Test
    void naoDeveEncontrarUmaLinguaParaTraduzir() {
        Usuario usuario = new Usuario();
        assertEquals("Incapaz de traduzir essa palavra", usuario.traduzir("Português","Oi"));
    }

    @Test
    void naoDeveEncontrarPalavraParaTraduzir() {
        Usuario usuario = new Usuario();
        assertEquals("Incapaz de traduzir essa palavra", usuario.traduzir("Inglês","Erro"));
    }

    @Test
    void naoDeveEncontrarLinguagemEPalavraParaTraduzir() {
        Usuario usuario = new Usuario();
        assertEquals("Incapaz de traduzir essa palavra", usuario.traduzir("Português","Erro"));
    }

}