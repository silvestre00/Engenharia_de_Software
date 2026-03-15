package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        /*Par ou Ímpar: Leia um número inteiro
        do teclado e informe no ecrã se ele é Par ou Ímpar.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();
        if ((num1 % 2) == 0){
            System.out.print("O numero e par.");
        }
        else{
            System.out.print("O numero e impar");
        }
    }   
}
