package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte3;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
