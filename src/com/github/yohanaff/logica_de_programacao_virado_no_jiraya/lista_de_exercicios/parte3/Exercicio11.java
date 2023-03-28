package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para obter a raiz quadrada através da equação de Pell:");
        int num = scanner.nextInt();

        int i = 1;
        int count = 0;

        while (num >= i) {
            num -= i;
            i += 2;
            count++;
        }

        System.out.println(count);
    }
}
