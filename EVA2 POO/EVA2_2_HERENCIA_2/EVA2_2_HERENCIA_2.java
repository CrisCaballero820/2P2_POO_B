package EVA2_2_HERENCIA_2;

public class EVA2_2_HERENCIA_2 {

    public static void main(String[] args) {
        Direccion dir = new Direccion("Sta", 100, "x", "0011", "chihuahua", "0011223344");
        Estudiante est1 = new Estudiante("9992121", "Ruben", 40, dir);
        est1.imprimirDatos();
    }

}

class Direccion {

    private String calle;
    private int numero;
    private String colonia;
    private String CP;
    private String ciudad;
    private String telefono;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.CP = "";
        this.ciudad = "";
        this.telefono = "";
    }

    public Direccion(String calle, int numero, String colonia, String CP, String cuidad, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.CP = CP;
        this.ciudad = cuidad;
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCuidad() {
        return ciudad;
    }

    public void setCuidad(String cuidad) {
        this.ciudad = cuidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void imprimirDireccion() {
        System.out.println("Calle: " + calle + " #" + numero + " , col." + colonia + " CP: " + CP + " en " + ciudad);

    }
}
// IS A "ES UNA"
class Estudiante extends Persona {

    private String NoControl;
    private Direccion direccion; // HAS A "TIENE UNA"

    public Estudiante() {
        super();
        this.NoControl = "";
        direccion = new Direccion();
    }

    public Estudiante(String NoControl, String nombre, int edad, Direccion direccion) {
        super(nombre, edad);
        this.NoControl = NoControl;
        this.direccion = direccion;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("No de Control: " + NoControl);
        direccion.imprimirDireccion();

    }
}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}
