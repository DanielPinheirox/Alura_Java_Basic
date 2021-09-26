package curso_java_basic;

public class T2_Caracteres {
    public static void main(String[] args) {
        char letra = 'a'; //tabela unicode
        System.out.println(letra);
        char valor = 66;
        System.out.println(valor);
        valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);
        palavra = palavra + 2020;
        System.out.println(palavra);
    }
}
