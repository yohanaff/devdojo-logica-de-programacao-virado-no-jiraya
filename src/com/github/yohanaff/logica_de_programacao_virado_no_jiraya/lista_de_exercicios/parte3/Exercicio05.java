package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte3;

public class Exercicio05 {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int proximo = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println(proximo);
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
