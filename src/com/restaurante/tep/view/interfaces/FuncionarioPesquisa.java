/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.tep.view.interfaces;

/**
 *
 * @author User
 */
public class FuncionarioPesquisa extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioPesquisa
     */
    public FuncionarioPesquisa() {
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

        jPanel11 = new javax.swing.JPanel();
        Principalpedidos = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        SairPedidos = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        Principalpedidos1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        SairPedidos1 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jBnovoFuncionario = new javax.swing.JButton();

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principalpedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Principalpedidos.setForeground(new java.awt.Color(255, 255, 255));
        Principalpedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-principal.png"))); // NOI18N
        Principalpedidos.setText("Principal");
        Principalpedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principalpedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrincipalpedidosMouseClicked(evt);
            }
        });
        jPanel11.add(Principalpedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 61, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-pedidos.png"))); // NOI18N
        jLabel23.setText("Pedidos");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        SairPedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SairPedidos.setForeground(new java.awt.Color(255, 255, 255));
        SairPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-sair.png"))); // NOI18N
        SairPedidos.setText("Sair");
        SairPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairPedidosMouseClicked(evt);
            }
        });
        jPanel11.add(SairPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel11.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, -1));
        jPanel11.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, -1));
        jPanel11.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquise os funcionários do GineFood");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principalpedidos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Principalpedidos1.setForeground(new java.awt.Color(255, 255, 255));
        Principalpedidos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-principal.png"))); // NOI18N
        Principalpedidos1.setText("Principal");
        Principalpedidos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principalpedidos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Principalpedidos1MouseClicked(evt);
            }
        });
        jPanel12.add(Principalpedidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 61, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-pedidos.png"))); // NOI18N
        jLabel24.setText("Pedidos");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        SairPedidos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SairPedidos1.setForeground(new java.awt.Color(255, 255, 255));
        SairPedidos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-sair.png"))); // NOI18N
        SairPedidos1.setText("Sair");
        SairPedidos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SairPedidos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairPedidos1MouseClicked(evt);
            }
        });
        jPanel12.add(SairPedidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel12.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, -1));
        jPanel12.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, -1));
        jPanel12.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 10));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 430));

        jPanel3.setBackground(new java.awt.Color(228, 77, 38));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GineFoodSmall.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 740, 60));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setToolTipText("Cadastre os colaboradores!");

        jPanel7.setBackground(new java.awt.Color(239, 239, 239));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-meus-pedidos.png"))); // NOI18N
        jLabel32.setText("Lista de funcionários");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-100.png"))); // NOI18N
        jButton5.setToolTipText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Endereço", "CPF", "Cargo", "telefone"
            }
        ));
        jTableFuncionario.setToolTipText("");
        jScrollPane1.setViewportView(jTableFuncionario);

        jBnovoFuncionario.setBackground(new java.awt.Color(51, 102, 255));
        jBnovoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jBnovoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jBnovoFuncionario.setText("Novo funcionário");
        jBnovoFuncionario.setToolTipText("Realizar novo pedido");
        jBnovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBnovoFuncionario)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBnovoFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 600, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrincipalpedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalpedidosMouseClicked
        Principal pri = new Principal ();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PrincipalpedidosMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void SairPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairPedidosMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairPedidosMouseClicked

    private void Principalpedidos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Principalpedidos1MouseClicked
        Principal pri = new Principal ();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Principalpedidos1MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void SairPedidos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairPedidos1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairPedidos1MouseClicked

    private void jBnovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnovoFuncionarioActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Principalpedidos;
    private javax.swing.JLabel Principalpedidos1;
    private javax.swing.JLabel SairPedidos;
    private javax.swing.JLabel SairPedidos1;
    private javax.swing.JButton jBnovoFuncionario;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
