/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author GIOVANNI
 */
public class VistaListaDoble extends javax.swing.JFrame {
    public int opcion=0;
    /**
     * Creates new form VistaListaDoble
     */
    public VistaListaDoble() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(this.getIconImage());
        this.txtA_monitorprin.setEditable(false);
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/insignia.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbl_insignia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_monitorprin = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btn_ingresarInicio = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        btn_mostrardesdeInicio = new javax.swing.JButton();
        btn_verTabla = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 80, -1));

        lbl_insignia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/insignia.png"))); // NOI18N
        lbl_insignia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(lbl_insignia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 210, 230));

        txtA_monitorprin.setBackground(new java.awt.Color(204, 255, 255));
        txtA_monitorprin.setColumns(20);
        txtA_monitorprin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtA_monitorprin.setRows(5);
        txtA_monitorprin.setText("                                                ***Rellenar los campos por favor*** ");
        txtA_monitorprin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtA_monitorprin);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 530, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UNAS.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        btn_ingresarInicio.setBackground(new java.awt.Color(102, 102, 255));
        btn_ingresarInicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_ingresarInicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresarInicio.setText("ingresar por el inicio ");
        btn_ingresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 20));

        txt_id.setBackground(new java.awt.Color(204, 204, 255));
        txt_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));

        btn_mostrardesdeInicio.setBackground(new java.awt.Color(102, 102, 255));
        btn_mostrardesdeInicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_mostrardesdeInicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrardesdeInicio.setText("mostrar desde inicio");
        btn_mostrardesdeInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrardesdeInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrardesdeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, -1));

        btn_verTabla.setBackground(new java.awt.Color(102, 102, 255));
        btn_verTabla.setForeground(new java.awt.Color(204, 255, 255));
        btn_verTabla.setText("VER TABLA  DE DATOS");
        btn_verTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verTablaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_verTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 150, 40));

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 30, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        lbl_fondo.setText("ddd");
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ingresarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarInicioActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarInicioActionPerformed

    private void btn_mostrardesdeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrardesdeInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_mostrardesdeInicioActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_verTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verTablaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaListaDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaListaDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaListaDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaListaDoble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaListaDoble().setVisible(true);
            }
        });
    }

  
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ingresarInicio;
    public javax.swing.JButton btn_mostrardesdeInicio;
    public javax.swing.JButton btn_verTabla;
    public javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl_fondo;
    public javax.swing.JLabel lbl_insignia;
    public javax.swing.JTextArea txtA_monitorprin;
    public javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
