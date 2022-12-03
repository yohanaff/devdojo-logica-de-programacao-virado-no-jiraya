package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

import java.util.Scanner;

public class ValidacaoNomeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o login:");
        String login = scanner.next();

        if (login.isBlank() || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
            System.out.println("Nome de usuário inválido");
        } else {
            System.out.println("Login \"" + login + "\" válido");
        }
    }
}
