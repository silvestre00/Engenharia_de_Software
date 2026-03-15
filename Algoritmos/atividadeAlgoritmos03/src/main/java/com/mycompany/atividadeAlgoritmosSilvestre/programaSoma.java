/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeAlgoritmosSilvestre;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class programaSoma {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1; 
        int num2;
        System.out.println("Escreva dois números");
        num1 = leitor.nextInt();
        num2 = leitor.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos dois números resultou em: " + soma);
        leitor.close();
    }  
}