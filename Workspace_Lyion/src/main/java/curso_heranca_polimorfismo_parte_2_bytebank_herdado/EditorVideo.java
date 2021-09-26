package curso_heranca_polimorfismo_parte_2_bytebank_herdado;

public class EditorVideo extends Funcionario{
    public double getBonificacao(){
        //System.out.println("CHAMANDO A BONIFICAÇÂO DO EDITOR DE VIDEO");
        //return super.getBonificacao() + 100; // super o salario vem da classe mãe
        //super pode reutilizar os metodos da clase mae
        return 200;
    }
}
