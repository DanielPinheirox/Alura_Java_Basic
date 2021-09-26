package curso_heranca_polimorfismo_parte_3_bytebank_herdado_conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }
}
