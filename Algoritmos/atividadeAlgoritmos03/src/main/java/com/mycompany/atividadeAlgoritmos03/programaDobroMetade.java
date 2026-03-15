/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeAlgoritmos03;
import java.util.Scanner;
public class programaDobroMetade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();
        double numeroDobro = numero * 2;
        double numeroMetade = numero / 2;
        System.out.println("O numero: " + numero + "\nO dobro dele e: " + numeroDobro + "\nA metade dele e: " + numeroMetade);
    }
}
