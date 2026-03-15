package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args){
        /*
        7. Conversão de Litros para Mililitros
        Leia um valor em litros e converta para mililitros. (ml = litros * 1000)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o valor em litros: ");
        double litros = sc.nextDouble();
        double converterMl = litros * 1000;
        System.out.print("Equivale a " + converterMl + "ml.");
    }
}
