package poo_proyect.pacienteBL;


public class PacientesBL {
     
    int ID;
    String Nombres;
    String Edad;
    String Telefono;

    public PacientesBL() {
    }

    public PacientesBL(int ID, String Nombres, String Edad, String Telefono) {
        this.ID = ID;
        this.Nombres = Nombres;
        this.Edad = Edad;
        this.Telefono = Telefono;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }


    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
