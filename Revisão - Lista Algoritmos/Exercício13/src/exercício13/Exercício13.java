/*
Elaborar um algoritmo que calcule a equação do 2º grau.
 */
package exercício13;

import java.util.Scanner;


public class Exercício13 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, delta;
        
        System.out.print("Informe o valor de a: ");
        a = sc.nextDouble();
        
        System.out.print("Informe o valor de b: ");
        b = sc.nextDouble();
        
        System.out.print("Informe o valor de c: ");
        c = sc.nextDouble();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta >= 0){
            System.out.println("x1 é igual: "+(- b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 é igual: "+(- b - Math.sqrt(delta)) / (2 * a));
        }
        else{
            System.out.println("Não existem raízes!!!");
        }
    }
    
}
