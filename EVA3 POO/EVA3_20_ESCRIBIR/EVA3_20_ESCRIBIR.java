package EVA3_20_ESCRIBIR;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EVA3_20_ESCRIBIR {

    public static void main(String[] args) {
        Path ruta = Paths.get("c:/Archivo/archivo2.txt"); 
        OutputStream abrirArchivo;
        OutputStreamWriter escribirArchivo;
        BufferedWriter excribirtexto;
        try {
            abrirArchivo = Files.newOutputStream(ruta);
            escribirArchivo = new OutputStreamWriter(abrirArchivo);

            excribirtexto = new BufferedWriter(escribirArchivo);
            excribirtexto.write("Hola mundo");
            excribirtexto.flush();
            excribirtexto.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
