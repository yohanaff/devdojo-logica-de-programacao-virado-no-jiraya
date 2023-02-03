package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio19A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor dos volts:");
        double volts = scanner.nextInt();
        System.out.println("Digite o valor dos amperes:");
        double amperes = scanner.nextInt();

        double resistencia = volts/amperes;
        System.out.println("Resistência elétrica: " + resistencia);
    }
}
