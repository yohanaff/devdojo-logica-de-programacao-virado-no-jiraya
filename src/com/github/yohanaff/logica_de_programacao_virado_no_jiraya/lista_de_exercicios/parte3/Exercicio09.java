package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte3;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 1;
        while (escolha != 0) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Encerrando programa.");
                break;
            }

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
                System.out.println("Opção inválida!");
            }
        }
    }
}
