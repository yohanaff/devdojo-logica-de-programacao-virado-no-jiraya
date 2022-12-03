package com.github.yohanaff.logica_de_programacao_virado_no_jiraya;

public class ExercicioAlistamentoIf {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 17;

        if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else {
            System.out.println("Alistamento não permitido");
        }
    }
}
