public class Main {
    public static void main(String[] args) {
        // Criando um objeto Calculadora
        Calculadora calculadora = new Calculadora(25, 10);

        // Realizando as operações matemáticas
        double soma = calculadora.somar();
        double subtracao = calculadora.subtrair();
    }
    
    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + subtracao);
}