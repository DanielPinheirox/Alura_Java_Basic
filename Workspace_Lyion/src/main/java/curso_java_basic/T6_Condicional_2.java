package curso_java_basic;

public class T6_Condicional_2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 20;
        boolean quantidadePessoas = true;
        if (idade >= 18 || quantidadePessoas) { // booleano
            System.out.println("você não te  18 anos, mas pode entrar, pois esta acompanhando");
        } else {
            System.out.println("não pode entrar");
        }
    }
}
