package com.mycompany.algoritmos02silvestre;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        /*Senha Numérica: Crie uma variável `int senhaCorreta = 1234`. 
        Peça ao utilizador para digitar a senha.
        Use o `if` com `==` para exibir "Acesso Concedido" ou `else` para "Senha Incorreta".
        */
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 1234;
        System.out.print("Digite a senha de 4 digitos: ");
        int senhaEscrita = sc.nextInt();
        
        if (senhaEscrita == senhaCorreta){
            System.out.print("Acesso concedido.");
        }
        else{
            System.out.print("Acesso negado. Senha Incorreta");
        }
    }
}
