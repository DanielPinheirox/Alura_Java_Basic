package curso_heranca_polimorfismo_parte_2_bytebank_herdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Gerente();
        nico.setNome("Nico");
        nico.setCpf("222222");
        nico.setSalario(2000.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        //nico.salario = 300;
    }
}
