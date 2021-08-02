package biblioteca;

public class Livro {

    // atributos
    String titulo;
    String autor;
    String area;
    String editora;
    int ano;
    int edicao;
    int numeroFolhas;

    
    // costrutores
    public Livro() {

    }

    public Livro(String titulo, String autor, String area, String editora, int ano, int edicao, int numeroFolhas) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroFolhas = numeroFolhas;
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }
}
