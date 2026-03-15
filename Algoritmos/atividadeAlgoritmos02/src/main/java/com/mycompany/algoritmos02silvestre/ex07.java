package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        /*Radar de Trânsito: Leia a velocidade de um carro. 
        Se for > 120 km/h, imprima "Multado por excesso de velocidade". 
        Senão, imprima "Boa viagem, velocidade adequada".*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro: ");
        int velocidade = sc.nextInt();
        if (velocidade > 120){
            System.out.print("Multado por excesso de velocidade!");
        }
        else{
            System.out.print("Boa viagem! Velocidade adequada.");
        }
    }
}
