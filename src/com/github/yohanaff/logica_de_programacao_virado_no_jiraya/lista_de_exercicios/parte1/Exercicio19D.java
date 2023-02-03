package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

import java.util.Scanner;

public class Exercicio19D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da tensão:");
        double tensao = scanner.nextInt();
        System.out.println("Digite o valor da corrente:");
        double corrente = scanner.nextInt();

        double potencia = tensao * corrente;
        System.out.println("O valor da potência é: " + potencia);
    }
}
