package curso_heranca_polimorfismo_parte_3_bytebank_herdado_conta;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguroDeVida);

        System.out.println(calc.getTotalImposto());
    }
}
