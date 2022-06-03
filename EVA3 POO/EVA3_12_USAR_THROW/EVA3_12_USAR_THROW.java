package EVA3_12_USAR_THROW;

import java.util.Scanner;

public class EVA3_12_USAR_THROW {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Introduce un valor entero positivo; ");
            int valor = entrada.nextInt();

            if (valor < 0) {
                throw new Exception("El valor " + valor + " no es una edad valida");
            }
            System.out.println("La edad ingresada es: " + valor);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
