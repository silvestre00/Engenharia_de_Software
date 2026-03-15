package com.mycompany.atividadelaboratoriosilvestre;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int idade;
       // Entrada de dados para a idade;
       System.out.print("Qual a sua idade: ");
       idade = sc.nextInt();
       
       // Estrutura condicional para identificar a faixa de idade;
       if (idade < 0){
           System.out.print("Não nasceu ainda, por favor digite uma idade maior que 0.");
       }
       
       else if (idade <= 2){
           System.out.print("Sua idade e de bebê.");
       }
       
       else if(idade <= 12){
           System.out.print("Sua idade e de criança.");
       }
       
       else if(idade <= 17){
           System.out.print("Sua idade e de adolescente.");
       }
       
       else if(idade <= 59){
           System.out.print("Sua idade e de adulto");
       }
       
       else {
           System.out.print("Sua idade e de idoso.");
       }
       sc.close();
    }
}
