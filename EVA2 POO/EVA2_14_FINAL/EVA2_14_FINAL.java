package EVA2_14_FINAL;

public class EVA2_14_FINAL {

    public static void main(String[] args) {

    }
}

final class Estudiante extends Persona {

    private String NoControl;

    public Estudiante() {
        super();
        System.out.println("Clase estudiante");
    }

    public Estudiante(String NoControl) {
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

}

class Persona {

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
