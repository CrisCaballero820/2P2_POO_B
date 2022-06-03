package EVA3_11_THROW;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_11_THROW {

    public static void main(String[] args) {
        try {
            throw new Exception("EXCEPCION");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
