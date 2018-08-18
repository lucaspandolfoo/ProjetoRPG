/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ferramentas.CaixaDeDialogo;
import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class ViewCompra extends javax.swing.JDialog {

    /**
     * Creates new form ViewCompra
     */
    public ViewCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.WHITE); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPocaoVida5 = new javax.swing.JLabel();
        lblPrata = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPocaoVida8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPocaoVida7 = new javax.swing.JLabel();
        lblPrata5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblPocaoVida15 = new javax.swing.JLabel();
        jPanelC = new javax.swing.JPanel();
        lblPocaoVida6 = new javax.swing.JLabel();
        lblPrata1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPocaoVida9 = new javax.swing.JLabel();
        btnComprar50 = new javax.swing.JButton();
        btnComprar100 = new javax.swing.JButton();
        btnComprar20 = new javax.swing.JButton();
        btnVoltarP = new javax.swing.JButton();
        lblFormasPagamento = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de compra");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comprar Pratas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 145));

        lblPocaoVida5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoVida5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPocaoVida5.setText("100 Pratas");

        lblPrata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/comprarPratas.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        lblPocaoVida8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoVida8.setForeground(new java.awt.Color(255, 255, 255));
        lblPocaoVida8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPocaoVida8.setText("R$ 20,00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida8, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPocaoVida5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrata, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 145));

        lblPocaoVida7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoVida7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPocaoVida7.setText("1000 Pratas");

        lblPrata5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrata5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/comprarPratas.png"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 102, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(72, 44));

        lblPocaoVida15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoVida15.setForeground(new java.awt.Color(255, 255, 255));
        lblPocaoVida15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPocaoVida15.setText("R$ 100,00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida15, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrata5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPocaoVida7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrata5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelC.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanelC.setPreferredSize(new java.awt.Dimension(220, 145));

        lblPocaoVida6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoVida6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPocaoVida6.setText("500 Pratas");

        lblPrata1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrata1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/comprarPratas.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(0, 102, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(72, 44));

        lblPocaoVida9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoVida9.setForeground(new java.awt.Color(255, 255, 255));
        lblPocaoVida9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPocaoVida9.setText("R$ 50,00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCLayout = new javax.swing.GroupLayout(jPanelC);
        jPanelC.setLayout(jPanelCLayout);
        jPanelCLayout.setHorizontalGroup(
            jPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPocaoVida6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
            .addGroup(jPanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrata1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        jPanelCLayout.setVerticalGroup(
            jPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPocaoVida6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrata1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnComprar50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComprar50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/money-bag.png"))); // NOI18N
        btnComprar50.setText("Comprar");
        btnComprar50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar50ActionPerformed(evt);
            }
        });

        btnComprar100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComprar100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/money-bag.png"))); // NOI18N
        btnComprar100.setText("Comprar");
        btnComprar100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar100ActionPerformed(evt);
            }
        });

        btnComprar20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComprar20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/money-bag.png"))); // NOI18N
        btnComprar20.setText("Comprar");
        btnComprar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprar20ActionPerformed(evt);
            }
        });

        btnVoltarP.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sign-left.png"))); // NOI18N
        btnVoltarP.setText("Voltar");
        btnVoltarP.setToolTipText("Voltar para a tela de login");
        btnVoltarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPActionPerformed(evt);
            }
        });

        lblFormasPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/formaspagamentomegaarmarinho.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quer ficar mais forte? Escolha um de nossos pacotes e seja o melhor jogador!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltarP)
                        .addGap(72, 72, 72)
                        .addComponent(lblFormasPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jPanelC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnComprar20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprar50)
                .addGap(113, 113, 113)
                .addComponent(btnComprar100)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jPanelC, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar50)
                    .addComponent(btnComprar100)
                    .addComponent(btnComprar20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormasPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnVoltarP)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarPActionPerformed

    private void btnComprar50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar50ActionPerformed
        // TODO add your handling code here:
         CaixaDeDialogo.obterinstancia().exibirMensagem("Você será redirecionado para o nosso site\npara preencher seus dados!","Atenção",'i');
         abrirSite();
    }//GEN-LAST:event_btnComprar50ActionPerformed

    private void btnComprar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar20ActionPerformed
        // TODO add your handling code here:
         CaixaDeDialogo.obterinstancia().exibirMensagem("Você será redirecionado para o nosso site\npara preencher seus dados!","Atenção",'i');
         abrirSite();
    }//GEN-LAST:event_btnComprar20ActionPerformed

    private void btnComprar100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprar100ActionPerformed
        // TODO add your handling code here:
          CaixaDeDialogo.obterinstancia().exibirMensagem("Você será redirecionado para o nosso site\npara preencher seus dados!","Atenção",'i');
          abrirSite();
    }//GEN-LAST:event_btnComprar100ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewCompra dialog = new ViewCompra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void abrirSite() {
         try {
             try {
                 java.awt.Desktop.getDesktop().browse( new java.net.URI("https://www.univates.br/"));
             } catch (IOException ex) {
              CaixaDeDialogo.obterinstancia().exibirMensagem("Parece que nosso site está indisponível no momento :(","Atenção",'e');
             }
          }   catch (URISyntaxException ex) {
              CaixaDeDialogo.obterinstancia().exibirMensagem("Parece que nosso site está indisponível no momento :(","Atenção",'e');
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar100;
    private javax.swing.JButton btnComprar20;
    private javax.swing.JButton btnComprar50;
    private javax.swing.JButton btnVoltarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelC;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFormasPagamento;
    private javax.swing.JLabel lblPocaoVida15;
    private javax.swing.JLabel lblPocaoVida5;
    private javax.swing.JLabel lblPocaoVida6;
    private javax.swing.JLabel lblPocaoVida7;
    private javax.swing.JLabel lblPocaoVida8;
    private javax.swing.JLabel lblPocaoVida9;
    private javax.swing.JLabel lblPrata;
    private javax.swing.JLabel lblPrata1;
    private javax.swing.JLabel lblPrata5;
    // End of variables declaration//GEN-END:variables
}
