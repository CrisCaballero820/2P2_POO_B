package EVA3_8_MULTIPLES_CATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_8_MULTIPLES_CATCH {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Introduce tu edad en numero entero");
            int entero1 = input.nextInt();

            System.out.println("Introduce tu edad en un segundo numero entero");
            int entero2 = input.nextInt();
            System.out.println("Division: " + (entero1 / entero2));

        } catch (ArithmeticException e) {
            System.out.println("Se produjo un error");
        } catch (InputMismatchException i) {
            System.out.println("El valor capturado no es valido");
        }

    }

}
