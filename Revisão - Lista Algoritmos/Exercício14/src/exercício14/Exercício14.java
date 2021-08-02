/*
Elabore um algoritmo que leia dois valores inteiros, A e B, e apresente os valores trocados, ou seja,
que troque o valor da variável A pelo valor da variável B e vice-versa. 
 */
package exercício14;

import java.util.Scanner;


public class Exercício14 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.print("Informe o valor de A: ");
        a = sc.nextInt();
        
        System.out.print("Informe o valor de B: ");
        b = sc.nextInt();
        
        c = a;
        a = b;
        b = c;

        System.out.println("\nO valor de A agora é: " +a);
        System.out.println("O valor de B agora é: " +b);
    }
    
}
