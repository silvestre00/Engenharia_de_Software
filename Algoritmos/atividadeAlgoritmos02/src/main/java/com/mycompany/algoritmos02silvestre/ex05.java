package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        /*Alarme de Temperatura: 
        Leia a temperatura de uma caldeira. Se passar de 35 graus, 
        exiba "PERIGO: Sobreaquecimento". Senão, exiba "Temperatura Normal".*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a temperatura da caldeira: ");
        double temperatura = sc.nextDouble();
        if (temperatura > 35){
            System.out.print("PERIGO: Sobreaquecimento.");
        }
        else{
            System.out.print("Temperatura normal.");
        }
    }
}
