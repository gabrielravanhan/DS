package quitanda;

public class OutroProduto {

    // Atributos
    String nome;
    String dataDeValidade;
    double preco;
    int quantidade;

    // Métodos set's e get's
    void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Construtores
    public OutroProduto() {

    }

    public OutroProduto(String nome, String dataDeValidade, double preco, int quantidade) {
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
