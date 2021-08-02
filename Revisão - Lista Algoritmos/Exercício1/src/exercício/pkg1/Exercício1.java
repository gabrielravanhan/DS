/*
1. Elabore um algoritmo que leia 3 números e apresente o resultado da soma do
primeiro pelo segundo multiplicado pelo terceiro. 
 */
package exercício.pkg1;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, r;

        System.out.print("Informe o valor do 1° número: ");
        n1 = sc.nextInt();

        System.out.print("Informe o valor do 2° número: ");
        n2 = sc.nextInt();

        System.out.print("Informe o valor do 3° número: ");
        n3 = sc.nextInt();

        r = (n1 + n2) * n3;

        System.out.println("\nO resultado da soma do 1° pelo 2° multiplicado pelo 3° é: " + r);
    }

}
