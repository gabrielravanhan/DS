package quitanda;

public class Fornecedor {

    // Atributos
    String nome;
    String produtoQueFornece;
    String telefone;
    String cidade;
    String estado;

    // Métodos set's e get's
    void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void setProdutoQueFornece(String produtoQueFornece) {
        this.produtoQueFornece = produtoQueFornece;
    }

    public String getProdutoQueFornece() {
        return produtoQueFornece;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    // Construtores
    public Fornecedor() {

    }

    public Fornecedor(String nome, String produtoQueFornece, String telefone, String cidade, String estado) {
        this.nome = nome;
        this.produtoQueFornece = produtoQueFornece;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
    }
}
