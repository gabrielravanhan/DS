package poo_aula;

public class Pessoa {

    String nome;
    String corDoCabelo;
    String biotipo;
    int idade;
    Carro carro;

    // Construtor
    public Pessoa() {

    }

    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public String getBiotipo() {
        return biotipo;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    void ligarCarro() {
        carro.ligar();
    }

    void desligarCarro() {
        carro.desligar();
    }

    void acelerarCarro() {
        carro.acelerar();
    }

    void frearCarro() {
        carro.frear();
    }

    void setCambioMarcha(int marcha) {
        carro.setCambio(marcha);
    }
}
