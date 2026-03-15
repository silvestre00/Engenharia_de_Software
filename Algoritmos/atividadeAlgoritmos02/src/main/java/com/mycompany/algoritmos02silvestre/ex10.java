package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;


public class ex10 {
    public static void main(String[] args){
        /*Jogo de Adivinhar: Crie uma variável `int segredo = 7`.
        Peça à pessoa para chutar um número de 1 a 10. 
        Se ela acertar (for igual), diga "Parabéns, ganhou!". 
        Senão, diga "Errou, tente de novo!".*/
        Scanner sc = new Scanner(System.in);
        int segredo = 7;
        System.out.print("Digite um numero de 1 a 10: ");
        int palpite = sc.nextInt();
        if (palpite == segredo){
            System.out.print("Parabens voce acertou!");
        }
        else{
            System.out.print("Errado! Tente novamente.");
        }
    }
}
