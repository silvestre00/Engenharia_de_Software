package com.mycompany.atividadelaboratoriosilvestre;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nota;
        // Entrada de dados, nota do aluno.
        System.out.print("Digite a nota: ");
        nota = sc.nextInt();
        
        // Identificação da faixa da nota do aluno:
        if (nota > 100){
            System.out.print("Nota acima do limite, tente novamente.");
        }
        
        else if (nota < 0) {
            System.out.print("Nota inferior a minima, tente novamente");
        }
        
        else if (nota >= 90){
            System.out.print("Excelente nota.");
        }
        
        else if (nota >= 70) {
            System.out.print("Boa nota!");
        }
        
        else if (nota >= 50){
            System.out.print("Nota regular.");
        }
        
        else {
            System.out.print("Nota insuficiente.");
        }
        sc.close();
    }
}
