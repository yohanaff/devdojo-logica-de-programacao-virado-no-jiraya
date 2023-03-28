package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");

        int[] primeirosNoveDigitos = new int[9];
        int[] multiplicador1 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] multiplicador2 = new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        System.out.println("Digite os primeiros nove dígitos do CPF:");
        String inputDigitos = "";
        for (int i = 0; i < primeirosNoveDigitos.length; i++) {
            try {
                primeirosNoveDigitos[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro! Você deve inserir um número inteiro de 9 dígitos");
                break;
            }
            inputDigitos = inputDigitos + primeirosNoveDigitos[i];
        }

        System.out.println("Primeiros nove dígitos: " + inputDigitos);

        int digitoVerificador1 = calculaDigitoVerificador(primeirosNoveDigitos, multiplicador1);
        int digitoVerificador2 = calculaDigitoVerificador(concatenaVetores(primeirosNoveDigitos, digitoVerificador1), multiplicador2);

        System.out.println("CPF completo: " + formataCpf(primeirosNoveDigitos, digitoVerificador1, digitoVerificador2));
    }

    private static int calculaDigitoVerificador(int[] digitos, int[] multiplicador) {
        int soma = 0;
        for (int i = 0; i < digitos.length; i++) {
            soma += digitos[i] * multiplicador[i];
        }

        int resultado = 11 - (soma % 11);
        return resultado > 9 ? 0 : resultado;
    }

    private static int[] concatenaVetores(int[] a, int b) {
        int[] result = new int[a.length + 1];
        System.arraycopy(a, 0, result, 0, a.length);
        result[a.length] = b;
        return result;
    }

    private static String formataCpf(int[] primeirosNoveDigitos, int digitoVerificador1, int digitoVerificador2) {
        int[] cpf = new int[11];
        System.arraycopy(primeirosNoveDigitos, 0, cpf, 0, primeirosNoveDigitos.length);
        cpf[9] = digitoVerificador1;
        cpf[10] = digitoVerificador2;

        String cpfFormatado = "";
        for (int i = 0; i < cpf.length; i++) {
            cpfFormatado = cpfFormatado + cpf[i] + "";

            if (i == 2 || i == 5) {
                cpfFormatado = cpfFormatado + ".";
            } else if (i == 8) {
                cpfFormatado = cpfFormatado + "-";
            }
        }
        return cpfFormatado;
    }
}