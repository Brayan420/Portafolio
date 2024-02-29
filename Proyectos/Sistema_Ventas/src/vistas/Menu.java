
package vistas;

import java.awt.Dimension;
import javax.swing.JDesktopPane;


public class Menu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;
    public Menu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Ventas");
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho,(alto - 110));
        this.add(jDesktopPane_menu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuIProductos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuNuevaCategoria = new javax.swing.JMenuItem();
        Menu_CerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuNuevaFactura = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1200, 50));

        jMenu1.setText("Archivos");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        MenuIProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuIProductos.setText("Productos");
        MenuIProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIProductosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuIProductos);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setText("Proveedor");
        jMenu1.add(jMenuItem2);

        MenuNuevaCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuNuevaCategoria.setText("Categoria");
        MenuNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuNuevaCategoria);

        Menu_CerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Menu_CerrarSesion.setText("Cerrar Sesion");
        Menu_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_CerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_CerrarSesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimientos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu2.setMinimumSize(new java.awt.Dimension(150, 50));
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        MenuNuevaFactura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuNuevaFactura.setText("Nueva Factura");
        MenuNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevaFacturaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuNuevaFactura);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem6.setText("Reporte Factura");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuIProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIProductosActionPerformed
        InterProductos productos = new InterProductos();
        jDesktopPane_menu.add(productos);
        productos.setVisible(true);
    }//GEN-LAST:event_MenuIProductosActionPerformed

    private void Menu_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_CerrarSesionActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Menu_CerrarSesionActionPerformed

    private void MenuNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevaFacturaActionPerformed
        InterDatos datos = new InterDatos();
        jDesktopPane_menu.add(datos);
        datos.setVisible(true);
    }//GEN-LAST:event_MenuNuevaFacturaActionPerformed

    private void MenuNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevaCategoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_MenuNuevaCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuIProductos;
    private javax.swing.JMenuItem MenuNuevaCategoria;
    private javax.swing.JMenuItem MenuNuevaFactura;
    private javax.swing.JMenuItem Menu_CerrarSesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
