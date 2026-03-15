
package com.mycompany.laboratorioprogramacaoaula2;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args){
        /*
        6. Preço com Acréscimo
        Leia o valor de um produto e calcule o preço final com 15% de acréscimo. 
        (acrescimo = valor * 0.15) (precoFinal = valor + acréscimo)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: R$");
        double valor = sc.nextDouble();
        double acrescimo = valor * 0.15;
        double precoFinal = valor + acrescimo;
        System.out.print("O valor do ajuste R$" + acrescimo + "\nO valor final e de R$" + precoFinal);
    }
}
