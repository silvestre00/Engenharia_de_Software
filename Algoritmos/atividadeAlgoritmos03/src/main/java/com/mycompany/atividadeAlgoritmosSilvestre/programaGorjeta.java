/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeAlgoritmosSilvestre;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class programaGorjeta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da conta: ");
        double conta = sc.nextDouble();
        double gorjeta = conta * 0.10;
        System.out.println("A gorjeta e de: R$" + gorjeta);
    }
}
