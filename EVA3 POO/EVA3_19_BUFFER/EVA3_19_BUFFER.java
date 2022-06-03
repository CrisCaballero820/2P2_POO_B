package EVA3_19_BUFFER;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class EVA3_19_BUFFER {

    public static void main(String[] args) {

        Path ruta = Paths.get("c:/Archivo/archivo.txt", args);
        InputStream abrirArchivo;
        InputStreamReader leerArchivo;
        BufferedReader convertirTexto;

        try {
            abrirArchivo = Files.newInputStream(ruta);
            leerArchivo = new InputStreamReader(abrirArchivo);
            convertirTexto = new BufferedReader(leerArchivo);
            String linea = convertirTexto.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = convertirTexto.readLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
