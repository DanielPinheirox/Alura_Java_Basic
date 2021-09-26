package curso_heranca_polimorfismo_parte_2_bytebank_herdado;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autentivavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou){
            System.out.println("pode entra no sistesma");
        } else {
            System.out.println("não podera entrar no sistema");
        }
    }
}
