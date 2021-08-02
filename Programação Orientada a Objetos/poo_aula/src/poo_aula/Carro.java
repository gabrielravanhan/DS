package poo_aula;

public class Carro {

    String tipo;
    String cor;
    String placa;
    int numPortas;
    Pessoa dono;

    int cambio;

    // Construtor
    public Carro() {

    }

    public Carro(String cor, String tipo, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;

    }

    void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Pessoa getDono() {
        return dono;
    }

    void ligar() {
        System.out.println("CARRO LIGADO.");
    }

    void desligar() {
        System.out.println("CARRO DESLIGADO.");
    }

    void acelerar() {
        System.out.println("CARRO ACELERANDO.");
    }

    void frear() {
        System.out.println("CARRO FREANDO.");
    }

    public void setCambio(int marcha) {
        this.cambio = marcha;
    }

    public int getCambio() {
        System.out.println("MARCHA " + this.cambio);
        return this.cambio;
    }
}
