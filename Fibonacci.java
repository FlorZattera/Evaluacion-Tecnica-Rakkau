
public class Fibonacci {
    public static void main(String[] args) {
        int anterior = 1;
        int actual = 2;
        int sum = actual;

        while (actual <= 4000000) {
            int proximo = anterior + actual;
            anterior = actual;
            actual = proximo;

            if (actual % 2 == 0) {
                sum += actual;
            }
        }
//De esta manera el bucle seguirá corriendo hasta llegar al 4 millones y sumará los que haya guardado
        System.out.println(sum);
    }
}