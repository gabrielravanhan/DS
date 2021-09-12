
public class Saque {

    // Atributos
    ContaCorrente conta;
    double valor;

    // Construtor
    public Saque(ContaCorrente conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    // Métodos set's e get's
    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Método para sacar dinheiro
    public void sacarDinheiro() {
        double novoSaldo = this.conta.getSaldo() - this.valor;

        this.conta.setSaldo(novoSaldo);

        System.out.println("Saldo após o saque: " + this.conta.getSaldo());
    }
}
