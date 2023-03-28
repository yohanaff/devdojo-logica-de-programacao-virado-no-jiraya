package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        CalculadoraVendas calculadora = new CalculadoraVendas();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Realizar venda");
            System.out.println("2. Calcular pagamento à vista");
            System.out.println("3. Calcular pagamento parcelado");
            System.out.println("4. Calcular prestação em atraso");
            System.out.println("5. Exibir total das últimas 5 vendas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            double valor, resultado, desconto, taxaJuros;
            int parcelas, diasAtraso;
            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor do produto: ");
                    valor = scanner.nextDouble();
                    resultado = calculadora.calcularTotalVenda(valor);
                    System.out.printf("Valor total da venda: R$ %.2f\n", resultado);
                    break;
                case 2:
                    System.out.print("Digite o valor a pagar: ");
                    valor = scanner.nextDouble();
                    System.out.print("Digite o percentual de desconto (0 a 15%): ");
                    desconto = scanner.nextDouble();
                    resultado = calculadora.calcularPagamentoAVista(valor, desconto);
                    System.out.printf("Valor a pagar com desconto: R$ %.2f\n", resultado);
                    break;
                case 3:
                    System.out.print("Digite o valor a pagar: ");
                    valor = scanner.nextDouble();
                    System.out.print("Digite o número de parcelas (3 a 36): ");
                    parcelas = scanner.nextInt();
                    resultado = calculadora.calcularPagamentoParcelado(valor, parcelas);
                    System.out.printf("Valor a pagar com juros: R$ %.2f\n", resultado);
                    break;
                case 4:
                    System.out.print("Digite o valor da prestação: ");
                    valor = scanner.nextDouble();
                    System.out.print("Digite o número de dias em atraso: ");
                    diasAtraso = scanner.nextInt();
                    System.out.print("Digite a taxa de juros em percentual: ");
                    taxaJuros = scanner.nextDouble();
                    resultado = calculadora.calcularParcelaAtrasada(valor, taxaJuros, diasAtraso);
                    System.out.printf("Valor da prestação com juros: R$ %.2f\n", resultado);
                    break;
                case 5:
                    calculadora.exibirTotalVendas();
                    break;
                case 6:
                    running = false;
                    break;
            }
        }
    }
}