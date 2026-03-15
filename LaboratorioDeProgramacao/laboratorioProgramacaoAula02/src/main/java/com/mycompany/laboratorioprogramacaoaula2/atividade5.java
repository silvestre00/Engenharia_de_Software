package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;


public class atividade5 {
    public static void main(String[] args){
        /*
        5. Velocidade Média
        Peça:
        • distância percorrida (km)
        • tempo gasto (horas)
        Calcule a velocidade média. (velocidade = distancia / tempo)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a distancia percorrida? (km)");
        double distancia = sc.nextDouble();
        System.out.print("Qual o tempo gasto para percorrer a distancia? (horas) ");
        double tempo = sc.nextDouble();
        double velocidadeMedia = distancia / tempo;
        System.out.print("A velocidade media foi de: " + velocidadeMedia + "kmh.");
    }
}
