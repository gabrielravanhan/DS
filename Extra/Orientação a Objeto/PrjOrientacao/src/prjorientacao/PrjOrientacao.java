/*Elabore um programa em java criando uma classe pessoa com os seguintes atributos:
    -primeiroNome
    -nomemMeio
    -ultimoNome
 */
package prjorientacao;

public class PrjOrientacao {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rogério", "Luna", "Furlan");
        Pessoa pessoa1 = new Pessoa("João", "", "Silva");
        Pessoa pessoa2 = new Pessoa("João", "Moreira", "da Silva");

        System.out.println("Nome Completo => " + pessoa.getNomeCompleto());
        System.out.println("Nome  Abreviado=> " + pessoa.getPrimeiroUltimoNome());

        System.out.println("Nome Completo => " + pessoa1.getNomeCompleto());
        System.out.println("Nome  Abreviado=> " + pessoa1.getPrimeiroUltimoNome());

        System.out.println("Nome Completo => " + pessoa2.getNomeCompleto());
        System.out.println("Nome  Abreviado=> " + pessoa2.getPrimeiroUltimoNome());
    }

}
