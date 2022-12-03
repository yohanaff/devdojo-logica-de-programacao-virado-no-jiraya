package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

public class CalculoPorcentagemSalario {
    public static void main(String[] args) {
        double salario = 5000;
        double resultado;

         resultado = salario * 0.30;
         System.out.println("30% do salário: " + resultado);

         resultado = salario * 0.15;
         System.out.println("15% do salário: " + resultado);

         resultado = salario * 0.05;
         System.out.println("05% do salário: " + resultado);
    }
}
