package com.mycompany.algoritmos02silvestre;
import java.util.Scanner;
public class ex14 {
    public static void main(String[] args){
        /*Sistema de Descontos: Peça o valor de uma compra.
        Aplique 20% de desconto se o valor for superior a € 500. 
        Caso contrário, aplique 10% se for superior a € 200. 
        Se for menor, não há desconto. Exiba o valor final.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        double desconto;
        if (valor > 200){
            if (valor > 500){
                desconto = valor * 0.8;
                System.out.print("Valor a pagar: €" + desconto);
            }
            else{
                desconto = valor * 0.9;
                System.out.print("Valor a pagar: €" + desconto);
            }
        }
        else{
            desconto = valor;
            System.out.print("Valor a pagar: €" + desconto);
        }
    }
}
