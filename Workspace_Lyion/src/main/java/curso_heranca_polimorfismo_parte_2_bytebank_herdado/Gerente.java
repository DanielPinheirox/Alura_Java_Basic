package curso_heranca_polimorfismo_parte_2_bytebank_herdado;
//Gerente é um funcionario é assina um contrato, pode assinar varios contratos
public class Gerente extends Funcionario implements Autentivavel{

    private AutenticacaoUti autenticador;

    public double getBonificacao(){
        System.out.println("CHAMANDO A BONIFICAÇÂO DO GERENTE");
        return super.getBonificacao() + super.getSalario(); // super o salario vem da classe mãe
        //super pode reutilizar os metodos da clase mae
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        //this.senha = senha; //Foi transferido para AutenticacaoUti

    }

    //@Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
        //if (this.senha == senha) {
            //return true;
        //} else {
            //return false;
        //}
    }

}
