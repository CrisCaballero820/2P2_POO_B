package poo_proyect.pacientesGUI;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import poo_proyect.pacienteBL.PacientesBL;
import poo_proyect.pacientesDAL.Conexion;

public class PacientesFRM extends javax.swing.JFrame {

    DefaultTableModel model;

    public PacientesFRM() {
        initComponents();

        String[] titulos = {"ID", "Nombres", "Edad", "Telefono"};

        model = new DefaultTableModel(null, titulos);
        Tabla.setModel(model);

        this.mostrarDatos();
        this.limpiarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        TextID = new javax.swing.JTextField();
        LabelID = new javax.swing.JLabel();
        TextNombres = new javax.swing.JTextField();
        TextEdad = new javax.swing.JTextField();
        TextTelefono = new javax.swing.JTextField();
        LabelNom = new javax.swing.JLabel();
        LabelEdad = new javax.swing.JLabel();
        LabelTel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(new java.awt.Color(255, 112, 21));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agregar.setBackground(new java.awt.Color(51, 119, 171));
        Agregar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/salvar.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 479, 117, 38));

        Editar.setBackground(new java.awt.Color(51, 126, 184));
        Editar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/editar.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 479, 110, 38));

        Borrar.setBackground(new java.awt.Color(51, 119, 171));
        Borrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/boton-eliminar.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 479, 110, 38));

        Cancelar.setBackground(new java.awt.Color(51, 119, 171));
        Cancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/archivo.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 479, 119, 38));

        TextID.setForeground(new java.awt.Color(51, 144, 190));
        TextID.setBorder(null);
        TextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIDActionPerformed(evt);
            }
        });
        getContentPane().add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 254, 45, -1));

        LabelID.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        LabelID.setText("ID");
        getContentPane().add(LabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 251, 73, -1));
        getContentPane().add(TextNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 292, 352, -1));

        TextEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEdadActionPerformed(evt);
            }
        });
        getContentPane().add(TextEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 330, 352, -1));
        getContentPane().add(TextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 368, 352, -1));

        LabelNom.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        LabelNom.setText("Nombres");
        getContentPane().add(LabelNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 292, 73, -1));

        LabelEdad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        LabelEdad.setText("Edad");
        getContentPane().add(LabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 330, 73, -1));

        LabelTel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        LabelTel.setText("Telefono");
        getContentPane().add(LabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 368, 73, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 651, 560));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 276, 45, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/TecNM_logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 280, 120));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 660));

        Cancelar1.setBackground(new java.awt.Color(51, 119, 171));
        Cancelar1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_proyect/Recursos/archivo.png"))); // NOI18N
        Cancelar1.setText("Cancelar");
        Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 479, 119, 38));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDActionPerformed

    }//GEN-LAST:event_TextIDActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Conexion objcon = new Conexion();

        PacientesBL pac = recuperarDatos();

        String strSentenciaInsert = String.format("INSERT INTO Pacientes (ID, Nombres, Edad, Telefono)"
                + "VALUES (null, '%s', '%s', '%s') ", pac.getNombres(), pac.getEdad(), pac.getTelefono());

        objcon.ejecutarSentenciaSQL(strSentenciaInsert);

        this.mostrarDatos();
        try {
            this.crearArchivo();
        } catch (IOException ex) {
            Logger.getLogger(PacientesFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limpiarDatos();


    }//GEN-LAST:event_AgregarActionPerformed
    public void mostrarDatos() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        Conexion objcon = new Conexion();

        try {
            ResultSet resultado = objcon.consultarRegistros("SELECT * FROM Pacientes");

            while (resultado.next()) {

                System.out.println(resultado.getString("ID"));
                System.out.println(resultado.getString("Nombres"));
                System.out.println(resultado.getString("Edad"));
                System.out.println(resultado.getString("Telefono"));

                Object[] usuario = {resultado.getString("ID"), resultado.getString("Nombres"), resultado.getString("Edad"), resultado.getString("Telefono")};

                model.addRow(usuario);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public PacientesBL recuperarDatos() {
        PacientesBL pac = new PacientesBL();

        int ID = (TextID.getText().isEmpty()) ? 0 : Integer.parseInt(TextID.getText());
        pac.setID(ID);
        pac.setNombres(TextNombres.getText());
        pac.setEdad(TextEdad.getText());
        pac.setTelefono(TextTelefono.getText());

        return pac;

    }

    public void limpiarDatos() {
        TextID.setText("");
        TextNombres.setText("");
        TextEdad.setText("");
        TextTelefono.setText("");

        Agregar.setEnabled(true);
        Editar.setEnabled(false);
        Borrar.setEnabled(false);
    }

    public void crearArchivo() throws IOException {
        FileWriter fichero = new FileWriter("C:/PROG/JAVA/POO_PROYECT/src/poo_proyect/Registro.txt");
        fichero.write("Registro\n");
        fichero.write("ID: " + TextID.getText() + "\n");
        fichero.write("Nombres: " + TextNombres.getText() + "\n");
        fichero.write("Edad: " + TextEdad.getText() + "\n");
        fichero.write("Telefono: " + TextTelefono.getText() + "\n");
        fichero.close();
    }
    private void TextEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEdadActionPerformed

    }//GEN-LAST:event_TextEdadActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed

        Conexion objcon = new Conexion();

        PacientesBL pac = recuperarDatos();

        String strSentenciaInsert = String.format("DELETE FROM Pacientes WHERE ID ==%d", pac.getID());

        objcon.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
        this.limpiarDatos();
    }//GEN-LAST:event_BorrarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        Conexion objcon = new Conexion();

        PacientesBL pac = recuperarDatos();

        String strSentenciaInsert = String.format("UPDATE Pacientes SET Nombres = '%s', "
                + "Edad = '%s', " + "Telefono = '%s' WHERE ID = '%d'", pac.getNombres(), pac.getEdad(), pac.getTelefono(), pac.getID());

        objcon.ejecutarSentenciaSQL(strSentenciaInsert);

        this.mostrarDatos();
        this.limpiarDatos();
    }//GEN-LAST:event_EditarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        if (evt.getClickCount() == 1) {

            JTable receptor = (JTable) evt.getSource();

            TextID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            TextNombres.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            TextEdad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            TextTelefono.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
        }
        Agregar.setEnabled(false);
        Editar.setEnabled(true);
        Borrar.setEnabled(true);
    }//GEN-LAST:event_TablaMouseClicked

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.limpiarDatos();
    }//GEN-LAST:event_CancelarActionPerformed

    private void Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cancelar1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacientesFRM().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel LabelEdad;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNom;
    private javax.swing.JLabel LabelTel;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextEdad;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextNombres;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
