public class Multiples {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        System.out.println(" La suma de los multiples de 3 o 5 menores que 1000 es " + suma);
    }
}