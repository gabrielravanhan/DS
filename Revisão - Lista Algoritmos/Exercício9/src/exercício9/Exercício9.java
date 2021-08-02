/*
Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido
em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de
dólares disponíveis com o usuário. 
 */
package exercício9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        
        double cd, qd;
        
        System.out.print("Informe o valor da cotação do dólar: ");
        cd = sc.nextDouble();
        
        System.out.print("Informe a quantidade de dólares: ");
        qd = sc.nextDouble();
        
        System.out.println("\nO valor da conversão é: " + df.format(cd*qd)+" R$");
    }
    
}
