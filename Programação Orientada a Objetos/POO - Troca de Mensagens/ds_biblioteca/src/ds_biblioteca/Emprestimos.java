package ds_biblioteca;

public class Emprestimos {

    // Atributos
    String dataEmprestimo;
    String horaEmprestimo;

    Livros livro;
    Usuarios leitor;

    // Construtores
    public Emprestimos() {
    }

    public Emprestimos(String dataEmprestimo, String horaEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
    }

    void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLeitor(Usuarios leitor) {
        this.leitor = leitor;
    }

    public Usuarios getLeitor() {
        return leitor;
    }

    void devolverLivro() {
        livro.emprestimo = true;
        System.out.println("LIVRO DEVOLVIDO");
    }
    
    void abrir(){
        livro.abrirLivro();
    }
    
    void ler(){
        leitor.lerLivro();
    }
    
    void fechar(){
        livro.fecharLivro();
    }
}
