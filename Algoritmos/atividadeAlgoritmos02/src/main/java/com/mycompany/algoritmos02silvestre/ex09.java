package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;


public class ex09 {
    public static void main(String[] args){
        /*Alerta de Estoque: Leia a quantidade de um produto na loja. 
        Se for < 5 unidades, imprima "Aviso: Necessário repor stock". 
        Senão, imprima "Estoque adequado".*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos: ");
        int estoque = sc.nextInt();
        if (estoque < 5){
            System.out.print("Aviso: Necessário repor estoque.");
        }
        else{
            System.out.print("Estoque adequado.");
        }
    }
}
