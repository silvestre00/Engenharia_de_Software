package com.mycompany.algoritmos02silvestre;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        /*Calculadora IMC: Leia o peso e a altura do utilizador.
        Calcule o IMC (peso / (altura * altura)) e informe 
        se a pessoa está "Acima do peso" 
        (IMC igual ou superior a 25) ou com "Peso normal".*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        if (imc >= 25){
            System.out.print("Acima do peso.");
        }
        else{
            System.out.print("Peso normal");
        }
    }
}
