package curso_heranca_polimorfismo_parte_2_bytebank_herdado;

public class Cliente implements Autentivavel {
    
    private  AutenticacaoUti uti;
    public Cliente(){
        this.uti = new AutenticacaoUti();
    }

    @Override
    public void setSenha(int senha) {
        this.uti.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.uti.autentica(senha);
    }
}
