package curso_orientado_objeto_parte_3_encapsulado;

public class Conta {
    //atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente  titular; //Classe cliente // Associação // Relacionamento entre classes
    private static int total;
    //construtor padrão
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta" + "numero da conta " + this.numero
                + "agencia " + this.agencia);
    }
    //metodo
    public void deposita(double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo(){
        //modifica saldo
        //get pega
        //set modifica
        return this.saldo;
    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    public int getNumero(){
        return this.numero;
    }
    //metodo
    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        //só pode acessar atributos staticos da classe
        return total;
    }
}
