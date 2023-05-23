
public class NumberosArmstrong {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 100; i <= 400; i++) {
            int numero = i;
            int digitos = String.valueOf(numero).length();
            int temp = numero;
            int armstrong = 0;
            while (temp > 0) {
                int digito = temp % 10;
                armstrong += Math.pow(digito, digitos);
                temp /= 10;
            }
            if (armstrong == numero) {
                suma += numero;
            }
        }
        System.out.println("The sum of Armstrong numbers between 100 and 400 is: " + suma);
    }
}