/*
Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e calcule a seguinte
expressão:
R=(A+B)^2       S=(B+C)^2       D=(R+S)/2
 */
package exercício11;

import java.util.Scanner;

public class Exercício11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, R, S;

        System.out.print("Informe o valor de A: ");
        A = sc.nextInt();

        System.out.print("Informe o valor de B: ");
        B = sc.nextInt();

        System.out.print("Informe o valor de C: ");
        C = sc.nextInt();

        R = (A + B) * (A + B);
        S = (B + C) * (B + C);

        System.out.println("\nO valor da expressão é: " + (R + S) / 2);

    }

}
