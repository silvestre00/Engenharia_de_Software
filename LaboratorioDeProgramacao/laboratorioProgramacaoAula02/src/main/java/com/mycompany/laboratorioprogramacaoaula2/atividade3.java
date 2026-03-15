/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class atividade3 {
    public static void main(String[] args){
        /*3. Valor em Centímetros
        Peça ao usuário uma distância em quilômetros e converta para centímetros.
        (centimetros = km * 100000)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a distancia em km? ");
        double distanciaKm = sc.nextDouble();
        double distanciaCm = distanciaKm * 100000;
        System.out.println("A distancia de " + distanciaKm + " km equivale a " + distanciaCm + " cm");
    }
}
