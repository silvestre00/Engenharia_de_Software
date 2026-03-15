package com.mycompany.atividadelaboratoriosilvestre;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int velocidade;
        // Entrada de dados, velocidade do carro
        System.out.print("Qual a velocidade do carro? ");
        velocidade = sc.nextInt();
        
        // Condicional para checar se tem multa, e qual a gravidade da multa;
        if (velocidade <= 0) {
            System.out.print("O carro não está em movimento.");
        }
        
        else if(velocidade > 100) {
            System.out.print("Multa gravissima.");
        }
        
        else if(velocidade > 80){
            System.out.print("Multa grave!");
        }
        
        else if(velocidade > 60){
            System.out.print("Multa leve.");
        }
        
        else{
            System.out.print("Sem infração, dentro dos limites.");
        }
        sc.close();
    }
}
