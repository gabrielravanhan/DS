package poo_aula;

public class Carro {

    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private Pessoa dono;

    private int cambio;

    // Construtor
    public Carro() {

    }

    public Carro(String cor, String tipo, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }

    // Comportamentos
    private void setCor(String cor) {
        this.cor = cor;
    }

    private String getCor() {
        return cor;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String getTipo() {
        return tipo;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    private String getPlaca() {
        return placa;
    }

    private void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    private int getNumPortas() {
        return numPortas;
    }

    private void setDono(Pessoa dono) {
        this.dono = dono;
    }

    private Pessoa getDono() {
        return dono;
    }

    public void ligar() {
        System.out.println("Carro Ligado");
    }

    public void desligar() {
        System.out.println("Carro Desligado");
    }

    public void acelerar() {
        System.out.println("Carro Acelerando");
    }

    public void frear() {
        System.out.println("Carro Freando");
    }

    public void setCambio(int marcha) {
        this.cambio = marcha;
    }

    public int getCambio() {
        System.out.println("Marcha " + this.cambio);
        return this.cambio;
    }
}
