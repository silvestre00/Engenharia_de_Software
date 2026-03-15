package com.mycompany.atividadelaboratoriosilvestre;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora;
        // Entrada de dados da quantidade de horas;
        System.out.print("Quantas horas de permanencia no estacionamento? ");
        hora = sc.nextInt();
        
        // Condicional para identificar o valor a pagar;
        if (hora < 0) {
            System.out.print("Intervalo de tempo invalido, digite um tempo de horas maior que zero.");
        }
        
        else if(hora == 1){
            System.out.print("Valor a pagar de R$5,00");
        }
        
        else if(hora <= 3){
            System.out.print("Valor a pagar de R$10,00");
        }
        
        else if (hora <= 6){
            System.out.print("Valor a pagar de R$15,00");
        }
        
        else{
            System.out.print("Valor a pagar de R$20,00");
        }
        sc.close();
    }
}
