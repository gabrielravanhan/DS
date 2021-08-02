/*
Elabore um algoritmo que leia um número inteiro e mostre o valor deste número 
elevado ao quadrado. 
 */
package exercício3;

import java.util.Scanner;


public class Exercício3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, q;
        
        System.out.print("Informe o número que será elevado ao quadrado: ");
        n1 = sc.nextInt();
        
        q = n1 * n1;
        
        System.out.println("\nO resultado é: "+q);
    }
    
}
