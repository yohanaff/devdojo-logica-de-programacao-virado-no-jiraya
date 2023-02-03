package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida em pés:");
        double medidaPes = scanner.nextDouble();

        System.out.println("O equivalente em metros é: " + medidaPes * 0.3048);
    }
}
