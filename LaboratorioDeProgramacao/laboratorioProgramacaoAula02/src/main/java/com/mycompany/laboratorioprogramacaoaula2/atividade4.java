
package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args){
        /*
        4. Consumo de Energia
        Um aparelho possui uma potência em Watts e é usado por algumas horas. Calcule o
        consumo em kWh. (consumo = (potencia * horas) / 1000)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a potencia do aparelho(W)? ");
        double potencia = sc.nextDouble();
        System.out.print("Quantas horas ele foi utilizado? ");
        double tempo = sc.nextDouble();
        double consumo = (potencia * tempo) / 1000;
        System.out.println("O consumo dele foi de: " + consumo + " kWh");
    }
}
