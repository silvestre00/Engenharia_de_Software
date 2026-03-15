package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        /*Promoção de Loja: Pergunte o valor da compra. 
        Se o valor for > 200.0, aplique um desconto de 10% no total 
        usando matemática e exiba o novo valor. Senão, exiba o preço original.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$");
        double valorCompra = sc.nextDouble();
        if (valorCompra > 200){
            valorCompra = valorCompra * 0.9;
            System.out.print("Sua compra recebeu um desconto de 10%");
        }
        System.out.print("Valor a pagar: R$" + valorCompra);
        
    }
}
