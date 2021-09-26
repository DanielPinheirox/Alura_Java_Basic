package curso_heranca_polimorfismo_parte_2_bytebank_herdado;
//interface /classe abstrata com metodos abstratos
//contrato autenticavel
//quem assinar esse contrato, precisa implementar
// metodo setSenha
// metodo autentica
public abstract interface Autentivavel{
    //private int senha; interface não tem isso

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
