package poo_aula;

public class Poo_aula {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Carro meuOutroCarro = new Carro("BRANCO", "PASSEIO", "GGG-0000", 2);
        Pessoa minhaPessoa = new Pessoa();

        minhaPessoa.setNome("Lara");
        minhaPessoa.setCorDoCabelo("Loiro");
        minhaPessoa.setBiotipo("Magra");
        minhaPessoa.setIdade(30);

        meuCarro.setDono(minhaPessoa);

        minhaPessoa.setCarro(meuOutroCarro);

        minhaPessoa.ligarCarro();
        minhaPessoa.setCambioMarcha(1);
        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();

        System.out.println("");

        minhaPessoa.setCambioMarcha(2);
        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();

        System.out.println("");

        minhaPessoa.setCambioMarcha(3);
        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();

        System.out.println("");

        minhaPessoa.setCambioMarcha(2);
        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();

        System.out.println("");

        minhaPessoa.ligarCarro();
        minhaPessoa.setCambioMarcha(1);
        minhaPessoa.getCarro().getCambio();
        minhaPessoa.acelerarCarro();

        System.out.println("");

        minhaPessoa.ligarCarro();
        minhaPessoa.setCambioMarcha(0);
        minhaPessoa.frearCarro();
        minhaPessoa.desligarCarro();

        System.out.println("");

        Pessoa minhaOutraPessoa = new Pessoa("SIDNEY", "BRANCO", "MAGRO", 52);

        meuCarro.setCor("PRETO");
        meuCarro.setTipo("PASSEIO");
        meuCarro.setPlaca("GGG-1111");
        meuCarro.setNumPortas(6);

        System.out.println("-----CARRO-----");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Num.Portas: " + meuCarro.getNumPortas());
        System.out.println("Dono - Nome: " + meuCarro.getDono().getNome());
        System.out.println("Dono - Cor do Cabelo: " + meuCarro.getDono().getCorDoCabelo());
        System.out.println("Dono - Biotipo: " + meuCarro.getDono().getBiotipo());
        System.out.println("Dono - Idade: " + meuCarro.getDono().getIdade());

        System.out.println("-----CARRO 2-----");
        System.out.println("Cor: " + meuOutroCarro.getCor());
        System.out.println("Tipo: " + meuOutroCarro.getTipo());
        System.out.println("Placa: " + meuOutroCarro.getPlaca());
        System.out.println("Num.Portas: " + meuOutroCarro.getNumPortas());

        minhaPessoa.setNome("GABRIEL");
        minhaPessoa.setCorDoCabelo("CASTANHO");
        minhaPessoa.setBiotipo("MAGRO");
        minhaPessoa.setIdade(16);

        System.out.println("-----PESSOA-----");
        System.out.println("Nome: " + minhaPessoa.getNome());
        System.out.println("Cor do cabelo: " + minhaPessoa.getCorDoCabelo());
        System.out.println("Biotipo: " + minhaPessoa.getBiotipo());
        System.out.println("Idade: " + minhaPessoa.getIdade());

        System.out.println("-----PESSOA 2-----");
        System.out.println("Nome: " + minhaOutraPessoa.getNome());
        System.out.println("Cor do cabelo: " + minhaOutraPessoa.getCorDoCabelo());
        System.out.println("Biotipo: " + minhaOutraPessoa.getBiotipo());
        System.out.println("Idade: " + minhaOutraPessoa.getIdade());
    }

}
