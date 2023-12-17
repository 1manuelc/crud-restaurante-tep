/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurante.tep.view;

/**
 *
 * @author User
 */
public class NovoPedido extends javax.swing.JFrame {

    /**
     * Creates new form NovoPedido
     */
    public NovoPedido() {
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
        jLabel23 = new javax.swing.JLabel();
        SairPedidos = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jTdescricaoPed = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jCcategoriaPed = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jCmesaPed = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jTpreco = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jFdataPed = new javax.swing.JFormattedTextField();
        jLabel46 = new javax.swing.JLabel();
        jTqdePed = new javax.swing.JTextField();
        jTpesquisaPed = new javax.swing.JTextField();
        jBbotaoPesquisa = new javax.swing.JButton();
        jBsalvarPed = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realize um novo pedido!");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principalpedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Principalpedidos.setForeground(new java.awt.Color(255, 255, 255));
        Principalpedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/icon-principal.png"))); // NOI18N
        Principalpedidos.setText("Principal");
        Principalpedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principalpedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrincipalpedidosMouseClicked(evt);
            }
        });
        jPanel11.add(Principalpedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/icon-pedidos.png"))); // NOI18N
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
        SairPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/icon-sair.png"))); // NOI18N
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

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, 450));

        jPanel3.setBackground(new java.awt.Color(228, 77, 38));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/GineFoodSmall.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 60));

        jPanel4.setBackground(new java.awt.Color(239, 239, 239));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/icon-meus-pedidos.png"))); // NOI18N
        jLabel12.setText(" Novo pedido");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 580, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setText("Descrição:");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 27, -1, -1));
        jPanel5.add(jTdescricaoPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 47, 310, -1));

        jLabel40.setText("Categoria:");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 20));

        jCcategoriaPed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jCcategoriaPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 109, -1));

        jLabel41.setText("Mesa:");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jCmesaPed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jCmesaPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 95, -1));

        jLabel42.setText("Quantidade:");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jTpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprecoActionPerformed(evt);
            }
        });
        jPanel5.add(jTpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 41, -1));

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("R$");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, 30));
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 79, -1, -1));

        jLabel45.setText("Preço:");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jFdataPed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jPanel5.add(jFdataPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, -1));

        jLabel46.setText("Data:");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));
        jPanel5.add(jTqdePed, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 50, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 580, 150));

        jTpesquisaPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpesquisaPedActionPerformed(evt);
            }
        });
        getContentPane().add(jTpesquisaPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 490, 30));

        jBbotaoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/icons8-pesquisar-100.png"))); // NOI18N
        jBbotaoPesquisa.setToolTipText("Pesquisar pedido");
        getContentPane().add(jBbotaoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 80, 30));

        jBsalvarPed.setBackground(new java.awt.Color(51, 204, 0));
        jBsalvarPed.setForeground(new java.awt.Color(255, 255, 255));
        jBsalvarPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/accept.png"))); // NOI18N
        jBsalvarPed.setText("Salvar");
        jBsalvarPed.setToolTipText("Finalizar pedido");
        getContentPane().add(jBsalvarPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 102, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/application_edit.png"))); // NOI18N
        jButton9.setText("Editar");
        jButton9.setToolTipText("Editar pedido");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 90, -1));

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restaurante/tep/view/images/cancel.png"))); // NOI18N
        jButton10.setText("Cancelar");
        jButton10.setToolTipText("Cancelar pedido");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Data", "Total", "Descrição", "Status", "Quantidade", "Mesa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 600, 140));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairPedidosMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairPedidosMouseClicked

    private void PrincipalpedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalpedidosMouseClicked
        Principal pri = new Principal ();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PrincipalpedidosMouseClicked

    private void jTprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprecoActionPerformed


    private void jTpesquisaPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpesquisaPedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesquisaPedActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

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
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Principalpedidos;
    private javax.swing.JLabel SairPedidos;
    private javax.swing.JButton jBbotaoPesquisa;
    private javax.swing.JButton jBsalvarPed;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jCcategoriaPed;
    private javax.swing.JComboBox<String> jCmesaPed;
    private javax.swing.JFormattedTextField jFdataPed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTdescricaoPed;
    private javax.swing.JTextField jTpesquisaPed;
    private javax.swing.JTextField jTpreco;
    private javax.swing.JTextField jTqdePed;
    // End of variables declaration//GEN-END:variables
}
