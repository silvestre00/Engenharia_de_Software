
package com.mycompany.laboratorioprogramacaoaula2;
import java.util.Scanner;
public class atividade1 {

    public static void main(String[] args) {
        /*1. Perímetro do Quadrado
    Peça ao usuário o valor do lado de um quadrado e calcule o perímetro. 
        (Fórmula:perimetro = lado * 4)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de um lado do quadrado: ");
        double lado = sc.nextDouble();
        double perimetro = lado * 4;
        System.out.println("O perimetro do quadrado e de: " + perimetro);
    }
}
