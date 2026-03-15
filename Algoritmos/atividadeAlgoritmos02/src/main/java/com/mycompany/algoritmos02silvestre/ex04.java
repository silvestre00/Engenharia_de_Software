package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        /*Levantamento no Multibanco:
        Peça o valor do Saldo atual e o valor do Saque pretendido. 
        Se o saque for <= ao saldo, autorize a transação. Senão, bloqueie por saldo insuficiente.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o Saldo Atual: ");
        double saldoAtual = sc.nextDouble();
        System.out.print("Qual o valor do Saque: ");
        double saque = sc.nextDouble();
        
        if (saldoAtual >= saque){
            saldoAtual = saldoAtual - saque;
            System.out.print("Saque aprovado. Saldo restante: R$" + saldoAtual);
        }
        else{
            System.out.print("Saque negado. Saldo insuficiente.");
        }
        
    }
}
