package poo_aula;

public class Pessoa {

    // Aributos
    private String nome;
    private String corDoCabelo;
    private String biotipo;
    private int idade;

    private Carro carro;

    //Construtor
    public Pessoa() {

    }

    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
    }

    // Comportamentos
    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return nome;
    }

    private void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    private String getCorDoCabelo() {
        return corDoCabelo;
    }

    private void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    private String getBiotipo() {
        return biotipo;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private int getIdade() {
        return idade;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    private Carro getCarro() {
        return carro;
    }

    public void ligarCarro() {
        carro.ligar();
    }

    public void desligarCarro() {
        carro.desligar();
    }

    public void acelerarCarro() {
        carro.acelerar();
    }

    public void frearCarro() {
        carro.frear();
    }

    private void setCambioMarcha(int marcha) {
        carro.setCambio(marcha);
    }

}
