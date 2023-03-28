package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

public class Calculadora {
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("A divisão por zero não é permitida.");
        }
        return num1 / num2;
    }

    public double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public int calcularRaizQuadrada(double num) {
        int i = 1;
        int count = 0;

        while (num >= i) {
            num -= i;
            i += 2;
            count++;
        }
        return count;
    }
}