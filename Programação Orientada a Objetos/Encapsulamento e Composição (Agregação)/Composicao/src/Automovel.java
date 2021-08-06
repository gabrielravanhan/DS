
public class Automovel {

    // Atributos
    private Motor motor;
    private Direcao direcao;

    // Métodos set's e get's
    private void setMotor(Motor motor) {
        this.motor = motor;
    }

    private Motor getMotor() {
        return motor;
    }

    private void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    private Direcao getDirecao() {
        return direcao;
    }

    // Construtor
    public Automovel(Motor motor, Direcao direcao) {
        this.motor = motor;
        this.direcao = direcao;
    }

    // Método para exibir resultados
    public void exibirResultados() {
        System.out.println("Direção:");
        System.out.println("-Cor:" + direcao.getCor());
        System.out.println("-Tamanho do Raio:" + direcao.getTamanhoRaio());

        System.out.println("\nMotor:");
        System.out.println("-Potência:" + motor.getPotencia());
        System.out.println("-Combustível:" + motor.getCombustivel());
        System.out.println("-Chassi:" + motor.getChassi());
    }
}
