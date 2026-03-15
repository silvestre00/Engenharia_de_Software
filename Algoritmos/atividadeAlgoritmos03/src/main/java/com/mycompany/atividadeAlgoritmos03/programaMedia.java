
package com.mycompany.atividadeAlgoritmos03;

import java.util.Scanner;
public class programaMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite duas notas");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double calcularMedia = (nota1 + nota2) / 2;
        System.out.println("A soma das duas notas, resultou em: " + calcularMedia);
        sc.close();
    }
}
