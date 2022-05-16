package EVA2_5_INTERFACES;

public class EVA2_5_INTERFACES {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Cristian");
        persona.setEdad("20");
        persona.imprimirdatos();

        Vehiculo Vehiculo = new Vehiculo("Ford", "Mustang");
        Vehiculo.imprimirdatos();
        Vehiculo.mostrarMensaje();

        //Muesradatos datos = new Muestradatos();
    }

}

class Persona implements Muestradatos {

    private String Nombre;
    private String Edad;

    public Persona() {
    }

    public Persona(String Nombre, String Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Nombre :" + Nombre);
        System.out.println("Edad :" + Edad);
    }

}

class Vehiculo implements Muestradatos, Mensaje {

    private String Marca;
    private String Modelo;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Marca :" + Marca);
        System.out.println("Modelo :" + Modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("HOLA MUNDO");

    }

}

interface Muestradatos {
    //SOLO ACEPTAN METODOS PUBLICOS 
    //SOLO ACEPTA DECLARACIONES DE METODOS ==> SOLO ACEPTA METODOS ABSTRACTOS
    public void imprimirdatos();
}

interface Mensaje {

    public void mostrarMensaje();

}
