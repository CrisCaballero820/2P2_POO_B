package EVA3_9_CLASE_EXCEPCION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_9_CLASE_EXCEPCION {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Introduce tu edad en numero entero");
            int entero1 = input.nextInt();

            System.out.println("Introduce tu edad en numero entero 2");
            int entero2 = input.nextInt();
            System.out.println("Division: " + (entero1 / entero2));

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("El valor capturado no es valido");
        }
    }

}
