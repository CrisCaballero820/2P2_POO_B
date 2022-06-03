package EVA3_6_TRY_CATCH_ZERO;

import java.util.Scanner;

public class EVA3_6_TRY_CATCH_ZERO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero ");
        int entero1 = input.nextInt();

        System.out.println("Introduce tu edad en un segundo numero entero ");
        int entero2 = input.nextInt();

        try {
            System.out.println("Division: " + (entero1 / entero2));
        } catch (ArithmeticException e) {

            System.out.println("Division entre 0");
        }
    }
}
