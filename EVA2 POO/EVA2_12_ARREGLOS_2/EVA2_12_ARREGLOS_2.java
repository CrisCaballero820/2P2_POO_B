package EVA2_12_ARREGLOS_2;

import java.util.Scanner;

public class EVA2_12_ARREGLOS_2 {
    public static void main(String[] args){
        int[] arreglosEdad = new int[32]; //4 bytes = 1 entero
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 32; i++){
            System.out.println("Cual es tu edad ");
            arreglosEdad[i] = input.nextInt();
            
        
        }
        for (int i = 0; i < 32; i++){
            System.out.print("[" + arreglosEdad[i]+ "]");
        
        }
    }
    
}
