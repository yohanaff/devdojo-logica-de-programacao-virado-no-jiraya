package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros:");
        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

        int maior = c;
        if (a> maior || b > maior) {
            if (a > b) {
                maior = a;
            } else {
                maior = b;
            }
        }
        int menor = c;
        if (a < menor || b < menor) {
            if (a < b) {
                menor = a;
            } else {
                menor = b;
            }
        }

        int meio = a + b + c - maior - menor;
        System.out.printf("Números em ordem crescente: %d %d %d", menor, meio, maior);
    }
}