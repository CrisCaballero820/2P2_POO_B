/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_herencia;

/**
 *
 * @author rodry
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //persona perso1 = new persona();
        //perso1.
        Estudiante estu1 = new Estudiante("yahir", 19, "21550315");
        //estu1.setNombre("yahir");
        //estu1.setEdad(19);
        //estu1.setnumeroControl("21550315");
        //estu1.mostrarNombre();
        estu1.imprimirDatos();
        
        Maestro mtro1 = new Maestro();
        mtro1.imprimirDatos();
    }
}
//SUBCLASE MAESTRO
class Maestro extends persona{
    //No_de_registro ENTERO
    private int numeroRegistro;
    
    public Maestro(){
        super();
        System.out.println("CLASE MAESTRO");
    }
    public Maestro(int numeroRegistro, String Nombre, int Edad){
        super(Nombre, Edad);
        this.numeroRegistro = numeroRegistro;
    }
    public int getnumeroRegistro(){
        return numeroRegistro;
    }
    public void setnumeroRegistro(int numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }   
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de registro: " + numeroRegistro);
    }
}
//SUBCLASE (HIJO)
class Estudiante extends persona {
    private String numeroControl;
    
    //CONSTRUCTOR DEFAULT
    public Estudiante(){
        super();//LLAMADA AL CONSTRUCTOR
        System.out.println("CLASE ESTUDIANTE");   
    }   
    public Estudiante(String Nombre, int Edad, String numeroControl){
        super(Nombre, Edad);//LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE
        this.numeroControl = numeroControl;     
    }
    public String getnumeroControl() {
        return numeroControl;
    }
    public void setnumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    /*public void mostrarNombre(){
        System.out.println("Nombre del estudiante: " + getNombre());
    }*/
    //BUSCAR QUE ES OVERRIDE
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//ESTOY LLAMANDO AL METODO IMPRIMIRDATOS DE PERSONA (SUPER CLASE)
        System.out.println("No de control: " + numeroControl);
        
    }
}
class persona {//SUPERCLASE (PADRE)

    private String Nombre;
    private int Edad;

    public persona() {
        this.Nombre = "xxxxxx";
        this.Edad = 10000;
        System.out.println("CLASE PERSONA");

    }

     public String getNombre() {
        return Nombre;
    }

    public persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }

}
