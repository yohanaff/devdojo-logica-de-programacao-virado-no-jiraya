package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

public class Exercicio08 {
    public static void main(String[] args) {
        double valor = 1000;
        double taxa = 0.10;
        int tempoAtraso = 12;

        double total = valor + (valor * (taxa) * tempoAtraso);
        System.out.println("Total a pagar com juros: " + total);
    }
}
