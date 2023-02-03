package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        System.out.println("Area do círculo = " + Math.PI * Math.pow(raio, 2));
    }
}
