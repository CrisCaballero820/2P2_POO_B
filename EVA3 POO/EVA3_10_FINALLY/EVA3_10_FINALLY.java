package EVA3_10_FINALLY;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_10_FINALLY {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("INtroduce un dato entero");
            int valor = entrada.nextInt();
            System.out.println("El valor es " + valor);

        } catch (InputMismatchException e) {
            e.printStackTrace();

        } finally {

            System.out.println("Esta linea siempre debe ejecutarse");
        }
        System.out.println("fin del programa");
    }
}
