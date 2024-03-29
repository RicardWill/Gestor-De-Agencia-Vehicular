/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.aControladorPrincipal;
import Controlador.bControladorClientes;
import Controlador.cControladorOperador;

/**
 *
 * @author William
 */
public class _DashboardCliente extends javax.swing.JFrame {

    /**
     * Creates new form _DashboardCliente
     */
    public _DashboardCliente() {
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
        btnRegistrarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnComprarCoche = new javax.swing.JButton();
        btnSolicitarServicio = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("REGISTRARME COMO CLIENTE");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 540, 40));

        btnModificarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente.setText("MODIFICAR MIS DATOS DE CLIENTE");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 540, 40));

        btnComprarCoche.setBackground(new java.awt.Color(0, 0, 0));
        btnComprarCoche.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnComprarCoche.setForeground(new java.awt.Color(255, 255, 255));
        btnComprarCoche.setText("REVISAR EL CATÁLOGO DE AUTOS");
        btnComprarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarCocheActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprarCoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 540, 40));

        btnSolicitarServicio.setBackground(new java.awt.Color(0, 0, 0));
        btnSolicitarServicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSolicitarServicio.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarServicio.setText("SOLICITAR SERVICIO EN EL TALLER");
        btnSolicitarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarServicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 540, 40));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("ATRAS");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Imagenes/Coche1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 510, 230));

        jPanel2.setBackground(new java.awt.Color(255, 164, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 200));

        jPanel3.setBackground(new java.awt.Color(91, 43, 130));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 70, 200));

        jPanel4.setBackground(new java.awt.Color(247, 50, 63));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 70, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Imagenes/MarcasCoches.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 870, 200));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel4.setText("PARA SOLICITAR UN SERVICIO EN NUESTRO TALLER USTED DEBE TENER REGISTRO DE QUE COMPRO UN COCHE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 550, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("UP-MOR CARS LE ATIENDE, BIENVENIDO SEA A NUESTRO CONCESIONARIO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 700, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel6.setText("RECUERDE QUE PARA ADQUIRIR UN AUTO USTED NECESITA ESTAR REGISTRADO COMO CLIENTE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 470, 20));

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

    private void btnSolicitarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarServicioActionPerformed
        ControlPrincipal.mostrarVentanaSolicitarServicio();
    }//GEN-LAST:event_btnSolicitarServicioActionPerformed

    private void btnComprarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarCocheActionPerformed
        ControlPrincipal.mostrarVentanaComprarCoche();
    }//GEN-LAST:event_btnComprarCocheActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ControlPrincipal.mostrarVentanaPrincipal();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        ControlPrincipal.mostrarVentanaRegistrarCliente();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        ControlPrincipal.mostrarVentanaModificarCliente();
    }//GEN-LAST:event_btnModificarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(_DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_DashboardCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _DashboardCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarCoche;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSolicitarServicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
