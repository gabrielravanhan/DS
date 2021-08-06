package votacao;

public class Votacao {

    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("Bidu", 3);

        Candidato candidato2 = new Candidato("Sidney", 10);
        
        candidato1.acrescentarVoto();
        
        candidato2.acrescentarVoto();
    }

}
