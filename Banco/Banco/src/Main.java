
public class Main {

    public static void main(String[] args) {
        ContaCorrente conta01 = new ContaCorrente(1, "Bidu", 2.50);

        Deposito deposito01 = new Deposito(conta01, 1.0);

        deposito01.depositarDinheiro();

        Saque saque01 = new Saque(conta01, 0.50);

        saque01.sacarDinheiro();
    }
}
