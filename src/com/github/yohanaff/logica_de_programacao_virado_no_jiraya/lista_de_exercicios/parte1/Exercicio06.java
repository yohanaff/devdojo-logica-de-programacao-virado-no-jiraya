package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte1;

public class Exercicio06 {
    public static void main(String[] args) {
        int tempo = 3;
        int velocidade = 80;
        int distancia = tempo * velocidade;
        int consumo = distancia / 12;

        System.out.println("O automóvel consumiu " + consumo + " litros nessa viagem");
    }
}
