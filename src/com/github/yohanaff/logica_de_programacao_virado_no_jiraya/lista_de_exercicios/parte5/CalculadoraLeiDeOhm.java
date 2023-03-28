package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

public class CalculadoraLeiDeOhm {
    public double calcularTensao(double resistencia, double corrente) {
        return resistencia * corrente;
    }

    public double calcularResistencia(double tensao, double corrente) {
        return tensao / corrente;
    }

    public double calcularCorrente(double tensao, double resistencia) {
        return tensao / resistencia;
    }

    public double calcularPotencia(double tensao, double corrente) {
        return tensao * corrente;
    }

}
