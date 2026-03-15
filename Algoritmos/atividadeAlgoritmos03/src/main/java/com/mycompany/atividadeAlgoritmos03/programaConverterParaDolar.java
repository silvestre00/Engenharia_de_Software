
package com.mycompany.atividadeAlgoritmos03;
import java.util.Scanner;
public class programaConverterParaDolar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor a ser convertido: R$");
        double reais = sc.nextDouble();
        double converterDolar = reais / 5.0;
        System.out.println("Equivale a U$" + converterDolar + " dolares");
    }
}
