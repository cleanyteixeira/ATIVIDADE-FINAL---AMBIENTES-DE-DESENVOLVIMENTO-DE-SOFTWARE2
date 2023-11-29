public class Calculadora {
    // Variáveis
    private double numero1;
    private double numero2;

    // Construtor
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos
    public double somar() {
        return numero1 + numero2;
    }

    public double subtrair() {
        return numero1 - numero2;
    }
    public double multiplicar() {
        return numero1 * numero2;
    }
    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }

        public double elevarAoQuadrado() {
            return Math.pow(numero1, 2);
        }
}