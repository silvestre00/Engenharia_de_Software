package com.mycompany.algoritmos02silvestre;
import java.util.Scanner;
public class ex13 {
    public static void main(String[] args){
        /*Ordem Crescente: Leia 2 números inteiros
        diferentes e exiba-os no ecrã em ordem crescente (do menor para o maior).*/
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um outro numero: ");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.print(num2 + ", " + num1);
        }
        else{
            System.out.print(num1 + ", " + num2);
        }
    }
}
