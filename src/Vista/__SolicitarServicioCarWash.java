/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.aControladorPrincipal;
import Controlador.bControladorClientes;
import Controlador.cControladorOperador;
import Modelo.aaCliente;
import Modelo.bbEmpleado;
import Modelo.ccCoche;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author William
 */
public class __SolicitarServicioCarWash extends javax.swing.JFrame {

    
        
    /**
     * Creates new form __SolicitarServicioCarWash
     */
    public __SolicitarServicioCarWash() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCostoServicio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnFacturar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtIdentificador = new javax.swing.JTextField();
        comboMisCoches = new javax.swing.JComboBox<>();
        comboTecnicos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(91, 43, 130));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jPanel3.setBackground(new java.awt.Color(255, 164, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel7.setText("SELECCIONE EL TÉCNICO QUE LE REALIZO EL SERVICIO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 300, 20));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("CANCELAR SERVICIO");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 330, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel8.setText("INGRESE SU IDENTIFICADOR DE CLIENTE PARA PROCESAR SU LISTA DE AUTOS:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 460, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel9.setText("SELECCIONE SU AUTO EL CUAL DESEA EL SERVICIO DE AUTOLAVADO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 460, 20));

        lblCostoServicio.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jPanel1.add(lblCostoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 320, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("$");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 20, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/__Imagenes/Autolavado.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 550, 320));

        jPanel8.setBackground(new java.awt.Color(247, 50, 63));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 920, 60));

        btnFacturar.setBackground(new java.awt.Color(0, 0, 0));
        btnFacturar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnFacturar.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturar.setText("AGREGAR SERVICIO A MI FACTURA");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 330, -1));

        jPanel4.setBackground(new java.awt.Color(91, 43, 130));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jPanel5.setBackground(new java.awt.Color(255, 164, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, -1));

        txtIdentificador.setBackground(new java.awt.Color(204, 204, 255));
        txtIdentificador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdentificador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentificador.setBorder(null);
        jPanel1.add(txtIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 320, 30));

        comboMisCoches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMisCochesActionPerformed(evt);
            }
        });
        jPanel1.add(comboMisCoches, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 320, 40));

        comboTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTecnicosActionPerformed(evt);
            }
        });
        jPanel1.add(comboTecnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 320, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTecnicosActionPerformed
        
        
        //jComboBox1.set(items);
    }//GEN-LAST:event_comboTecnicosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        aaCliente buscaCliente = ControlClientes.buscaCliente(txtIdentificador.getText());
        ArrayList<ccCoche> CargarMisCoches = ControlClientes.CargarMisCoches();
        
        if(buscaCliente == null){
            JOptionPane.showMessageDialog(null, "El ID de cliente no esta asociado a ninguno");
            txtIdentificador.setText("");
        }else{
            if(CargarMisCoches != null){
                comboMisCoches.addItem("Seleccione su vehiculo");
                        
                for (int i=0; i<CargarMisCoches.size(); i++){
                    if(txtIdentificador.getText().equals(CargarMisCoches.get(i).getIdentificadorCliente())){
                        comboMisCoches.addItem(CargarMisCoches.get(i).getModeloCoche());
                    }
                }
                int countComponents = comboMisCoches.getItemCount();
                txtIdentificador.setEditable(false);
                //System.out.println(countComponents);
                if(countComponents == 1){
                    txtIdentificador.setEditable(true);
                    JOptionPane.showMessageDialog(null, "Usted aún no ha comprado ningún vehículo");
                }
                lblCostoServicio.setText("El costo del servicio es de $150");
            }
        }  
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        lblCostoServicio.setText("");
        txtIdentificador.setText("");
        txtIdentificador.setEditable(true);
        comboMisCoches.removeAllItems();
        comboTecnicos.removeAllItems();
        ControlPrincipal.mostrarVentanaSolicitarServicio();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void comboMisCochesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMisCochesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMisCochesActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        if((comboMisCoches.getSelectedItem().toString() != "Seleccione su vehiculo") && (comboMisCoches.getSelectedItem().toString() != "")){  
            if(comboTecnicos.getSelectedItem().toString() != "Seleccione el tecnico"){
                
                ControlOperador.registraNuevoServicio(txtIdentificador.getText(), comboMisCoches.getSelectedItem().toString(), comboTecnicos.getSelectedItem().toString(), "Car Wash", 150);
                
                JOptionPane.showMessageDialog(null, "Se agrego el servicio a su factura, recuerde pasar a pagar en FACTURACION");
                lblCostoServicio.setText("");
                txtIdentificador.setText("");
                txtIdentificador.setEditable(true);
                comboMisCoches.removeAllItems();
                comboTecnicos.removeAllItems();
                ControlPrincipal.mostrarVentanaSolicitarServicio();
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione quien le vendio el coche");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione su coche a realizar el servicio");
        }
    }//GEN-LAST:event_btnFacturarActionPerformed

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
            java.util.logging.Logger.getLogger(__SolicitarServicioCarWash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(__SolicitarServicioCarWash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(__SolicitarServicioCarWash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(__SolicitarServicioCarWash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new __SolicitarServicioCarWash().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboMisCoches;
    private javax.swing.JComboBox<String> comboTecnicos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblCostoServicio;
    private javax.swing.JTextField txtIdentificador;
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

    public void agregarTecnicos1() {
        try{
            comboTecnicos.addItem("Seleccione el tecnico");
            ArrayList<bbEmpleado> valor = ControlOperador.cargarListaTecnicos();
            if(valor == null){
            JOptionPane.showMessageDialog(null, "Ningun vendedor disponible");
            
            }else{
                for (int i=0; i<valor.size(); i++){
                    if("Tecnico".equals(valor.get(i).getTipoEmpleado())){
                    comboTecnicos.addItem(valor.get(i).getNombre().concat(" ").concat(valor.get(i).getApellido()));
                    }  
                }
            }   
            
        }catch(Exception ex){
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}