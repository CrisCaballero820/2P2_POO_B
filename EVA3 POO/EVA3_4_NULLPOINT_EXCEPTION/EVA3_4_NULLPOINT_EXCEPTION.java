package EVA3_4_NULLPOINT_EXCEPTION;

public class EVA3_4_NULLPOINT_EXCEPTION {

    public static void main(String[] args) {
        Persona persona = null;
        imprimir(persona);

    }

    public static void imprimir(Persona perso) {
        masComplicado(perso);
    }

    public static void masComplicado(Persona perso) {
        System.out.println("Nombre" + perso.getNombre());

    }

    public class Persona {

        String Nombre;

        public Persona() {
        }

        public Persona(String Nombre) {
            this.Nombre = Nombre;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

    }

}
