package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;


public class atividade2 {
    public static void main(String[] args){
        /*2. Área do Círculo
        Leia o raio de um círculo e calcule a área. Use π = 3.14. 
        (Fórmula: area = 3.14 * raio * raio).
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();
        double area = 3.14 * raio * raio;
        System.out.println("A area do circulo e de: " + area);
    }
}
