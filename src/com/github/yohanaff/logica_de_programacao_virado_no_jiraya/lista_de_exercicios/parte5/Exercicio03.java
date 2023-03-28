package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        ConversorTemperatura converter = new ConversorTemperatura();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Converter Celsius para Fahrenheit");
            System.out.println("2. Converter Fahrenheit para Celsius");
            System.out.println("3. Exibir memória");
            System.out.println("4. Encerrar programa");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            double input;
            double output;
            switch (escolha) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    input = scanner.nextDouble();
                    output = converter.celsiusParaFahrenheit(input);
                    System.out.printf("%.2f°C = %.2f°F\n", input, output);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    input = scanner.nextDouble();
                    output = converter.fahrenheitParaCelsius(input);
                    System.out.printf("%.2f°F = %.2f°C\n", input, output);
                    break;
                case 3:
                    converter.mostrarMemoria();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}