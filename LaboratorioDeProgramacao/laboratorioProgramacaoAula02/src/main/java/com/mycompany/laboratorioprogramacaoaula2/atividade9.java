
package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args){
        /*
        9. Conversão de Segundos para Minutos
        Leia uma quantidade de segundos e converta para minutos. (minutos = segundos / 60)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos segundos: ");
        double segundos = sc.nextDouble();
        double minutos = segundos / 60;
        System.out.print("Equivale a " + minutos + " minutos.");
    }
}
