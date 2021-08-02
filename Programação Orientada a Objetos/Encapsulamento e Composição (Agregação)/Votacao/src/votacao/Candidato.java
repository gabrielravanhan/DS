package votacao;

public class Candidato {

    private String nome;
    private int quantidadeVotos;

    public Candidato(String nome, int quantidadeVotos) {
        this.nome = nome;
        this.quantidadeVotos = quantidadeVotos;
    }

    public void acrescentarVoto() {
        this.quantidadeVotos = this.quantidadeVotos + 1;
        System.out.println("Quantidade nova de votos: " + this.quantidadeVotos);
    }

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
