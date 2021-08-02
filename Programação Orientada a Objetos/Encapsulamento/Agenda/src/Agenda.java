
public class Agenda {

    private int dia;
    private int mes;
    private int ano;
    private String anotacao;

    public void anote(int dia, int mes, int ano, String anotacao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.anotacao = anotacao;

        validaData();
    }

    private void validaData() {
        if ((dia < 0) || (dia > 31) || (mes < 0) || (mes > 12)) {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            this.anotacao = "Anotação não inserida: Data Inválida";
        }
    }

    public void mostrarAnotacao() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano + ": " + this.anotacao);
    }
}
