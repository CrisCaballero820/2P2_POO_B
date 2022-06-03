package EVA3_3_DIVISION_0;

import java.util.Scanner;

public class EVA3_3_DIVISION_0 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero ");
        int entero1 = input.nextInt();

        System.out.println("Introduce tu edad en un segundo numero entero ");
        int entero2 = input.nextInt();

        System.out.println("Diviosion: " + (entero1 / entero2));

    }

}
