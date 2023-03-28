package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte4;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = {2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i] * v2[i]);
        }
    }
}
