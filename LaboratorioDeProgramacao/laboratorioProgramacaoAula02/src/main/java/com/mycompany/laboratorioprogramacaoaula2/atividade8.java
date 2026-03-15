package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args){
        /*
        8. Área de um Trapézio
        Leia:
        • base maior
        • base menor
        • altura
        Calcule a área. (area = (baseMaior + baseMenor) * altura / 2)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a base maior? ");
        double baseMaior = sc.nextDouble();
        System.out.print("Qual a base menor? ");
        double baseMenor = sc.nextDouble();
        System.out.print("Qual a altura? ");
        double altura = sc.nextDouble();
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.print("A area do trapezio e de: " + area);
    }
}
