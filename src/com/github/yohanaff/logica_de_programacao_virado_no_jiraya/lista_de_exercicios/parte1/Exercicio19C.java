package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio19C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da tensão:");
        double tensao = scanner.nextInt();
        System.out.println("Digite o valor da resitencia:");
        double resitencia = scanner.nextInt();

        double corrente = tensao/resitencia;
        System.out.println("O valor da corrente é: " + corrente);
    }
}
