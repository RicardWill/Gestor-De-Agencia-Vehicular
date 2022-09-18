/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.aControladorPrincipal;
import Controlador.bControladorClientes;
import Controlador.cControladorOperador;
import Modelo.bbbExcepcionRango;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class xContratarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form xContratarEmpleado
     */
    public xContratarEmpleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnContratarEmpleado = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtIdentificador = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        comboTipoEmpleado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Imagenes/ContratoPersonal.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 164, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 900, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GRACIAS POR FORMAR PARTE DE NUESTRO EQUIPO, COMPLETE LOS DATOS:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setText("TIPO DE EMPLEADO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 320, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel11.setText("NOMBRE(S):");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 320, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel12.setText("APELLIDO(S):");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 320, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel13.setText("GENERO:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 320, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel14.setText("EDAD:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 320, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel15.setText("TELEFONO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 320, 20));

        jPanel5.setBackground(new java.awt.Color(247, 50, 63));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 630));

        jPanel4.setBackground(new java.awt.Color(91, 43, 130));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 900, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel16.setText("CORREO ELECTRONICO:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 320, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel17.setText("IDENTIFICADOR DE EMPLEADO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 320, 20));

        btnContratarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnContratarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnContratarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnContratarEmpleado.setText("CONTRATAR");
        btnContratarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnContratarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 160, 40));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 160, 40));

        txtIdentificador.setBackground(new java.awt.Color(204, 204, 255));
        txtIdentificador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdentificador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentificador.setBorder(null);
        jPanel1.add(txtIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 320, 40));

        txtNombres.setBackground(new java.awt.Color(204, 204, 255));
        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setBorder(null);
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, 40));

        txtApellidos.setBackground(new java.awt.Color(204, 204, 255));
        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setBorder(null);
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, 40));

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su genero", "Masculino", "Femenino" }));
        jPanel1.add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 320, 40));

        txtEdad.setBackground(new java.awt.Color(204, 204, 255));
        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(null);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 320, 40));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 255));
        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 320, 40));

        txtCorreoElectronico.setBackground(new java.awt.Color(204, 204, 255));
        txtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreoElectronico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreoElectronico.setBorder(null);
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 320, 40));

        comboTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Tecnico" }));
        comboTipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(comboTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 320, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        txtIdentificador.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtCorreoElectronico.setText("");
        ControlPrincipal.mostrarVentanaOperador();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnContratarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarEmpleadoActionPerformed
        
        if(comboGenero.getSelectedItem().toString() != "Seleccione su genero"){
          
            try {
                ControlOperador.registraEmpleadoNuevo(txtIdentificador.getText(), txtNombres.getText(), txtApellidos.getText(),comboGenero.getSelectedItem().toString(), txtEdad.getText(), txtTelefono.getText(), txtCorreoElectronico.getText(), comboTipoEmpleado.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "Se han registrado correctamente los datos!");
                txtIdentificador.setText("");
                txtNombres.setText("");
                txtApellidos.setText("");
                txtEdad.setText("");
                txtTelefono.setText("");
                txtCorreoElectronico.setText("");
                ControlPrincipal.mostrarVentanaOperador();
            } catch (bbbExcepcionRango ex) {
                 JOptionPane.showMessageDialog(null, "Se produjo el error: "+ex.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Se produjo el error: "+ex.getMessage());
            }
                
            
        }else{
            JOptionPane.showMessageDialog(null, "Alguno de los campos están incompletos");
        }
    }//GEN-LAST:event_btnContratarEmpleadoActionPerformed

    private void comboTipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(xContratarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xContratarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xContratarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xContratarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xContratarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContratarEmpleado;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JComboBox<String> comboTipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    private aControladorPrincipal ControlPrincipal;
    private bControladorClientes ControlClientes;
    private cControladorOperador ControlOperador;
      
    
    public void setObjetoControladorPrincipal(aControladorPrincipal ControlPrincipal) {
        this.ControlPrincipal = ControlPrincipal;
    }

    public void setObjetoControladorClientes(bControladorClientes ControlClientes) {
        this.ControlClientes = ControlClientes;
    }

    public void setObjetoControladorOperador(cControladorOperador ControlOperador) {
        this.ControlOperador = ControlOperador;
    }
}
