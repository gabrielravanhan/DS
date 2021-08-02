
public class Motor {

    // Atributos
    private double potencia;
    private String combustivel;
    private String chassi;

    // Métodos set's e get's
    private void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    private void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    private void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getChassi() {
        return chassi;
    }

    // Construtor
    public Motor(double potencia, String combustivel, String chassi) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.chassi = chassi;
    }
}
