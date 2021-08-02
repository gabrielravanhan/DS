/*
1) Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
D = (R + S) / 2 onde,
R = (A + B) ^ 2
S = (B + C) ^ 2
 */
package tarefa_procedures_functions;

import java.util.Scanner;

public class Exercício_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.print("Digite o valor do A: ");
        A = sc.nextInt();

        System.out.print("\nDigite o valor do B: ");
        B = sc.nextInt();

        System.out.print("\nDigite o valor do C: ");
        C = sc.nextInt();

        calculaD(A, B, C);
    }

    public static void calculaD(int A, int B, int C) {
        int R, S, D;

        R = (int) Math.pow(A + B, 2);
        S = (int) Math.pow(B + C, 2);
        D = (R + S) / 2;

        System.out.println("\nO valor de D é:" + D);
    }

}
