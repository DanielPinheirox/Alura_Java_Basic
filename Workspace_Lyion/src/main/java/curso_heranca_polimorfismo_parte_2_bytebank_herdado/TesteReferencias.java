package curso_heranca_polimorfismo_parte_2_bytebank_herdado;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        //Funcionario g1 = new Gerente();
        //Gerente g1 = new Funcionario();
        g1.setNome("Marcos");
        //String nome = g1.getNome();
        //System.out.println(nome);
        g1.setSalario(5000.0);

        //Funcionario f = new Funcionario(); //Conceito - Abstrato
        //f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        //controle.registra(f);
        controle.registra(ev);
        System.out.println(controle.getSoma());
    }
}
