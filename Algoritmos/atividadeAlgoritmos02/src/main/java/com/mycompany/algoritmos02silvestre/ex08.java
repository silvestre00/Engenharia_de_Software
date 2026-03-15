package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        /*Validador de Divisão: Peça dois números inteiros para dividir o primeiro pelo segundo.
        Se o segundo número for `==` a zero, imprima 
        "Erro: Impossível dividir por zero". Senão, exiba o resultado da divisão.*/
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = sc.nextInt();
        
        if (num2 == 0){
            System.out.print("Erro: impossivel dividir por zero");
        }
        else{
            double divisao = num1 / num2;
            System.out.print("O resultado da divisao e de: " + divisao);
        }
    }
}
