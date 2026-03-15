package com.mycompany.algoritmos02silvestre;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args){
        /*O Maior de Três: Leia três números inteiros distintos digitados 
        pelo utilizador e desenvolva a lógica para descobrir e exibir apenas o maior deles.*/
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = sc.nextInt();
        
        if (num1 > num2){
            if (num1 > num3){
                System.out.print("O maior numero e: " + num1);
            }
            else {
                System.out.print("O maior numero e: " + num3);
            }
        }
        else{
            if (num2 > num3){
                System.out.print("O maior numero e " + num2);
            }
            else{
                System.out.print("O maior numero e: " + num3);
            }
        }
    }
}
