package votacao;

public class Candidato {

    // Atributos
    private String nome;
    private int quantidadeVotos;

    // Construtor
    public Candidato(String nome, int quantidadeVotos) {
        this.nome = nome;
        this.quantidadeVotos = quantidadeVotos;
    }

    // Método para acrescentar votos
    public void acrescentarVoto() {
        this.quantidadeVotos = this.quantidadeVotos + 1;
        System.out.println("Quantidade nova de votos em " + this.nome + " é: " + this.quantidadeVotos);
    }

    // Métodos set's e get's
    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return nome;
    }

    private void setQuantidadeVotos(int quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }

    private int getQuantidadeVotos() {
        return quantidadeVotos;
    }
}
