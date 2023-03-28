package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        final String login = "joao";
        final String password = "joao123";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o login:");
            String loginInput = scanner.next();
            System.out.println("Digite a senha:");
            String passwordInput = scanner.next();

            if (loginInput.equals(login) && passwordInput.equals(password)) {
                System.out.println("ACESSO CONCEDIDO!");
                break;
            } else {
                System.out.println("ACESSO NEGADO!");
            }
        }
        System.out.println("FIM DO PROGRAMA!");
    }
}
