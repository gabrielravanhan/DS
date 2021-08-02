package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Usuario leitor = new Usuario("João", 22, "M", "1111111111");
        Livro livro = new Livro("Desenvolvimento de SW", "Rogerio Furlan", "Tecnologia", "CPS", 2020, 1, 512);
        Emprestimo emprestimo = new Emprestimo("07/05/2021", "11:41");
        
        emprestimo.setLeitor(leitor);
        
        System.out.println("-------------Emprestimo-------------");
        System.out.println("Data Emprestimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Hora empréstimo: " + emprestimo.getHoraEmprestimo());
        System.out.println("Leitor: " + emprestimo.getLeitor().getNome());
    }

}
