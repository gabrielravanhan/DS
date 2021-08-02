/*
Faça um algoritmo onde o usuário informe dois números, e imprima a soma do primeiro pelo segundo.
 */
package procedure_function;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, resultado;

        System.out.print("Informe o 1° número: ");
        n1 = sc.nextInt();

        System.out.print("\nInforme o 2° número: ");
        n2 = sc.nextInt();

        resultado = calculaSoma(n1, n2);

        System.out.println("\nA soma dos dois números é: " + resultado);
    }

    private static int calculaSoma(int n1, int n2) {
        return n1 + n2;
    }
}
