package ds_biblioteca;

public class Livros {

    // Atributos
    String titulo;
    String autor;
    String area;
    String editora;
    int ano;
    int edicao;
    int numeroFolhas;
    boolean emprestimo;

    // Construtores
    public Livros() {

    }

    public Livros(String titulo, String autor, String area, String editora, int ano, int edicao, int numeroFolhas, boolean emprestimo) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroFolhas = numeroFolhas;
        this.emprestimo = false;
    }

    // Comportamentos
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

    public int setEdicao() {
        return edicao;
    }

    void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public boolean getEmpretimo() {
        return emprestimo;
    }

    void abrirLivro() {
        System.out.println("LIVRO ESTÁ ABERTO PARA LEITURA");
    }

    void fecharLivro() {
        System.out.println("LIVRO ESTÁ FECHADO PARA LEITURA");
    }
}
