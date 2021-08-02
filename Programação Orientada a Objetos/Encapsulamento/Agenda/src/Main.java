
public class Main {

    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();

        agenda1.anote(02, 10, 2021, "Dia das Crianças");
        agenda2.anote(07, 15, 2021, "Independência do Brasil");

        agenda1.mostrarAnotacao();
        agenda2.mostrarAnotacao();
    }
}
