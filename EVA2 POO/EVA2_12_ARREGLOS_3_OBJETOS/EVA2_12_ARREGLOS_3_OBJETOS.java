package EVA2_12_ARREGLOS_3_OBJETOS;

import java.util.Scanner;

public class EVA2_12_ARREGLOS_3_OBJETOS {
    public static void main(String[] args){
        Persona[] arregloP = new Persona[32];
        Scanner input = new Scanner(System.in);
        
        for (int i =0; i < 32; i++){
           arregloP[i] = new Persona();
           System.out.println("Cual es tu nombre");
           arregloP[i].setNombre(input.nextLine());
        }
        for (int i=0; i < 10; i++){
            System.out.println("Nombre: " + arregloP[i].getNombre());
            
        
        }
    }
    
}
class Persona{
    private String nombre;
    
    public Persona(){
    
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}