package EVA3_16_CUSTOM_EXCEPTION;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EVA3_16_CUSTOM_EXCEPTION {

    public static void main(String[] args) throws exCaptura {
        Scanner spect = new Scanner(System.in);
        System.out.println("INgresa edad");
        int valor = 0;
        try {
            valor = spect.nextInt();
        } catch (InputMismatchException ex) {
            throw new exCaptura("Pusiste una cadena de texto");
        }

    }
}

class exCaptura extends Exception {

    public exCaptura() {
    }

    public exCaptura(String message) {
        super(message);
    }
}
