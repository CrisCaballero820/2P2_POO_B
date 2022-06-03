package EVA3_7_USO_EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_7_USO_EXCEPCIONES {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean datoErroneo = true;

        do {
            try {
                System.out.println("Introduce tu edad en numero entero");
                int edad = input.nextInt();
                System.out.println("Tu edad: " + edad);
                datoErroneo = false;

            } catch (InputMismatchException e) {
                System.out.println(input.next() + " no es un numero valido");
            }
        } while (datoErroneo);

    }
}
