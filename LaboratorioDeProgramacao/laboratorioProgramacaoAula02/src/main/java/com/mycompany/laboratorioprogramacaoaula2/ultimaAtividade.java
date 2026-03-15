
package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;

public class ultimaAtividade {
    public static void main(String[] args){
        /*
        10. Total de Minutos de Estudo
        Peça ao aluno:
        • horas estudadas no dia
        Converta esse valor para minutos de estudo. (minutos = horas * 60)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a quantidade de horas estudadas? ");
        double horas = sc.nextDouble();
        double minutos = horas * 60;
        System.out.print("Equivale a " + minutos + " minutos.");
    }
}
