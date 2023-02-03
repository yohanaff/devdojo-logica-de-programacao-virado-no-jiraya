package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }

        System.out.println("Menor número: " + min);
        System.out.println("Maior número: " + max);
    }
}
