package EVA3_1_OVERFLOW;

public class EVA3_1_OVERFLOW {

    public static int cont = 0;

    public static void main(String[] args) {
        int x = 10;
        terminarStack();

        int cont = 0;
    }

    public static void terminarStack() {

        cont = cont + 1;
        System.out.println(cont);
        terminarStack();

    }
}
