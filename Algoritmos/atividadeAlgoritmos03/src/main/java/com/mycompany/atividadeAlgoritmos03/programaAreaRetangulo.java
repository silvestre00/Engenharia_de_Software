
package com.mycompany.atividadeAlgoritmos03;
import java.util.Scanner;

public class programaAreaRetangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base e depois a altura: ");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("A area do retangulo e: " + area);
    }
}
