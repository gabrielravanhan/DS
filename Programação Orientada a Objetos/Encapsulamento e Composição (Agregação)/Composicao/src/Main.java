
public class Main {

    public static void main(String[] args) {

        Motor motor01 = new Motor(150, "Gasolina", "abc123");
        Direcao direcao01 = new Direcao("Azul", true);

        Automovel automovel01 = new Automovel(motor01, direcao01);

        automovel01.exibirResultados();
    }
}
