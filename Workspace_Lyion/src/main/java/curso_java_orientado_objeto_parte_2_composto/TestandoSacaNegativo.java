package curso_java_orientado_objeto_parte_2_composto;

public class TestandoSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));
        //System.out.println(conta.saldo);

        //proibido
        //conta.saldo = conta.saldo - 101;
        //System.out.println(conta.saldo);
        conta.saca(101);
        System.out.println(conta.getSaldo());
        //Encapsular - é privar um atributo de ser alterado
    }
}
