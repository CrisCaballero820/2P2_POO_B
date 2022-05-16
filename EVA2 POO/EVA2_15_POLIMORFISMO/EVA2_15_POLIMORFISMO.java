package EVA2_15_POLIMORFISMO;

public class EVA2_15_POLIMORFISMO {
        
    public static void main(String[] args) { 
        Persona persona = new Persona("Cristian",20);
        Estudiante estudiante = new Estudiante("");
        Docente docente = new Docente("036","pedro","50");
                
        Persona persona estudiante = estudiante;
    }
    public class Persona{
        private String Nombre;
        private int Edad;

        public String getNombre() {
            return Nombre;
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
        
    }
    
    public class Estudiante  extends Persona{
        private String numeroControl;
        
        public Estudiante(){
            
        }

        public String getNumeroControl() {
            return numeroControl;
        }

        public void setNumeroControl(String numeroControl) {
            this.numeroControl = numeroControl;
        }
    
}
    public class Docente extends Persona{
        private String numeroRegistro;
            
        public Docente (){
        }
        
    }
    
  }