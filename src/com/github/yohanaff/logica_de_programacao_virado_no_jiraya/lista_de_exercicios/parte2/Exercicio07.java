package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte2;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da operação desejada:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= 4) {
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            double resultado;
            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    break;
            }
        } else {
            System.out.println("Opção inválida! Encerrando programa.");
        }
    }
}