package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        /*Aprovação Escolar: Leia a nota de um aluno (decimal).
        Se for >= 7.0, imprima "Aluno Aprovado". Senão, imprima "Aluno Reprovado".*/
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        if (nota >= 7){
            System.out.print("Aluno Aprovado.");
        }
        else{
            System.out.print("Aluno Reprovado");
        }
    }
}
