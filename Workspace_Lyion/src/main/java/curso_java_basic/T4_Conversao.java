package curso_java_basic;

public class T4_Conversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int )salario;
        System.out.println(valor); //cast

        float pontoFlutuante = 3.14f;
        long numeroGrande = 323203923232l; //Letra L no final
        short valorPequeno = 2131;
        byte b = 127;
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
    }
}
