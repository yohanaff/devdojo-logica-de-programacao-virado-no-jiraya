package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        CalculadoraLeiDeOhm calculadora = new CalculadoraLeiDeOhm();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Calcular Tensão Elétrica");
            System.out.println("2. Calcular Resistência Elétrica");
            System.out.println("3. Calcular Corrente Elétrica");
            System.out.println("4. Calcular Potência Elétrica");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            double valor1, valor2, resultado;
            switch (escolha) {
                case 1:
                    System.out.print("Digite a resistência (ohms): ");
                    valor1 = scanner.nextDouble();
                    System.out.print("Digite a corrente (amperes): ");
                    valor2 = scanner.nextDouble();
                    resultado = calculadora.calcularTensao(valor1, valor2);
                    System.out.printf("Tensão elétrica: %.2f volts\n", resultado);
                    break;
                case 2:
                    System.out.print("Digite a tensão (volts): ");
                    valor1 = scanner.nextDouble();
                    System.out.print("Digite a corrente (amperes): ");
                    valor2 = scanner.nextDouble();
                    resultado = calculadora.calcularResistencia(valor1, valor2);
                    System.out.printf("Resistência elétrica: %.2f ohms\n", resultado);
                    break;
                case 3:
                    System.out.print("Digite a tensão (volts): ");
                    valor1 = scanner.nextDouble();
                    System.out.print("Digite a resistência (ohms): ");
                    valor2 = scanner.nextDouble();
                    resultado = calculadora.calcularCorrente(valor1, valor2);
                    System.out.printf("Corrente elétrica: %.2f amperes\n", resultado);
                    break;
                case 4:
                    System.out.print("Digite a tensão (volts): ");
                    valor1 = scanner.nextDouble();
                    System.out.print("Digite a corrente (amperes): ");
                    valor2 = scanner.nextDouble();
                    resultado = calculadora.calcularPotencia(valor1, valor2);
                    System.out.printf("Potência elétrica: %.2f watts\n", resultado);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
