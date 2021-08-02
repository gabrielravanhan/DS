package ds_biblioteca;

public class Ds_biblioteca {

    public static void main(String[] args) {
        Usuarios leitor = new Usuarios("MICHELLE", 18, "F", "1111111111");
        Livros livro = new Livros("O AMOR", "Rogerio Furlan", "", "CPS", 1999, 1, 512, false);
        Emprestimos emprestimo = new Emprestimos("20/10/2012", "11:41");

        emprestimo.setLeitor(leitor);
        emprestimo.setLivro(livro);

        System.out.println("-----Emprestimo-----");
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Usuário: " + emprestimo.getLeitor().getNome());
        System.out.println("Data: " + emprestimo.getDataEmprestimo());
        emprestimo.abrir();
        emprestimo.ler();
        emprestimo.fechar();
        emprestimo.devolverLivro();
    }

}
