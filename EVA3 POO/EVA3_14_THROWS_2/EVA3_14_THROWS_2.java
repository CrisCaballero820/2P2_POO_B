package EVA3_14_THROWS_2;

import java.util.logging.Level;
import java.util.logging.Logger;
//EVA3_15_THROW_PERSONA

public class EVA3_14_THROWS_2 {
    public static void main(String[]args){
        Persona persona = new Persona();
        persona.setNombre("Cristian");
        try {
            persona.setEdad(20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            Persona persona2 = new Persona("Cristian", 20);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    
}
class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws Exception {
        if((edad>=0)&&(edad<=130))
        this.nombre = nombre;
        setEdad(edad);
    }

    public Persona() {
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
        if((edad>=0) && (edad<=130))
        this.edad = edad;
        else{
        throw new Exception("Rango de edad incorrecto");
    }
  }

}