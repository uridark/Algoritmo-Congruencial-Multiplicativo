/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//Campos Avila Angel Uriel
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author bokuzera
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.getContentPane().setBackground(Color.GRAY);
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
        xo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        k = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        g = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resul = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color1"));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        xo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoActionPerformed(evt);
            }
        });
        getContentPane().add(xo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 92, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Xo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, -1));
        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 90, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("k:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("g:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 30, 30));
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 90, 30));

        resul.setColumns(20);
        resul.setRows(5);
        jScrollPane1.setViewportView(resul);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 380, 240));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Numeros generados");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 250, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("que los numeros generados se repitan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 240, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("La generacion de numeros se detendra");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 240, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("Xo tiene que se impar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 130, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("de acuerdo a la formula m/4 para evitar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 240, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("m se determina por 2^g");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 240, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_xoActionPerformed

    public boolean esImpar(int iNumero) {
     if (iNumero%2!=0)
     return true;
     else
     return false;
     }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Campos Avila Angel Uriel
        Interfaz pp = new Interfaz();
         String a,b,c,d;
        int semilla,valorm,valork,valorg,N, alfa;
        float r;
        a = xo.getText();
        semilla = Integer.parseInt(a); 
        c = k.getText();
        valork = Integer.parseInt(c);
        d = g.getText();
        valorg = Integer.parseInt(d);
        if(pp.esImpar(semilla)){
        valorm =  (int)Math.pow(2, valorg);;
        N =(valorm/4);
        alfa = (5+(8*(valork)));
        
       Contenedor yih = new Contenedor ();
      productor produce = new productor (yih, N, alfa, semilla,valorm, resul);
      consumidor consume = new consumidor (yih, N);
      produce.start();
      consume.start();
        }else{
            JOptionPane.showMessageDialog(null, "La semilla dada no es impar", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField g;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField k;
    private javax.swing.JTextArea resul;
    private javax.swing.JTextField xo;
    // End of variables declaration//GEN-END:variables
}
