package curso_heranca_polimorfismo_parte_1_bytebank_encapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1212,12122);

        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("Paulo silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        //agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());

        Conta conta2 = new Conta(1212,12122);
        Conta conta3 = new Conta(1212,12122);
        Conta conta4 = new Conta(1212,12122);

        System.out.println("o total de contas é : " + Conta.getTotal());
    }
}
