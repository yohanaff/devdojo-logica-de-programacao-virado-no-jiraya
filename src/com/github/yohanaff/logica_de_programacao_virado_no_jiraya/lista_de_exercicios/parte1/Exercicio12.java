package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();
        System.out.println("Digite o valor em real:");
        double valorReal = scanner.nextDouble();

        double valorDolar = valorReal/cotacaoDolar;
        System.out.println(valorReal + " reais vale " + valorDolar + " dólares");
    }
}
