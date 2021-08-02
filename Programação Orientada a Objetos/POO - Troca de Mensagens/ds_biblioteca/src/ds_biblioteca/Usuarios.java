package ds_biblioteca;

public class Usuarios {
    // Atributos
    String nome;
    int idade;
    String sexo;
    String telefone;
    
    // Construtores
    public Usuarios(){
        
    }
    
    public Usuarios(String nome, int idade, String sexo, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        
    }
    
    // Comportamentos
    void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }

    void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }

    void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }

    void lerLivro(){
        System.out.println("USUÁRIO ESTÁ LENDO O LIVRO");
    }
}
