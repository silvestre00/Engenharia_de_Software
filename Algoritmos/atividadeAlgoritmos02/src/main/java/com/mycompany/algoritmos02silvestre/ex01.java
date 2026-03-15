package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Maioridade Simples: Peça a idade do utilizador. 
        Use o `if` para exibir "Pode Entrar" se for >= 18, ou use o `else` 
        para exibir "Entrada Negada".*/
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.print("Pode entrar.");
        }
        else{
            System.out.print("Entrada Negada.");
        }
    }
}
