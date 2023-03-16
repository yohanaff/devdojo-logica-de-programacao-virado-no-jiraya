package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC (Índice de Massa Corporal)");

        System.out.println("Digite o seu peso:");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura*altura);

        String resultado;
        if(imc < 10) {
            resultado = "Desnutrição Grau 5";
        } else if (imc < 12.9) {
            resultado = "Desnutrição Grau 4";
        } else if (imc < 15.9) {
            resultado = "Desnutrição Grau 3";
        } else if (imc < 16.9) {
            resultado = "Desnutrição Grau 2";
        } else if (imc < 18.4) {
            resultado = "Desnutrição Grau 1";
        } else if (imc < 24.9) {
            resultado = "Peso Normal";
        } else if (imc < 29.9) {
            resultado = "Sobrepeso";
        } else if (imc < 34.5) {
            resultado = "Obesidade Grau 1";
        } else if (imc < 39.9) {
            resultado = "Obesidade Grau 2";
        } else {
            resultado = "Obesidade Grau 3";
        }

        System.out.println("Seu IMC é: " + imc);
        System.out.println(resultado);
    }
}
