package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("1) Calcular imposto");
            System.out.println("2) Depositar salário");
            System.out.println("3) Sair");

            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Imposto calculado");
                    break;
                case 2:
                    System.out.println("Salário depositado com sucesso");
                    break;
                case 3:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Escolha um número válido");
            }

            if(escolha != 3) {
                System.out.println("------------------------------------");
                System.out.println("Faça uma nova escolha:");
            }
        }
    }
}
