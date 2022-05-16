package eva2_18_interfaces_obj;

public class EVA2_18_INTERFACES_OBJ {

    public static void main(String[] args) {
     Persona persona = new Persona();
        persona.setNombre("Cristian");
        
        Mensajes mensajes = persona;
        mensajes.mostrarMensajes();
    }
    
}

interface Mensajes{
    public void mostrarMensajes();
}

class Persona implements Mensajes{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarMensajes() {
        System.out.println(nombre);
    }
    
}
