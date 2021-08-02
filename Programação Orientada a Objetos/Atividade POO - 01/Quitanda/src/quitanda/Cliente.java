package quitanda;

public class Cliente {

    // Atributos
    String nome;
    String dataNascimento;
    String endereco;
    String numero;
    String referencia;
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

    void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
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
    public Cliente() {

    }

    public Cliente(String nome, String dataNascimento, String endereco, String numero, String referencia, String telefone, String cidade, String estado) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.numero = numero;
        this.referencia = referencia;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
    }
}
