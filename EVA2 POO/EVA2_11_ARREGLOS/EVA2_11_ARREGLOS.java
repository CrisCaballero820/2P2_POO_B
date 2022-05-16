package EVA2_11_ARREGLOS;


public class EVA2_11_ARREGLOS {
    public static void main(String[] args){
        
        int[] arreglo = new int[10];
        arreglo[0] = 100;
        System.out.println("El valor en 0 es " + arreglo[0]);
        
        String[] arreCade = new String[10];
        arreCade[5] = "Hola Mundo";
        double[] arreDouble = new double [10000000];
        arreDouble[999999] = 0.2;
        Persona[] clasePOO = new Persona[32];        
    }
    
}
class Persona{
    private String nombre;

    public Persona() {
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