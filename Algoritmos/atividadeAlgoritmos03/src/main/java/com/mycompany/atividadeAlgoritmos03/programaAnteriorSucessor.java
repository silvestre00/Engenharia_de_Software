
package com.mycompany.atividadeAlgoritmos03;
import java.util.Scanner;
public class programaAnteriorSucessor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int numeroSucessor = numero + 1;
        int numeroAntecessor = numero - 1;
        System.out.println("O número digitado: " + numero + "\nSeu antecessor é o: " + numeroAntecessor + "\nSeu Sucessor é o: " + numeroSucessor);
    }
    
}
