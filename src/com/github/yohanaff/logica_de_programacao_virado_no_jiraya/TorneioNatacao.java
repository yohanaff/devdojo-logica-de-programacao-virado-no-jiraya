package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.next();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        final String NOME_IDADE = "Nome: " + nome + " | " + "Idade: " + idade;

        if(idade <= 10) {
            System.out.println(NOME_IDADE);
            System.out.println("Participará da categoria infatil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(NOME_IDADE);
            System.out.println("Participará da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(NOME_IDADE);
            System.out.println("Participará da categoria pré-adulto");
        } else {
            System.out.println(NOME_IDADE);
            System.out.println("Participará da categoria adulta");
        }
    }
}
