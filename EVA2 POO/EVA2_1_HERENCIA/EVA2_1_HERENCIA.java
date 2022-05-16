package EVA2_1_HERENCIA;

public class EVA2_1_HERENCIA {
    
    public static void main(String[] args){
        
        Estudiante est1 = new Estudiante();
        est1.setNombre("Juan");
        est1.setEdad(22);
        est1.setNoControl("00112233");
        est1.imprimirDatos();
        
        Maestro mtro1 = new Maestro();
        mtro1.setNombre("Jose");
        mtro1.setEdad(23);
        mtro1.setNoRegistro("00112244");
        mtro1.imprimirDatos();
    
    }
    
}
class Maestro extends Persona {
    private String NoRegistro;
    
    public Maestro(){
    super();
        System.out.println("Clase maestro");
    }

    public Maestro(String NoRegistro) {
        this.NoRegistro = NoRegistro;
    }

    public String getNoRegistro() {
        return NoRegistro;
    }

    public void setNoRegistro(String NoRegistro) {
        this.NoRegistro = NoRegistro;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de Registro: " + NoRegistro);
        
    }

}

class Estudiante extends Persona {
    private String NoControl;
    
    public Estudiante(){
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
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de Control: " + NoControl);
        
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
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    
    }
    
}