package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário base do funcionário:");
        double salarioBase = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste salarial:");
        double reajuste = scanner.nextDouble();

        double novoSalario = salarioBase + (salarioBase * reajuste) / 100;
        System.out.println("Novo salário do funcionário: " + novoSalario);
    }
}
