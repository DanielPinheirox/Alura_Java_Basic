package curso_heranca_polimorfismo_parte_2_bytebank_herdado;

public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }
    public double getSoma() {
        return soma;
    }
}
