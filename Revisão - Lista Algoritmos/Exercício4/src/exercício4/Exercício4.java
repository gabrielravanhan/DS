/*
Um cliente de um banco tem um saldo positivo de R$ 500,00. Fazer um algoritmo
que leia um cheque que entrou e calcule o saldo, mostrando (escrevendo) o novo
saldo na tela.
 */
package exercício4;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercício4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        
        double c;
        
        System.out.print("Informe o valor do cheque: ");
        c = sc.nextDouble();
        
        System.out.println("\nO novo saldo é: " +df.format(c + 500));
    }
    
}
