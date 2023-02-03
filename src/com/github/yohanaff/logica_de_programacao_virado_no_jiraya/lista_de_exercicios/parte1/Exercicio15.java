package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

public class Exercicio15 {
    public static void main(String[] args) {
        double distancia = 100;
        double tempoSegundos = 50;

        double velocidadeMetroPorSegundo = (distancia * 1000)/(tempoSegundos * 60);
        System.out.println("A velocidade do projétil é " + velocidadeMetroPorSegundo + " m/s");
    }
}
