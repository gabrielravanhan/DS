
public class Direcao {

    // Atributos
    private String cor;
    private boolean tamanhoRaio;

    // Métodos set's e get's
    private void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    private void setTamanhoRaio(boolean tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    public boolean getTamanhoRaio() {
        return tamanhoRaio;
    }

    // Construtor
    public Direcao(String cor, boolean tamanhoRaio) {
        this.cor = cor;
        this.tamanhoRaio = tamanhoRaio;
    }
}
