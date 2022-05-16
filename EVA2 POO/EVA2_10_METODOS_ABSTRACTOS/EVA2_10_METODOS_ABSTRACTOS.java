package EVA2_10_METODOS_ABSTRACTOS;

public class EVA2_10_METODOS_ABSTRACTOS {

    public static void main(String[] args) {

    }

}

class ImplementoAbstracto extends ClaseAbstracta {

    @Override
    public void MetodoAbstracto() {

    }

}

abstract class ClaseAbstracta {

    public void ModoIMplementado() {
        System.out.println("Metodo Implementado");

    }

    public abstract void MetodoAbstracto();

}
