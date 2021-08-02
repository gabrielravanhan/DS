package prjorientacao;

public class Pessoa {

    private String primeiroNome;
    private String nomeMeio;
    private String ultimoNome;

    //construtor
    public Pessoa(String primeiroNome, String nomeMeio, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.nomeMeio = nomeMeio;
        this.ultimoNome = ultimoNome;
    }

    public String getNomeCompleto() {
        return primeiroNome + " " + nomeMeio + " " + ultimoNome;
    }

    public String getPrimeiroUltimoNome() {
        return primeiroNome + " " + ultimoNome;
    }
}
