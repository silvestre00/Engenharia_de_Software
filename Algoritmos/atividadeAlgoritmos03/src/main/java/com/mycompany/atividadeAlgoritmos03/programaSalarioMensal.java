
package com.mycompany.atividadeAlgoritmos03;
import java.util.Scanner;
public class programaSalarioMensal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto voce recebe por hora? ");
        double salarioPorHora = sc.nextDouble();
        System.out.println("Quantas horas voce trabalha por mes?");
        double horas = sc.nextDouble();
        double salarioMensal = salarioPorHora * horas;
        System.out.println("Seu salario mensal e de: R$" + salarioMensal);
    }
}
