package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

public class ImparPar {
    public static void main(String[] args) {
        int numero = 3;
        boolean paridade = numero % 2 == 0;

        String resultado = paridade ? "Par" : "Ímpar";
        System.out.println(resultado);

        //Segunda solução
        if(paridade)  {
            System.out.println("Par, resto " + numero % 2);
        } else {
            System.out.println("Ímpar, resto " + numero % 2);
        }
    }
}
