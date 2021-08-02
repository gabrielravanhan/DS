package biblioteca;

public class Usuario {

    // atributos
    String nome;
    int idade;
    String sexo;
    String telefone;

    // construtores
    public Usuario() {

    }

    public Usuario(String nome, int idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }
}
