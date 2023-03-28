package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Escolha uma operação:");
        System.out.println("1. Potenciação");
        System.out.println("2. Raiz quadrada");
        int escolha = scanner.nextInt();

        double resultado;
        try {
            switch (escolha) {
                case 1:
                    System.out.println("Digite a base:");
                    double base = scanner.nextDouble();
                    System.out.println("Digite o expoente:");
                    double expoente = scanner.nextDouble();
                    resultado = calculadora.calcularPotencia(base, expoente);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite um número inteiro para descobrir a raiz quadrada utilizando a equação de Pell:");
                    int num = scanner.nextInt();
                    int resultadoRaizQuadrada = calculadora.calcularRaizQuadrada(num);
                    System.out.println("Resultado: " + resultadoRaizQuadrada);
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
