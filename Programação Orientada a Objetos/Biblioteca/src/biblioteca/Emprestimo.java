package biblioteca;

public class Emprestimo {

    String dataEmprestimo;
    String horaEmprestimo;
    
    Livro livro;
    Usuario leitor;
    
    public Emprestimo(){
        
    }
    
    public Emprestimo(String dataEmprestimo, String horaEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
    }
    
    void setDataEmprestimo(String dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public String getDataEmprestimo(){
        return dataEmprestimo;
    }
    
    void setHoraEmprestimo(String horaEmprestimo){
        this.horaEmprestimo = horaEmprestimo;
    }
    
    public String getHoraEmprestimo(){
        return horaEmprestimo;
    }
    
    public void setLivro(Livro livro){
        this.livro = livro;
    }
    
    public Livro getLivro(){
        return livro;
    }
    
    public void setLeitor(Usuario leitor){
        this.leitor = leitor;
    }
    
    public Usuario getLeitor(){
        return leitor;
    }
}
