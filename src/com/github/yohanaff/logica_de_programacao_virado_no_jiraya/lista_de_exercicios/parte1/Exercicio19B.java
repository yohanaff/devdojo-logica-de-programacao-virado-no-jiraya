package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio19B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da resitencia:");
        double resitencia = scanner.nextInt();
        System.out.println("Digite o valor dos amperes:");
        double amperes = scanner.nextInt();

        double tensao = resitencia * amperes;
        System.out.println("O valor da tensão é: " + tensao);
    }
}
