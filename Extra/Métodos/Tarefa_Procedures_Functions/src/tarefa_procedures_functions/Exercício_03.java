/*
Tendo como dados de entrada a idade, altura e o sexo de uma pessoa (‘M’ masculino e ‘F’ feminino), construa
um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:

SEXO ALTURA IDADE PESO IDEAL

1 - Masculino > 1,70 <= 20 (72,7 * h) – 58 21 a 39 (72,7 * h) – 53 >= 40 (72,7 * h) – 45 <=1,70 <= 40 (72,7 * h) – 50 > 40 (72,7 * h) – 58

2 - Feminino > 1,50 --- (62,1 * h) – 44,7 <= 1,50 >= 35 (62,1 * h) – 45 < 35 (62,1 * h) – 49
 */
package tarefa_procedures_functions;

import java.util.Scanner;

public class Exercício_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        double h, peso;

        String sexo;

        System.out.print("Informe o sexo (M ou F)da pessoa: ");
        sexo = sc.next();

        if (sexo.toUpperCase().equals("M")) {
            System.out.println("Informe a altura da pessoa! ");
            h = sc.nextDouble();

            System.out.println("Informe a idade da pessoa! ");
            i = sc.nextInt();

            if (h > 1.7) {
                if (i <= 20) {
                    peso = calculaPeso1(h);

                    System.out.println("O peso ideal dessa pessoa é: " + peso);
                } else {
                    if ((i >= 21) && (i <= 39)) {
                        peso = calculaPeso2(h);

                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    } else {
                        peso = calculaPeso3(h);

                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    }
                }
            } else {
                if (h <= 1.7) {
                    if (i <= 40) {
                        peso = calculaPeso4(h);

                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    } else {
                        peso = calculaPeso5(h);
                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    }
                }
            }
        } else {
            if (sexo.toUpperCase().equals("F")) {
                System.out.println("Informe a altura da pessoa: ");
                h = sc.nextDouble();

                System.out.println("Informe a idade da pessoa: ");
                i = sc.nextInt();

                if (h <= 1.5) {
                    if (i >= 35) {
                        peso = calculaPeso6(h);

                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    } else {
                        peso = calculaPeso7(h);

                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    }
                } else {
                    peso = calculaPeso8(h);
                    System.out.println("O peso ideal dessa pessoa é: " + peso);
                }
            } else {
                System.out.println("Sexo inválido!!! ");
            }
        }
    }

    private static double calculaPeso1(double h) {
        return (72.7 * h) - 58;
    }

    private static double calculaPeso2(double h) {
        return (72.7 * h) - 53;
    }

    private static double calculaPeso3(double h) {
        return (72.7 * h) - 45;
    }

    private static double calculaPeso4(double h) {
        return (72.7 * h) - 50;
    }

    private static double calculaPeso5(double h) {
        return (72.7 * h) - 58;
    }

    private static double calculaPeso6(double h) {
        return (62.1 * h) - 45;
    }

    private static double calculaPeso7(double h) {
        return (62.1 * h) - 49;
    }

    private static double calculaPeso8(double h) {
        return (62.1 * h) - 44.7;
    }

}
