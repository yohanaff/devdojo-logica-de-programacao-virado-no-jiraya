package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

public class CalculoImpostoSalario {
    public static void main(String[] args) {
        double salario = 4400;
        double resultado;
        String porcentagem;

        if (salario > 4500) {
            resultado = salario * 0.3;
            porcentagem = "30%";
            System.out.println("Imposto de " + porcentagem + ": " + resultado);
        } else {
            resultado = salario * 0.15;
            porcentagem = "15%";
            System.out.println("Imposto de " + porcentagem + ": " + resultado);
        }
    }
}
