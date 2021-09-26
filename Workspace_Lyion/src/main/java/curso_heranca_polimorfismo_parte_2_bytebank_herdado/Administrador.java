package curso_heranca_polimorfismo_parte_2_bytebank_herdado;

public class Administrador extends Funcionario implements Autentivavel{

    private AutenticacaoUti autenticador;

    public Administrador(){
        this.autenticador = new AutenticacaoUti();
    }
    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
