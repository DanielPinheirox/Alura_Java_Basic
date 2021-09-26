package curso_orientado_objeto_parte_3_encapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1232, 1232);

        // conta está inconsistente
        conta.setAgencia(-50);
        conta.setNumero(-50);

        System.out.println(conta.getAgencia());

        conta.setAgencia(12321);
    }
}
