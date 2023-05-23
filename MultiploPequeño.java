public class MultiploPequeño {
        public static void main(String[] args) {
            int numero = 20;

            //Empezamos con el 20 y chequeamos si es divisible. Si no lo es, agrega 20 a la variable numero y vuelve
            // a empezar. Repite el proceso hasta encontrar el divisor más pequeño

            while (!isDivisible(numero)) {
                numero += 20;
            }
            System.out.println(" El multiplo más pequeño es el " +numero);
        }

        public static boolean isDivisible(int numero) {
            for (int i = 1; i <= 20; i++) {
                if (numero % i != 0) {
                    return false;
                }
            }
            return true;
        }
    }

