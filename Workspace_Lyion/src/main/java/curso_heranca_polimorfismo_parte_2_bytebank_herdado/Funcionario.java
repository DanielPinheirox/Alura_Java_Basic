package curso_heranca_polimorfismo_parte_2_bytebank_herdado;
//nao pode instanciar dessa classe, pq e abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario; //publico para os filhos

    //construtor
    public Funcionario(){

    }

    public double getBonificacao(){
        return this.salario * 0.5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
