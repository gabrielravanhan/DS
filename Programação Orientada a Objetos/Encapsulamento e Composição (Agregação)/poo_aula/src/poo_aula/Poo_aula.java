package poo_aula;

public class Poo_aula {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Carro meuOutroCarro = new Carro("Branco", "Passeio", "GGG-0000",2);
        Pessoa minhaPessoa = new Pessoa();
        
//        minhaPessoa.setNome("Lara");
//        minhaPessoa.setCorDoCabelo("Loiro");
//        minhaPessoa.setBiotipo("Magra");
//        minhaPessoa.setIdade(30);
//--------------------------------------------        
        minhaPessoa.setCarro(meuOutroCarro);
        
        minhaPessoa.ligarCarro();
//        minhaPessoa.setCambioMarcha(1);
//        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();
        
        System.out.println();
        
//        minhaPessoa.setCambioMarcha(2);
//        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();
        
        System.out.println();
        
//        minhaPessoa.setCambioMarcha(3);
//        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();
                
        System.out.println();
        
//        minhaPessoa.setCambioMarcha(2);
//        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();
        
        System.out.println();
        
//        minhaPessoa.setCambioMarcha(1);
//        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();
        
        System.out.println();
        
//        minhaPessoa.setCambioMarcha(0);
        minhaPessoa.frearCarro();
        minhaPessoa.desligarCarro();
        
        System.out.println();
                
//--------------------------------------------
        Pessoa minhaOutraPessoa1 = new Pessoa("João","Moreno", "Alto", 29);
        Pessoa minhaOutraPessoa2 = new Pessoa("Joana","Loira", "Magra", 18);
        
//        meuCarro.setCor("PRETO");
//        meuCarro.setTipo("PASSEIO");
//        meuCarro.setPlaca("GGG-1111");
//        meuCarro.setNumPortas(6);
        
//        meuCarro.setDono(minhaPessoa);
        
        System.out.println("------CARRO--------");
//        System.out.println("Cor: " + meuCarro.getCor());
//        System.out.println("Tipo: " + meuCarro.getTipo());
//        System.out.println("Placa: " + meuCarro.getPlaca());
//        System.out.println("Num.Portas: " + meuCarro.getNumPortas());
//        System.out.println("Dono - Nome: " + meuCarro.getDono().getNome());
//        System.out.println("Dono - Cor do Cabelo: " + meuCarro.getDono().getCorDoCabelo());
//        System.out.println("Dono - Biotipo: " + meuCarro.getDono().getBiotipo());
//        System.out.println("Dono - Idade: " + meuCarro.getDono().getIdade());

        System.out.println("------CARRO 2------");
//        System.out.println("Cor: " + meuOutroCarro.getCor());
//        System.out.println("Tipo: " + meuOutroCarro.getTipo());
//        System.out.println("Placa: " + meuOutroCarro.getPlaca());
//        System.out.println("Num.Portas: " + meuOutroCarro.getNumPortas());

//        minhaPessoa.setNome("Luis Fernando");
//        minhaPessoa.setCorDoCabelo("Castanho");
//        minhaPessoa.setBiotipo("Alto");
//        minhaPessoa.setIdade(47);
        
        System.out.println("------PESSOA--------");
//        System.out.println("Nome: " + minhaPessoa.getNome());
//        System.out.println("Cor do Cabelo: " + minhaPessoa.getCorDoCabelo());
//        System.out.println("Biotipo: " + minhaPessoa.getBiotipo());
//        System.out.println("Idade: " + minhaPessoa.getIdade());
        
        System.out.println("------PESSOA 1------");
//        System.out.println("Nome: " + minhaOutraPessoa1.getNome());
//        System.out.println("Cor do Cabelo: " + minhaOutraPessoa1.getCorDoCabelo());
//        System.out.println("Biotipo: " + minhaOutraPessoa1.getBiotipo());
//        System.out.println("Idade: " + minhaOutraPessoa1.getIdade());
        
        System.out.println("------PESSOA 2------");
//        System.out.println("Nome: " + minhaOutraPessoa2.getNome());
//        System.out.println("Cor do Cabelo: " + minhaOutraPessoa2.getCorDoCabelo());
//        System.out.println("Biotipo: " + minhaOutraPessoa2.getBiotipo());
//        System.out.println("Idade: " + minhaOutraPessoa2.getIdade());
       
    }
    
}
