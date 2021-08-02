/*
2. Elabore um algoritmo que calcule a equação do 2º grau, calculando o valor de Delta, x’ e x’’; (caso não 
seja possível calcular os valores de x apresentar uma mensagem informando o valor de Delta e que este é 
negativo, não permitindo a continuação dos cálculos.
 */
package tarefa_procedures_functions;

import java.util.Scanner;

public class Exercício_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Informe o valor de a: ");
        a = sc.nextInt();

        System.out.print("\nInforme o valor de b: ");
        b = sc.nextInt();

        System.out.print("\nInforme o valor de c: ");
        c = sc.nextInt();

        delta = calculaDelta(a, b, c);

        if (delta >= 0) {
            x1 = calculaX1(delta, a, b);
            x2 = calculaX2(delta, a, b);

            System.out.println("O valor do delta é: " + delta);
            System.out.println("\nO valor de X' é: " + x1);
            System.out.println("\nO valor de X'' é: " + x2);
        } else {
            System.out.println("\nNão é permitido a continuação dos cálculos, pois o delta é negativo!");
        }
    }

    private static double calculaDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static double calculaX1(double delta, double a, double b) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    private static double calculaX2(double delta, double a, double b) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

}
