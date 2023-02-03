package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números inteiros:");
        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

        System.out.print("d: ");
        int d = scanner.nextInt();

        System.out.print("e: ");
        int e = scanner.nextInt();

        System.out.println("Números divisíveis por 5 ou 3:");
        if(a % 2 == 0 || a % 3 == 0) {
            System.out.println(a);
        }
        if(b % 2 == 0 || b % 3 == 0) {
            System.out.println(b);
        }
        if(c % 2 == 0 || c % 3 == 0) {
            System.out.println(c);
        }
        if(d % 2 == 0 || d % 3 == 0) {
            System.out.println(d);
        }
        if(e % 2 == 0 || e % 3 == 0) {
            System.out.println(e);
        }

    }
}
