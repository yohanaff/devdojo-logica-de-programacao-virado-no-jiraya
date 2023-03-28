package com.github.yohanaff.logica_de_programacao_virado_no_jiraya.lista_de_exercicios.parte5;

import java.util.LinkedList;

public class CalculadoraVendas {
    private static final int TAMANHO_MEMORIA = 5;
    private LinkedList<Double> ultimasVendas = new LinkedList<>();

    public double calcularTotalVenda(double valorProduto) {
        double comissao = valorProduto * 0.25;
        double taxas = valorProduto * 0.65;
        double total = valorProduto + comissao + taxas;
        addNaMemoria(total);
        return total;
    }

    public double calcularPagamentoAVista(double valor, double descontoPercentual) {
        if (descontoPercentual < 0 || descontoPercentual > 15) {
            throw new IllegalArgumentException("O desconto deve ser entre 0 e 15%");
        }
        double desconto = valor * (descontoPercentual / 100);
        return valor - desconto;
    }

    public double calcularPagamentoParcelado(double valor, int parcelas) {
        if (parcelas < 3 || parcelas > 36) {
            throw new IllegalArgumentException("A quantidade de parcelas deve ser entre 3 e 36");
        }
        double valorParcela = valor / parcelas;
        double total = 0;
        for (int i = 0; i < parcelas; i++) {
            total += valorParcela * 1.02;
        }
        return total;
    }

    public double calcularParcelaAtrasada(double valor, double taxaJuros, int diasAtraso) {
        return valor + (valor * (taxaJuros / 100) * diasAtraso);
    }

    private void addNaMemoria(double vendasTotal) {
        if (ultimasVendas.size() >= TAMANHO_MEMORIA) {
            ultimasVendas.removeFirst();
        }
        ultimasVendas.addLast(vendasTotal);
    }

    public void exibirTotalVendas() {
        double total = 0;
        for (double venda : ultimasVendas) {
            total += venda;
        }
        System.out.printf("Total das últimas %d vendas: R$ %.2f\n", TAMANHO_MEMORIA, total);
    }
}
