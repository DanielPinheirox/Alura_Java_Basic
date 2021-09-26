package curso_java_basic;

public class T7_While {
    public static void main(String[] args) {

        int contador = 0;
        int total = 0;
        while (contador <= 10) {
            System.out.println(contador);
            //contador = contador + 1;
            contador += 1;
        }
        while (contador <= 10) {
            total += contador;
            contador++;
        }
        System.out.println(total);
    }
}
