/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Views.ViewLogin;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Personagem;

/**
 *
 * @author guilherme.klafki
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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

        SelecionarPersonagens = new javax.swing.ButtonGroup();
        lblTeste = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        btrGuerreiro = new javax.swing.JRadioButton();
        btrEspiritualista = new javax.swing.JRadioButton();
        btrArcano = new javax.swing.JRadioButton();
        btrArqueiro = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNick = new javax.swing.JTextField();
        lblNick = new javax.swing.JLabel();
        btnAtGuerreiro = new javax.swing.JButton();
        btnAtEspiritualista = new javax.swing.JButton();
        btnAtArqueiro = new javax.swing.JButton();
        btnAtArcano = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Seleção do Personagem");

        lblTeste.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTeste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeste.setText("Selecione um personagem:");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sign-left.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAvancar.setBackground(new java.awt.Color(255, 255, 255));
        btnAvancar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sign-right.png"))); // NOI18N
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        SelecionarPersonagens.add(btrGuerreiro);
        btrGuerreiro.setText("Guerreiro");
        btrGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrGuerreiroActionPerformed(evt);
            }
        });

        SelecionarPersonagens.add(btrEspiritualista);
        btrEspiritualista.setText("Espiritualista");
        btrEspiritualista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrEspiritualistaActionPerformed(evt);
            }
        });

        SelecionarPersonagens.add(btrArcano);
        btrArcano.setText("Arcano");

        SelecionarPersonagens.add(btrArqueiro);
        btrArqueiro.setText("Arqueiro");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/arqueiro.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/guerreiro.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/espiritualista.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/arcano.png"))); // NOI18N

        txtNick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNickKeyTyped(evt);
            }
        });

        lblNick.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNick.setText("Nome:");

        btnAtGuerreiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtGuerreiroActionPerformed(evt);
            }
        });

        btnAtEspiritualista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtEspiritualista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtEspiritualistaActionPerformed(evt);
            }
        });

        btnAtArqueiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtArqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtArqueiroActionPerformed(evt);
            }
        });

        btnAtArcano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtArcano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtArcanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btrGuerreiro)
                .addGap(88, 88, 88)
                .addComponent(btrEspiritualista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btrArcano)
                .addGap(101, 101, 101)
                .addComponent(btrArqueiro)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtGuerreiro)
                            .addComponent(btnVoltar))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNick)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnAtEspiritualista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnAtArcano)))
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvancar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtArqueiro)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btrGuerreiro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btrArcano)
                            .addComponent(btrEspiritualista)
                            .addComponent(btrArqueiro))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtEspiritualista)
                            .addComponent(btnAtGuerreiro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtArqueiro)
                            .addComponent(btnAtArcano))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar)
                    .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNick)
                    .addComponent(btnVoltar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewLogin telaLogin = new ViewLogin();
        telaLogin.setVisible(true);
        System.out.println("Voltado da tela de Personagem para a tela de Login");
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btrGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrGuerreiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btrGuerreiroActionPerformed

    private void btrEspiritualistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrEspiritualistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btrEspiritualistaActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
        
        if (txtNick.getText().trim().equals("")) {
              JOptionPane.showMessageDialog(this, "Por favor, escolha um nome para o seu personagem!","Atenção",JOptionPane.WARNING_MESSAGE);
               return;
                    } else {
                if (!btrGuerreiro.isSelected() && !btrArcano.isSelected() && !btrEspiritualista.isSelected() && !btrArqueiro.isSelected()) {   
                       JOptionPane.showMessageDialog(this, "Por favor, escolha uma classe!","Atenção",JOptionPane.WARNING_MESSAGE);
                       return;
                  } else {
        
                        if (btrGuerreiro.isSelected()) { 
                            novoPersonagem("GUE");
                         
                        }
                        else if (btrArcano.isSelected()) {  
                            novoPersonagem("ARC");
    
                        }
                        else if (btrEspiritualista.isSelected()) {
                            novoPersonagem("ESP");
                           
                        }
                        else if (btrArqueiro.isSelected()) {
                            novoPersonagem("ARQ");
                        
                  }
                    }
        }
                JOptionPane.showMessageDialog(this, "Bom jogo!  " + txtNick.getText());
                System.out.println("Escolhido o personagem e pronto para jogar!"); 
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnAtGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtGuerreiroActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, novoPersonagem("GUE"));
    }//GEN-LAST:event_btnAtGuerreiroActionPerformed

    private void btnAtEspiritualistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtEspiritualistaActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, novoPersonagem("ESP"));
    }//GEN-LAST:event_btnAtEspiritualistaActionPerformed

    private void btnAtArqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtArqueiroActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, novoPersonagem("ARQ"));
    }//GEN-LAST:event_btnAtArqueiroActionPerformed

    private void btnAtArcanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtArcanoActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(this, novoPersonagem("ARC"));
    }//GEN-LAST:event_btnAtArcanoActionPerformed

    private void txtNickKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickKeyTyped
        // TODO add your handling code here:
        if (txtNick.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNickKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    //Método para instância um novo personagem e mostrar os atributos
    public String novoPersonagem(String classe) {
        if (classe.equals("GUE")) {
          Personagem guerreiro = new Personagem();
          guerreiro.setNome(txtNick.getText());
          guerreiro.setClasse("Guerreiro");
          guerreiro.setNivel(0);
          guerreiro.setVida(100);
          guerreiro.setAtaque(300);
          System.out.println("Nome: " + txtNick.getText()+"\n" + guerreiro.toString());
          return guerreiro.toString();
        }
        
        else if (classe.equals("ARC")) {
          Personagem arcano= new Personagem();
          arcano.setNome(txtNick.getText());
          arcano.setClasse("Arcano");
          arcano.setNivel(0);
          arcano.setVida(200);
          arcano.setAtaque(250);  
          System.out.println("Nome: " + txtNick.getText()+"\n" +arcano.toString());
          return arcano.toString();
          
        } else if (classe.equals("ESP")) {
          Personagem espiritualista = new Personagem();
          espiritualista.setNome(txtNick.getText());
          espiritualista.setClasse("Espiritualista");
          espiritualista.setNivel(0);
          espiritualista.setVida(150);
          espiritualista.setAtaque(150);
          System.out.println("Nome: " + txtNick.getText()+"\n" +espiritualista.toString());
          return espiritualista.toString();
            
        } else if (classe.equals("ARQ")) {
          Personagem arqueiro = new Personagem();
          arqueiro.setNome(txtNick.getText());
          arqueiro.setClasse("Arqueiro");
          arqueiro.setNivel(0);
          arqueiro.setVida(100);
          arqueiro.setAtaque(100);
          System.out.println("Nome: " + txtNick.getText()+"\n" + arqueiro.toString());
          return arqueiro.toString();
        }
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SelecionarPersonagens;
    private javax.swing.JButton btnAtArcano;
    private javax.swing.JButton btnAtArqueiro;
    private javax.swing.JButton btnAtEspiritualista;
    private javax.swing.JButton btnAtGuerreiro;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JRadioButton btrArcano;
    private javax.swing.JRadioButton btrArqueiro;
    private javax.swing.JRadioButton btrEspiritualista;
    private javax.swing.JRadioButton btrGuerreiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblNick;
    private javax.swing.JLabel lblTeste;
    private javax.swing.JTextField txtNick;
    // End of variables declaration//GEN-END:variables
}
