package curso_java_orientado_objeto_parte_2_composto;

public class Conta {
    //atributos
    private double saldo;
    int agencia;
    int numero;
    Cliente titular; //Classe cliente // Associação
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
}
