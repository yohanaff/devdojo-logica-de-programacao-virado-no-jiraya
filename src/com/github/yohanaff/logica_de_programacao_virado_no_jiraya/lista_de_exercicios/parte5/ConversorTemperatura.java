package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

import java.util.LinkedList;

public class ConversorTemperatura {
    private static final int TAMANHO_MEMORIA = 5;
    private LinkedList<String> memoria = new LinkedList<>();

    public double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        adicionarNaMemoria(celsius + "°C = " + fahrenheit + "°F");
        return fahrenheit;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        adicionarNaMemoria(fahrenheit + "°F = " + celsius + "°C");
        return celsius;
    }

    private void adicionarNaMemoria(String entrada) {
        if (memoria.size() >= TAMANHO_MEMORIA) {
            memoria.removeFirst();
        }
        memoria.addLast(entrada);
    }

    public void mostrarMemoria() {
        if (memoria.isEmpty()) {
            System.out.println("Nenhuma operação realizada.");
        } else {
            System.out.println("Últimas " + TAMANHO_MEMORIA + " operações:");
            for (String entry : memoria) {
                System.out.println(entry);
            }
        }
    }
}