package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        int x = scanner.nextInt();

        System.out.println("Digite o valor de y:");
        int y = scanner.nextInt();

        System.out.println("Para escolher a operação aritmética, digite");
        System.out.println("1: soma");
        System.out.println("2: subtração");
        System.out.println("3: multiplicação");
        System.out.println("4: divisão");

        int operacao = scanner.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("x + y = " + (x + y));
                break;
            case 2:
                System.out.println("x - y = " + (x - y));
                break;
            case 3:
                System.out.println("x * y = " + (x * y));
                break;
            case 4:
                System.out.println("x / y = " + (x / y));
                break;
            default:
                System.out.println("Escolha uma opção válida!");
        }
    }
}
