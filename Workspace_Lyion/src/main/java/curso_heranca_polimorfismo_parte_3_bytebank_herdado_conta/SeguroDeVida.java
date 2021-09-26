package curso_heranca_polimorfismo_parte_3_bytebank_herdado_conta;

public class SeguroDeVida implements Tributavel{

    @Override
    public double getValorImposto() {
        return 42;
    }
}
