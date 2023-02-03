package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        int numero = scanner.nextInt();

        int quadrado = (int)Math.pow(numero, 2);
        System.out.println("Número elevado ao quadrado: " + quadrado);
        int cubo = (int)Math.pow(numero, 3);
        System.out.println("Número elevado ao cubo: " + cubo);
        int decima = (int)Math.pow(numero, 10);
        System.out.println("Número elevado a 10: " + decima);

        int soma = quadrado + cubo + decima;
        System.out.println("Soma dos três valores anteriores: " + soma);
    }
}
