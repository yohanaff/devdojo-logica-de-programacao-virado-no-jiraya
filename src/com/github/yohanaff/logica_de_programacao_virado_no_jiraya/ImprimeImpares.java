package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

import java.util.Scanner;

public class ImprimeImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int contador = 0;

        while (contador <= numero ) {
            if(contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
