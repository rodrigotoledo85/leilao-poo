/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

import java.awt.Frame;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import leilao.modelo.Endereco;
import leilao.modelo.Usuario;
import leilao.ui.categoria.FormListagemCategoria;
import leilao.ui.login.FormLogin;
import leilao.ui.usuario.FormListagemUsuarios;

/**
 *
 * @author 10720816
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private EntityManagerFactory factory;
    private EntityManager entity;
    /**
     * Creates new form FormTelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        Usuario u = new Usuario();
        Endereco e = new Endereco();
                
        FormLogin login = new FormLogin(this, true);
        login.setVisible(true);
        
        if(!login.isAutenticado){
            System.exit(0);
        }
        
        this.setLocationRelativeTo(null);
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
        menuUsuarios = new javax.swing.JMenu();
        menuGestaoUsuarios = new javax.swing.JMenuItem();
        menuCategorias = new javax.swing.JMenu();
        menuGestaoCategorias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuUsuarios.setText("Usuários");

        menuGestaoUsuarios.setText("Gestão de usuários");
        menuGestaoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(menuGestaoUsuarios);

        jMenuBar1.add(menuUsuarios);

        menuCategorias.setText("Categorias");

        menuGestaoCategorias.setText("Gestão de categorias");
        menuGestaoCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoCategoriasActionPerformed(evt);
            }
        });
        menuCategorias.add(menuGestaoCategorias);

        jMenuBar1.add(menuCategorias);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGestaoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoUsuariosActionPerformed
        FormListagemUsuarios c = new FormListagemUsuarios((Frame) this.getParent(), true);
        c.setVisible(true);
    }//GEN-LAST:event_menuGestaoUsuariosActionPerformed

    private void menuGestaoCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoCategoriasActionPerformed
        FormListagemCategoria form = new FormListagemCategoria((Frame) this.getParent(), true);
        form.setVisible(true);
    }//GEN-LAST:event_menuGestaoCategoriasActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCategorias;
    private javax.swing.JMenuItem menuGestaoCategorias;
    private javax.swing.JMenuItem menuGestaoUsuarios;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
