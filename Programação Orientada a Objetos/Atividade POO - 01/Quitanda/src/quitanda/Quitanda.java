package quitanda;

public class Quitanda {

    public static void main(String[] args) {
        // Instanciando um objeto de cada uma das classes
        // Cliente
        Cliente primeiroCliente = new Cliente();
        // Fornecedor
        Fornecedor primeiroFornecedor = new Fornecedor();
        // Fruta
        Fruta primeiraFruta = new Fruta();
        // Outro Produto
        OutroProduto primeiroOutroProduto = new OutroProduto();

        // Atribuindo aos métodos set’s seus valores
        // Cliente
        primeiroCliente.setNome("Gabriel");
        primeiroCliente.setDataNascimento("10/11/2004");
        primeiroCliente.setEndereco("Rua Equador, Santa Rita");
        primeiroCliente.setNumero("001");
        primeiroCliente.setReferencia("CART");
        primeiroCliente.setTelefone("11111-1111");
        primeiroCliente.setCidade("Macatuba");
        primeiroCliente.setEstado("São Paulo");
        // Fornecedor
        primeiroFornecedor.setNome("Rogério");
        primeiroFornecedor.setProdutoQueFornece("Morango");
        primeiroFornecedor.setTelefone("11111-1110");
        primeiroFornecedor.setCidade("Macatuba");
        primeiroFornecedor.setEstado("São Paulo");
        // Fruta
        primeiraFruta.setNome("Morango");
        primeiraFruta.setDataDeValidade("02/05/2021");
        primeiraFruta.setPreco(2.5);
        primeiraFruta.setQuantidade(5);
        // Outro Produto
        primeiroOutroProduto.setNome("Alface");
        primeiroOutroProduto.setDataDeValidade("10/05/2021");
        primeiroOutroProduto.setPreco(3);
        primeiroOutroProduto.setQuantidade(10);

        // Imprimindo valores através dos métodos get's
        // Cliente
        System.out.println("CLIENTE 1");
        System.out.println("Nome: " + primeiroCliente.getNome());
        System.out.println("Data de nascimento: " + primeiroCliente.getDataNascimento());
        System.out.println("Endereço: " + primeiroCliente.getEndereco());
        System.out.println("Número: " + primeiroCliente.getNumero());
        System.out.println("Referência: " + primeiroCliente.getReferencia());
        System.out.println("Telefone: " + primeiroCliente.getTelefone());
        System.out.println("Cidade: " + primeiroCliente.getCidade());
        System.out.println("Estado: " + primeiroCliente.getEstado());
        // Fornecedor
        System.out.println("\nFORNECEDOR 1");
        System.out.println("Nome: " + primeiroFornecedor.getNome());
        System.out.println("Produto que fornece: " + primeiroFornecedor.getProdutoQueFornece());
        System.out.println("Telefone: " + primeiroFornecedor.getTelefone());
        System.out.println("Cidade: " + primeiroFornecedor.getCidade());
        System.out.println("Estado: " + primeiroFornecedor.getEstado());
        // Fruta
        System.out.println("\nFRUTA 1");
        System.out.println("Nome: " + primeiraFruta.getNome());
        System.out.println("Data de validade: " + primeiraFruta.getDataDeValidade());
        System.out.println("Preço: " + primeiraFruta.getPreco());
        System.out.println("Quantidade: " + primeiraFruta.getQuantidade());
        // Outro Produto
        System.out.println("\nOUTRO PRODUTO 1");
        System.out.println("Nome: " + primeiroOutroProduto.getNome());
        System.out.println("Data de validade: " + primeiroOutroProduto.getDataDeValidade());
        System.out.println("Preço: " + primeiroOutroProduto.getPreco());
        System.out.println("Quantidade: " + primeiroOutroProduto.getQuantidade());

        // Instanciando cinco objetos, cada um com um construtor diferente
        // Cliente
        Cliente segundoCliente = new Cliente("Jônatas", "09/10/2004", "Rua Carlos Gomes, Jardim Maria Luíza I", "002", "Mercearia do Léo", "22222-2222", "Lençóis Paulista", "São Paulo");
        Cliente terceiroCliente = new Cliente("André", "06/02/2004", "Rua São João, Jardim Europa", "003", "Bar do Paulinho", "33333-3333", "Ubatuba", "São Paulo");
        Cliente quartoCliente = new Cliente("Gilson", "24/007/1985", "Rua Cruzeiro, Jardim América", "004", "Açougue do Osmarzinho", "44444-4444", "Belo Horizonte", "Minas Gerais");
        Cliente quintoCliente = new Cliente("Luiz Felipe", "06/02/2000", "Rua Antonia Paccola, Jardim Maria Luíza II", "005", "Posto Monten Azul", "55555-5555", "Macatuba", "São Paulo");
        Cliente sextoCliente = new Cliente("Luis Fernando", "01/01/1999", "Rua Nelo, Jardim Morumbi", "006", "Kron-it", "66666-6666", "Lençóis Paulista", "São Paulo");
        // Fornecedor
        Fornecedor segundoFornecedor = new Fornecedor("Sidney", "Banana", "22222-2220", "Salvador", "Bahia");
        Fornecedor terceiroFornecedor = new Fornecedor("Tiago", "Uva", "33333-3330", "Palmas", "Tocantins");
        Fornecedor quartoFornecedor = new Fornecedor("Reginaldo", "Melancia", "44444-4440", "São Paulo", "São Paulo");
        Fornecedor quintoFornecedor = new Fornecedor("Adilson", "Abacaxi", "55555-5550", "Vitória", "Espírito Santo");
        Fornecedor sextoFornecedor = new Fornecedor("Carlos", "Laranja", "66666-6660", "Macatuba", "São Paulo");
        // Fruta
        Fruta segundaFruta = new Fruta("Banana", "24/08/2021", 2.25, 6);
        Fruta terceiraFruta = new Fruta("Uva", "12/05/2021", 0.5, 20);
        Fruta quartaFruta = new Fruta("Melancia", "18/09/2021", 5, 15);
        Fruta quintaFruta = new Fruta("Abacaxi", "10/12/2021", 3.75, 8);
        Fruta sextaFruta = new Fruta("Laranja", "13/11/2021", 3, 10);
        // OutroProduto
        OutroProduto segundoOutroProduto = new OutroProduto("Cenoura", "19/11/2021", 3, 4);
        OutroProduto terceiroOutroProduto = new OutroProduto("Repolho", "26/04/2021", 4, 7);
        OutroProduto quartoOutroProduto = new OutroProduto("Abóbora", "03/05/2021", 7, 5);
        OutroProduto quintoOutroProduto = new OutroProduto("Chuchu", "21/11/2021", 2.75, 3);
        OutroProduto sextoOutroProduto = new OutroProduto("Beterraba", "15/09/2021", 3.4, 11);

        // Acessando os cinco objetos, imprimindo seus valores
        // Cliente
        System.out.println("\nCLIENTE 2");
        System.out.println("Nome: " + segundoCliente.getNome());
        System.out.println("Data de nascimento: " + segundoCliente.getDataNascimento());
        System.out.println("Endereço: " + segundoCliente.getEndereco());
        System.out.println("Número: " + segundoCliente.getNumero());
        System.out.println("Referência: " + segundoCliente.getReferencia());
        System.out.println("Telefone: " + segundoCliente.getTelefone());
        System.out.println("Cidade: " + segundoCliente.getCidade());
        System.out.println("Estado: " + segundoCliente.getEstado());

        System.out.println("\nCLIENTE 3");
        System.out.println("Nome: " + terceiroCliente.getNome());
        System.out.println("Data de nascimento: " + terceiroCliente.getDataNascimento());
        System.out.println("Endereço: " + terceiroCliente.getEndereco());
        System.out.println("Número: " + terceiroCliente.getNumero());
        System.out.println("Referência: " + terceiroCliente.getReferencia());
        System.out.println("Telefone: " + terceiroCliente.getTelefone());
        System.out.println("Cidade: " + terceiroCliente.getCidade());
        System.out.println("Estado: " + terceiroCliente.getEstado());

        System.out.println("\nCLIENTE 4");
        System.out.println("Nome: " + quartoCliente.getNome());
        System.out.println("Data de nascimento: " + quartoCliente.getDataNascimento());
        System.out.println("Endereço: " + quartoCliente.getEndereco());
        System.out.println("Número: " + quartoCliente.getNumero());
        System.out.println("Referência: " + quartoCliente.getReferencia());
        System.out.println("Telefone: " + quartoCliente.getTelefone());
        System.out.println("Cidade: " + quartoCliente.getCidade());
        System.out.println("Estado: " + quartoCliente.getEstado());

        System.out.println("\nCLIENTE 5");
        System.out.println("Nome: " + quintoCliente.getNome());
        System.out.println("Data de nascimento: " + quintoCliente.getDataNascimento());
        System.out.println("Endereço: " + quintoCliente.getEndereco());
        System.out.println("Número: " + quintoCliente.getNumero());
        System.out.println("Referência: " + quintoCliente.getReferencia());
        System.out.println("Telefone: " + quintoCliente.getTelefone());
        System.out.println("Cidade: " + quintoCliente.getCidade());
        System.out.println("Estado: " + quintoCliente.getEstado());

        System.out.println("\nCLIENTE 6");
        System.out.println("Nome: " + sextoCliente.getNome());
        System.out.println("Data de nascimento: " + sextoCliente.getDataNascimento());
        System.out.println("Endereço: " + sextoCliente.getEndereco());
        System.out.println("Número: " + sextoCliente.getNumero());
        System.out.println("Referência: " + sextoCliente.getReferencia());
        System.out.println("Telefone: " + sextoCliente.getTelefone());
        System.out.println("Cidade: " + sextoCliente.getCidade());
        System.out.println("Estado: " + sextoCliente.getEstado());

        //Fornecedor
        System.out.println("\nFORNECEDOR 2");
        System.out.println("Nome: " + segundoFornecedor.getNome());
        System.out.println("Produto que fornece: " + segundoFornecedor.getProdutoQueFornece());
        System.out.println("Telefone: " + segundoFornecedor.getTelefone());
        System.out.println("Cidade: " + segundoFornecedor.getCidade());
        System.out.println("Estado: " + segundoFornecedor.getEstado());

        System.out.println("\nFORNECEDOR 3");
        System.out.println("Nome: " + terceiroFornecedor.getNome());
        System.out.println("Produto que fornece: " + terceiroFornecedor.getProdutoQueFornece());
        System.out.println("Telefone: " + terceiroFornecedor.getTelefone());
        System.out.println("Cidade: " + terceiroFornecedor.getCidade());
        System.out.println("Estado: " + terceiroFornecedor.getEstado());

        System.out.println("\nFORNECEDOR 4");
        System.out.println("Nome: " + quartoFornecedor.getNome());
        System.out.println("Produto que fornece: " + quartoFornecedor.getProdutoQueFornece());
        System.out.println("Telefone: " + quartoFornecedor.getTelefone());
        System.out.println("Cidade: " + quartoFornecedor.getCidade());
        System.out.println("Estado: " + quartoFornecedor.getEstado());

        System.out.println("\nFORNECEDOR 5");
        System.out.println("Nome: " + quintoFornecedor.getNome());
        System.out.println("Produto que fornece: " + quintoFornecedor.getProdutoQueFornece());
        System.out.println("Telefone: " + quintoFornecedor.getTelefone());
        System.out.println("Cidade: " + quintoFornecedor.getCidade());
        System.out.println("Estado: " + quintoFornecedor.getEstado());

        System.out.println("\nFORNECEDOR 6");
        System.out.println("Nome: " + sextoFornecedor.getNome());
        System.out.println("Produto que fornece: " + sextoFornecedor.getProdutoQueFornece());
        System.out.println("Telefone: " + sextoFornecedor.getTelefone());
        System.out.println("Cidade: " + sextoFornecedor.getCidade());
        System.out.println("Estado: " + sextoFornecedor.getEstado());

        //Fruta
        System.out.println("\nFRUTA 2");
        System.out.println("Nome: " + segundaFruta.getNome());
        System.out.println("Data de validade: " + segundaFruta.getDataDeValidade());
        System.out.println("Preço: " + segundaFruta.getPreco());
        System.out.println("Quantidade: " + segundaFruta.getQuantidade());

        System.out.println("\nFRUTA 3");
        System.out.println("Nome: " + terceiraFruta.getNome());
        System.out.println("Data de validade: " + terceiraFruta.getDataDeValidade());
        System.out.println("Preço: " + terceiraFruta.getPreco());
        System.out.println("Quantidade: " + terceiraFruta.getQuantidade());

        System.out.println("\nFRUTA 4");
        System.out.println("Nome: " + quartaFruta.getNome());
        System.out.println("Data de validade: " + quartaFruta.getDataDeValidade());
        System.out.println("Preço: " + quartaFruta.getPreco());
        System.out.println("Quantidade: " + quartaFruta.getQuantidade());

        System.out.println("\nFRUTA 5");
        System.out.println("Nome: " + quintaFruta.getNome());
        System.out.println("Data de validade: " + quintaFruta.getDataDeValidade());
        System.out.println("Preço: " + quintaFruta.getPreco());
        System.out.println("Quantidade: " + quintaFruta.getQuantidade());

        System.out.println("\nFRUTA 6");
        System.out.println("Nome: " + sextaFruta.getNome());
        System.out.println("Data de validade: " + sextaFruta.getDataDeValidade());
        System.out.println("Preço: " + sextaFruta.getPreco());
        System.out.println("Quantidade: " + sextaFruta.getQuantidade());

        //OutroProduto
        System.out.println("\nOUTRO PRODUTO 2");
        System.out.println("Nome: " + segundoOutroProduto.getNome());
        System.out.println("Data de validade: " + segundoOutroProduto.getDataDeValidade());
        System.out.println("Preço: " + segundoOutroProduto.getPreco());
        System.out.println("Quantidade: " + segundoOutroProduto.getQuantidade());

        System.out.println("\nOUTRO PRODUTO 3");
        System.out.println("Nome: " + terceiroOutroProduto.getNome());
        System.out.println("Data de validade: " + terceiroOutroProduto.getDataDeValidade());
        System.out.println("Preço: " + terceiroOutroProduto.getPreco());
        System.out.println("Quantidade: " + terceiroOutroProduto.getQuantidade());

        System.out.println("\nOUTRO PRODUTO 4");
        System.out.println("Nome: " + quartoOutroProduto.getNome());
        System.out.println("Data de validade: " + quartoOutroProduto.getDataDeValidade());
        System.out.println("Preço: " + quartoOutroProduto.getPreco());
        System.out.println("Quantidade: " + quartoOutroProduto.getQuantidade());

        System.out.println("\nOUTRO PRODUTO 5");
        System.out.println("Nome: " + quintoOutroProduto.getNome());
        System.out.println("Data de validade: " + quintoOutroProduto.getDataDeValidade());
        System.out.println("Preço: " + quintoOutroProduto.getPreco());
        System.out.println("Quantidade: " + quintoOutroProduto.getQuantidade());

        System.out.println("\nOUTRO PRODUTO 6");
        System.out.println("Nome: " + sextoOutroProduto.getNome());
        System.out.println("Data de validade: " + sextoOutroProduto.getDataDeValidade());
        System.out.println("Preço: " + sextoOutroProduto.getPreco());
        System.out.println("Quantidade: " + sextoOutroProduto.getQuantidade());
    }

}
