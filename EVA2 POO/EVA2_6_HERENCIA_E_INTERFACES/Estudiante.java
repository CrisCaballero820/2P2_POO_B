package EVA2_6_HERENCIA_E_interfaces;

public class Estudiante extends Persona implements mostrardatos {
    private String numeroControl;

    public Estudiante() {
        super();//CONSTRUCTOR DEFAULT DE PERSONA
        this.numeroControl = numeroControl;
    }

    public Estudiante(String numeroControl, String Nombre, String Edad) {
        super(Nombre, Edad);//CONSTRUCTOR DE PERSONA SUPER CLASE
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    /**
     *
     */
    public void imprimirdatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("numeroControl: " + getNumeroControl());
    }

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

