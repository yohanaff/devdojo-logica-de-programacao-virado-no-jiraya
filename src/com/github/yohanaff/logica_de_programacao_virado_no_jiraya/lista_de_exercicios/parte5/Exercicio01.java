package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int escolha = scanner.nextInt();

        double resultado;
        try {
            switch (escolha) {
                case 1:
                    resultado = calculadora.somar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = calculadora.subtrair(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida! Encerrando programa.");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}

