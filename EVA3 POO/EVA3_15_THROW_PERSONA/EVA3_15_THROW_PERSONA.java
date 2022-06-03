package EVA3_15_THROW_PERSONA;

public class EVA3_15_THROW_PERSONA {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Cristian Caballero");
        
        try {
            persona.setEdad(20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            Persona persona2 = new Persona("Cristian Caballero", 20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad >= 0 && edad <= 130) {
            this.edad = edad;
        } else {
            throw new Exception("Rango de edad incorrecto");
        }
    }
}
