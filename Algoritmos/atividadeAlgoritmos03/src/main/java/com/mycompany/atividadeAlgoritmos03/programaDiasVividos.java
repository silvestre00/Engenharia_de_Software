
package com.mycompany.atividadeAlgoritmos03;
import java.util.Scanner;
public class programaDiasVividos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos voce tem? ");
        int idade = sc.nextInt();
        int idadeEmDias = idade * 365;
        System.out.println("Sua idade " + idade + " equivale a " + idadeEmDias + " dias de vida");
    }
}
