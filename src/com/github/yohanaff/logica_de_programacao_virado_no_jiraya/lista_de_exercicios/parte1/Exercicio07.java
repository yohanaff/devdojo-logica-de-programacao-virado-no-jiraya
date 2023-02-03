package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

public class Exercicio07 {
    public static void main(String[] args) {
        String coca = "Coca";
        String fanta = "Fanta";
        String temp;

        System.out.println("Variáveis antes da permutação:");
        System.out.println("Coca: " + coca);
        System.out.println("Fanta: " + fanta);
        System.out.println("------------------------------------");

        temp = coca;
        coca = fanta;
        fanta = temp;

        System.out.println("Variáveis após a permutação:");
        System.out.println("Coca: " + coca);
        System.out.println("Fanta: " + fanta+ "\n");
        System.out.println("Essa Coca é Fanta! :P");
    }
}
