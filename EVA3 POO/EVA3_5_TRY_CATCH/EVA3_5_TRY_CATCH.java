package EVA3_5_TRY_cATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_TRY_CATCH {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
        int edad = input.nextInt();

        try {
            edad = input.nextInt();

        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("Ocurrio un fallo en el programa");

        }
        System.out.println("Tu edad:" + edad);

    }

}
