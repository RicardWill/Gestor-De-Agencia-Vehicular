/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.aControladorPrincipal;
import Controlador.bControladorClientes;
import Controlador.cControladorOperador;
import Modelo.bbEmpleado;
import Modelo.bbbExcepcionRango;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class xModificarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form xModificarEmpleado
     */
    public xModificarEmpleado() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnBuscarEmpleado = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtIdentificador = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        comboGenero = new javax.swing.JComboBox<>();
        comboTipoEmpleado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INGRESE EL IDENTIFICADOR DEL EMPLEADO A MODIFICAR:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel17.setText("IDENTIFICADOR DE EMPLEADO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 320, 20));

        btnBuscarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setText("BUSCAR EMPLEADO");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 340, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel12.setText("EDAD:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 320, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel11.setText("APELLIDO(S):");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 320, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel13.setText("NOMBRE(S):");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 320, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel14.setText("CORREO ELECTRÓNICO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 320, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel15.setText("GÉNERO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 320, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel16.setText("TELÉFONO:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 320, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setText("TIPO DE EMPLEADO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 320, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Imagenes/ModificacionEmpleado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 90, 140));

        jPanel2.setBackground(new java.awt.Color(255, 164, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 900, 70));

        jPanel4.setBackground(new java.awt.Color(91, 43, 130));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 900, 70));

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

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        txtIdentificador.setBackground(new java.awt.Color(204, 204, 255));
        txtIdentificador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdentificador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentificador.setBorder(null);
        jPanel1.add(txtIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 320, 40));

        txtNombres.setBackground(new java.awt.Color(204, 204, 255));
        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setBorder(null);
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 320, 40));

        txtApellidos.setBackground(new java.awt.Color(204, 204, 255));
        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setBorder(null);
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 320, 40));

        txtEdad.setBackground(new java.awt.Color(204, 204, 255));
        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(null);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 320, 40));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 255));
        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 320, 40));

        txtCorreoElectronico.setBackground(new java.awt.Color(204, 204, 255));
        txtCorreoElectronico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreoElectronico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreoElectronico.setBorder(null);
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 320, 40));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 160, 40));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 160, 40));

        jPanel1.add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, 40));

        jPanel1.add(comboTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 320, 40));

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            txtIdentificador.setText("");
            txtIdentificador.setEditable(true);
            txtNombres.setText("");
            txtApellidos.setText("");
            comboGenero.removeAllItems();
            txtEdad.setText("");
            txtTelefono.setText("");
            txtCorreoElectronico.setText("");
            comboTipoEmpleado.removeAllItems();
            ControlPrincipal.mostrarVentanaOperador();   
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        bbEmpleado buscaEmpleado = ControlOperador.buscaEmpleado(txtIdentificador.getText());
        if(buscaEmpleado == null){
            txtNombres.setText("");
            txtApellidos.setText("");
            comboGenero.removeAllItems();
            txtEdad.setText("");
            txtTelefono.setText("");
            txtCorreoElectronico.setText("");
            comboTipoEmpleado.removeAllItems();
        }else{
            txtIdentificador.setEditable(false);
            txtNombres.setText(buscaEmpleado.getNombre());
            txtApellidos.setText(buscaEmpleado.getApellido());
            if("Masculino".equals(buscaEmpleado.getGenero())){
                comboGenero.addItem("Masculino");
                comboGenero.addItem("Femenino");
            }
            if("Femenino".equals(buscaEmpleado.getGenero())){
                comboGenero.addItem("Femenino");
                comboGenero.addItem("Masculino");
            }
            txtEdad.setText(String.valueOf(buscaEmpleado.getEdad()));
            txtTelefono.setText(String.valueOf(buscaEmpleado.getTelefono()));
            txtCorreoElectronico.setText(buscaEmpleado.getCorreoElectronico());
            if("Vendedor".equals(buscaEmpleado.getTipoEmpleado())){
                comboTipoEmpleado.addItem("Vendedor");
                comboTipoEmpleado.addItem("Tecnico");
            }
            if("Tecnico".equals(buscaEmpleado.getTipoEmpleado())){
                comboTipoEmpleado.addItem("Tecnico");
                comboTipoEmpleado.addItem("Vendedor");
            }
            
        }
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            ControlOperador.modificaEmpleado(txtIdentificador.getText(), txtNombres.getText(), txtApellidos.getText(),comboGenero.getSelectedItem().toString(),txtEdad.getText(),txtTelefono.getText(),txtCorreoElectronico.getText(), comboTipoEmpleado.getSelectedItem().toString());
            txtIdentificador.setText("");
            txtIdentificador.setEditable(true);
            txtNombres.setText("");
            txtApellidos.setText("");
            comboGenero.removeAllItems();
            txtEdad.setText("");
            txtTelefono.setText("");
            txtCorreoElectronico.setText("");
            comboTipoEmpleado.removeAllItems();
            ControlPrincipal.mostrarVentanaOperador();
        } catch (bbbExcepcionRango ex) {
            JOptionPane.showMessageDialog(null, "Se produjo el error: "+ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se produjo el error: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(xModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xModificarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
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
