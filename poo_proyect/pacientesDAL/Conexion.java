package poo_proyect.pacientesDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    String strConexionBD = "jdbc:sqlite:C:/PROG/JAVA/POO_PROYECT/BD/BDPROY.s3db";
    Connection conn = null;

    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionBD);

            System.out.println("Conexion Establecida");

        } catch (Exception e) {

            System.out.println("Error de Conexion" + e);

        }

    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL) {

        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public ResultSet consultarRegistros(String strSentenciaSQL) {

        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
