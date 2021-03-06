/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import utilidades.Tela;

/**
 *
 * @author bruno_azzi
 */
public class MenuPrincipal extends javax.swing.JFrame {
    public view.intendencia.List intendenciaListPanel = new view.intendencia.List();
    public view.intendencia.Create intendenciaCreatePanel = new view.intendencia.Create();
    public view.cidadao.List cidadaoListPanel = new view.cidadao.List();
    public view.cidadao.Create cidadaoCreatePanel = new view.cidadao.Create();
    public view.incidente.List incidenteListPanel = new view.incidente.List();
    public view.incidente.Create incidenteCreatePanel = new view.incidente.Create();
    public view.ordem.List ordemListPanel = new view.ordem.List();
    public view.ordem.Create ordemCreatePanel = new view.ordem.Create();
    public view.rua.List ruaListPanel = new view.rua.List();
    public view.rua.Create ruaCreatePanel = new view.rua.Create();
    /**
     * Creates new form IntendenciaCreate
     */
    public MenuPrincipal() {
        initComponents();
        initIntendenciaList();
        initIntendenciaCreate();
        
        initCidadaoCreate();
        initCidadaoList();
        
        initIncidenteCreate();
        initIncidenteList();
        
        initOrdemCreate();
        initOrdemList();
        
        initRuaCreate();
        initRuaList();
    }
    
    public void initIntendenciaList() {
        intendenciaListPanel.setBounds(Tela.menuIntendencia());
        this.add(intendenciaListPanel);
        intendenciaListPanel.setVisible(false);
    }

    public void initIntendenciaCreate() {
        intendenciaCreatePanel.setBounds(Tela.menuIntendencia());
        this.add(intendenciaCreatePanel);
        intendenciaCreatePanel.setVisible(false);
    }
    
    public void initCidadaoCreate() {
        cidadaoCreatePanel.setBounds(Tela.menuIntendencia());
        this.add(cidadaoCreatePanel);
        cidadaoCreatePanel.setVisible(false);
    }
    
    public void initCidadaoList() {
        cidadaoListPanel.setBounds(Tela.menuIntendencia());
        this.add(cidadaoListPanel);
        cidadaoListPanel.setVisible(false);
    }
    
    public void initIncidenteCreate() {
        incidenteCreatePanel.setBounds(Tela.menuIntendencia());
        this.add(incidenteCreatePanel);
        incidenteCreatePanel.setVisible(false);
    }
    
    public void initIncidenteList() {
        incidenteListPanel.setBounds(Tela.menuIntendencia());
        this.add(incidenteListPanel);
        incidenteListPanel.setVisible(false);
    }
    
    public void initOrdemCreate() {
        ordemCreatePanel.setBounds(Tela.menuIntendencia());
        this.add(ordemCreatePanel);
        ordemCreatePanel.setVisible(false);
    }
    
    public void initOrdemList() {
        ordemListPanel.setBounds(Tela.menuIntendencia());
        this.add(ordemListPanel);
        ordemListPanel.setVisible(false);
    }
    
    public void initRuaCreate() {
        ruaCreatePanel.setBounds(Tela.menuIntendencia());
        this.add(ruaCreatePanel);
        ruaCreatePanel.setVisible(false);
    }
    
    public void initRuaList() {
        ruaListPanel.setBounds(Tela.menuIntendencia());
        this.add(ruaListPanel);
        ruaListPanel.setVisible(false);
    }
    
    public void clear(){
        intendenciaCreatePanel.setVisible(false);
        intendenciaListPanel.setVisible(false);
        cidadaoCreatePanel.setVisible(false);
        cidadaoListPanel.setVisible(false);
        incidenteCreatePanel.setVisible(false);
        incidenteListPanel.setVisible(false);
        ordemCreatePanel.setVisible(false);
        ordemListPanel.setVisible(false);
        ruaCreatePanel.setVisible(false);
        ruaListPanel.setVisible(false);
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(Tela.SCREEN_SIZE);

        jMenu1.setText("Intendencias");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Listar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Incidentes");

        jMenuItem2.setText("Listar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ordens de Serviço");

        jMenuItem3.setText("Listar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cidadão");

        jMenuItem4.setText("Listar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ruas");

        jMenuItem5.setText("Listar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

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

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        clear();
        intendenciaListPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        clear();
        incidenteListPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        clear();
        ordemListPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        clear();
        cidadaoListPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        clear();
        ruaListPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
