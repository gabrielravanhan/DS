/*
Faça um algoritmo que leia 2 números e ao final mostre a soma, subtração,
multiplicação e divisão do primeiro pelo segundo.
 */
package exercício2;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        double n1, n2, r1, r2, r3, r4;

        System.out.print("Informe o 1° número: ");
        n1 = sc.nextDouble();

        System.out.print("Informe o 2° número: ");
        n2 = sc.nextDouble();

        r1 = n1 + n2;
        r2 = n1 - n2;
        r3 = n1 * n2;
        r4 = n1 / n2;

        System.out.println("\nO resultado da soma do 1° pelo 2° é: " + r1);
        System.out.println("O resultado da subtração do 1° pelo 2° é: " + r2);
        System.out.println("O resultado da multiplicação do 1° pelo 2° é: " + r3);
        System.out.println("O resultado da divisão do 1° pelo 2° é: " + r4);
    }

}
