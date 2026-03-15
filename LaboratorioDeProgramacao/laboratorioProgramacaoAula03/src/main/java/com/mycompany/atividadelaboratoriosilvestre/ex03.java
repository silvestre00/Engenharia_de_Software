package com.mycompany.atividadelaboratoriosilvestre;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;
        
        // Entrada de dados do peso
        System.out.print("Digite o seu peso: ");
        peso = sc.nextDouble();
        
        // Entrada de dados da altura
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        
        // Calcular IMC
        imc = peso / (altura * altura);
        
        // Identificar a faixa do IMC:
        if (imc < 18.5){
            System.out.print("IMC abaixo do peso ideal.");
        }
        else if (imc < 25){
            System.out.print("IMC dentro da faixa de peso ideal.");
        }
        
        else if (imc < 30) {
            System.out.print("IMC em sobrepeso.");
        }
        
        else{
            System.out.print("IMC de obesidade.");
        }
        sc.close();
    }
}
