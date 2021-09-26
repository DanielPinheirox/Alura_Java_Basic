package curso_java_orientado_objeto_parte_2_composto;

public class TesteBanco {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222.-22";
        paulo.profissao = "programador";

        Conta contaDOPaulo = new Conta();
        contaDOPaulo.deposita(100);
        //associa o cliente
        contaDOPaulo.titular = paulo; //composição
        System.out.println(contaDOPaulo.titular.nome);
    }
}
