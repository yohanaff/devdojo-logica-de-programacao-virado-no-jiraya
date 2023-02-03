package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horasTrabalhadas = 8;
        double valorHoraTrabalho = 10;
        double percentualDesconto = 0.15;
        double salarioBase = horasTrabalhadas * valorHoraTrabalho;
        double totalDescontos = percentualDesconto * salarioBase;
        double salarioLiquido = salarioBase - totalDescontos;

        System.out.println("Salário base: " + salarioBase);
        System.out.println("Salario líquido: " + salarioLiquido);
    }
}
