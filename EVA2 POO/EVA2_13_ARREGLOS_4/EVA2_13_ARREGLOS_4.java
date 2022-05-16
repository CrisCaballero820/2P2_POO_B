package EVA2_13_ARREGLOS_4;

import java.util.Scanner;

public class EVA2_13_ARREGLOS_4 {
    public static final int TAM = 32;

    public static void main(String[] args) {
        int[] arreglosEdad = new int[TAM]; //4 bytes = 1 entero
        System.out.println("El arreglo es de " + arreglosEdad.length);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arreglosEdad.length; i++) {
            System.out.println("Cual es tu edad ");
            arreglosEdad[i] = input.nextInt();

        }
        for (int i = 0; i < arreglosEdad.length; i++) {
            System.out.print("[" + arreglosEdad[i] + "]");

        }

    }

}
