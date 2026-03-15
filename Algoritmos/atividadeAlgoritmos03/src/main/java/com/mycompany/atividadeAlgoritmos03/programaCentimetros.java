/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeAlgoritmos03;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class programaCentimetros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os metros: ");
        double metros = sc.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + " metros, equivale a: " + centimetros + " centimetros");
    }
}
