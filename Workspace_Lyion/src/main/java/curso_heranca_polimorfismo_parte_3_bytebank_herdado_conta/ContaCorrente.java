package curso_heranca_polimorfismo_parte_3_bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {
    //não herda construtores

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
        //chama o construtor especifico
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }

    @Override //rescrever o codigo
    public boolean saca(double valor) {
        double valorSacar = valor + 0.2;
        return super.saca(valorSacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
