package curso_heranca_polimorfismo_parte_2_bytebank_herdado;
//Composição para reutilização de codigo
public class AutenticacaoUti{

    private int senha;
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }
}
