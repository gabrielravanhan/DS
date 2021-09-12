
public class Deposito {

    // Atributos
    ContaCorrente conta;
    double valor;

    // Construtor
    public Deposito(ContaCorrente conta, double valor) {
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

    // Método para depositar dinheiro
    public void depositarDinheiro() {
        double novoSaldo = this.conta.getSaldo() + this.valor;

        this.conta.setSaldo(novoSaldo);

        System.out.println("Saldo após o depósito: " + this.conta.getSaldo());
    }
}
