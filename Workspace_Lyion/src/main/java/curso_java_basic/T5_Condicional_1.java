package curso_java_basic;

public class T5_Condicional_1 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        if(idade >=18) {
            System.out.println("Maior de Idade");
        }else {
            if (quantidadePessoas >= 2){
                System.out.println("você não te  18 anos, mas pode entrar, pois esta acompanhando");
            }
            else {
                System.out.println("não pode entrar");
            }
        }
        System.out.println("Seja bem vindo");
    }
}
