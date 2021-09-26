package curso_java_orientado_objeto_parte_1;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // new deu uma referencia da classe Conta
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);


    }
}
