package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

public class TipoConta {
    public static void main(String[] args) {
        final String TIPO_CONTA = "CONTA_INVESTIMENTO";

        switch (TIPO_CONTA) {
            case "CONTA_POUPANCA":
                System.out.println("Juros de 0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("Juros de 0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("Juros de 0.1%");
                break;
            default:
                System.out.println("Conta inexistente");
        }

    }
}
