package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("Dentro do valor permitido");
        } else {
            System.out.println("Fora do valor permitido");
        }
    }
}
