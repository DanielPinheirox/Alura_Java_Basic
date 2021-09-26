package curso_java_orientado_objeto_parte_1;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // referencia
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
        Conta segundaConta = primeiraConta; //aqui não tem um objeto e sim uma referencia
        System.out.println("saldo da segunda conta: " + segundaConta);
        segundaConta.saldo +=100;
        System.out.println("saldo da segunda conta: " + segundaConta);
        System.out.println("saldo da primeira conta: " + primeiraConta);

        if(primeiraConta == segundaConta){
            System.out.println("mesma conta");
        }else {
            System.out.println("contas diferentes");
        }
    }
}
