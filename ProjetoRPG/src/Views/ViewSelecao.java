/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Views.ViewLogin;
import ferramentas.CaixaDeDialogo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import modelo.Personagem;

/**
 *
 * @author guilherme.klafki
 */
public class ViewSelecao extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    public ViewSelecao() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE); 
        
        //Atalho Enter para o botão Avançar
        InputMap inputMap = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),"forward");
        this.getRootPane().setInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
        this.getRootPane().getActionMap().put("forward", new AbstractAction(){
        private static final long serialVersionUID = 1L;
        @Override
        public void actionPerformed(ActionEvent arg0) {
        btnAvancar.doClick();
    }
});
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
        txtNome = new javax.swing.JTextField();
        lblNick = new javax.swing.JLabel();
        btnAtGuerreiro = new javax.swing.JButton();
        btnAtEspiritualista = new javax.swing.JButton();
        btnAtArqueiro = new javax.swing.JButton();
        btnAtArcano = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Seleção do Personagem");

        lblTeste.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTeste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeste.setText("Selecione um personagem:");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sign-left.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Voltar para a tela de login");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAvancar.setBackground(new java.awt.Color(255, 255, 255));
        btnAvancar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sign-right.png"))); // NOI18N
        btnAvancar.setText("Avançar");
        btnAvancar.setToolTipText("Ir para o campo de batalha");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        SelecionarPersonagens.add(btrGuerreiro);
        btrGuerreiro.setText("Guerreiro");

        SelecionarPersonagens.add(btrEspiritualista);
        btrEspiritualista.setText("Espiritualista");

        SelecionarPersonagens.add(btrArcano);
        btrArcano.setText("Arcano");

        SelecionarPersonagens.add(btrArqueiro);
        btrArqueiro.setText("Arqueiro");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/arqueiro.png"))); // NOI18N
        jLabel1.setToolTipText("Imagem do personagem Arqueiro");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/guerreiro.png"))); // NOI18N
        jLabel2.setToolTipText("Imagem do Personagem Guerreiro");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/espiritualista.png"))); // NOI18N
        jLabel3.setToolTipText("Imagem do Personagem Espiritualista");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/arcano.png"))); // NOI18N
        jLabel5.setToolTipText("Imagem do personagem Arcano");

        txtNome.setToolTipText("Preencha um nome para o seu personagem");
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        lblNick.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNick.setText("Nome:");

        btnAtGuerreiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtGuerreiro.setToolTipText("Atributos do persoangem Guerreiro");
        btnAtGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtGuerreiroActionPerformed(evt);
            }
        });

        btnAtEspiritualista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtEspiritualista.setToolTipText("Atributos do Personagem Espiritualista");
        btnAtEspiritualista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtEspiritualistaActionPerformed(evt);
            }
        });

        btnAtArqueiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtArqueiro.setToolTipText("Atributos do personagem Arqueiro");
        btnAtArqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtArqueiroActionPerformed(evt);
            }
        });

        btnAtArcano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/button.png"))); // NOI18N
        btnAtArcano.setToolTipText("Atributos do personagem Arcano");
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
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancar)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
        
               if (txtNome.getText().trim().equals("")) {
               CaixaDeDialogo.obterinstancia().exibirMensagem("Por favor, escolha um nome para o seu personagem","Atenção",'i');
               return;
               } else {
               if (txtNome.getText().trim().length() <=3) {
               CaixaDeDialogo.obterinstancia().exibirMensagem("Por favor, escolha um nome maior que 3 letras!","Atenção",'i');
               return;
                    } else {
                if (!btrGuerreiro.isSelected() && !btrArcano.isSelected() && !btrEspiritualista.isSelected() && !btrArqueiro.isSelected()) {   
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Por favor, escolha uma classe!","Atenção",'i');
                       return;
                  } else {
                     System.out.println("Escolhido o personagem e pronto para jogar!");
                     CaixaDeDialogo.obterinstancia().exibirMensagem("Bom jogo!  " + txtNome.getText(),"Atenção",'i');
                    // Personagem personagem = escolherPersonagem();
                    /// ViewConfronto tela = new ViewConfronto(personagem);
                    // tela.setVisible(true);
                    Personagem personagem = escolherPersonagem();
                    ViewPersonagem tela = new ViewPersonagem(personagem);
                    tela.setVisible(true);
                    this.setVisible(false);
                }
               }
        
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnAtGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtGuerreiroActionPerformed
        // TODO add your handling code here:
        Personagem personagem = escolherPersonagem();
        if (personagem.getClasse() == null) {
        CaixaDeDialogo.obterinstancia().exibirMensagem("Selecione o personagem para ver seus atributos!","Selecione um Personagem",'e'); 
        return;
        }
        CaixaDeDialogo.obterinstancia().exibirMensagem(personagem.toString(),"Atributos",'i');
    }//GEN-LAST:event_btnAtGuerreiroActionPerformed

    private void btnAtEspiritualistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtEspiritualistaActionPerformed
        // TODO add your handling code here:
        Personagem personagem = escolherPersonagem();
        if (personagem.getClasse() == null) {
        CaixaDeDialogo.obterinstancia().exibirMensagem("Selecione o personagem para ver seus atributos!","Selecione um Personagem",'e'); 
        return;
        }
        CaixaDeDialogo.obterinstancia().exibirMensagem(personagem.toString(),"Atributos",'i');
    }//GEN-LAST:event_btnAtEspiritualistaActionPerformed

    private void btnAtArqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtArqueiroActionPerformed
        // TODO add your handling code here:
        Personagem personagem = escolherPersonagem();
        if (personagem.getClasse() == null) {
        CaixaDeDialogo.obterinstancia().exibirMensagem("Selecione o personagem para ver seus atributos!","Selecione um Personagem",'e'); 
        return;
        }
        CaixaDeDialogo.obterinstancia().exibirMensagem(personagem.toString(),"Atributos",'i');
    }//GEN-LAST:event_btnAtArqueiroActionPerformed

    private void btnAtArcanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtArcanoActionPerformed
        // TODO add your handling code here:
        Personagem personagem = escolherPersonagem();
        if (personagem.getClasse() == null) {
        CaixaDeDialogo.obterinstancia().exibirMensagem("Selecione o personagem para ver seus atributos!","Selecione um Personagem",'e'); 
         return;
        }
        CaixaDeDialogo.obterinstancia().exibirMensagem(personagem.toString(),"Atributos",'i');
    }//GEN-LAST:event_btnAtArcanoActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        if (txtNome.getText().length()>=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNomeKeyTyped

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
            java.util.logging.Logger.getLogger(ViewSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSelecao().setVisible(true);
            }
        });
    }
    
    //Método para instância um novo personagem e mostrar os atributos
    
    private Personagem escolherPersonagem() {
       try {
         Personagem personagem = new Personagem();  
         personagem.setNome(txtNome.getText());
         
         if (btrGuerreiro.isSelected()) { 
          personagem.setClasse("Guerreiro");
          personagem.setNivel(0);
          personagem.setVida(600);
          personagem.setAtaque(300);
        }
       else if (btrArcano.isSelected()) {  
          personagem.setClasse("Arcano");
          personagem.setNivel(0);
          personagem.setVida(400);
          personagem.setAtaque(400);  
          
        } else if (btrEspiritualista.isSelected()) {
          personagem.setClasse("Espiritualista");
          personagem.setNivel(0);
          personagem.setVida(200);
          personagem.setAtaque(500);
          
        } else if (btrArqueiro.isSelected()) {
          personagem.setClasse("Arqueiro");
          personagem.setNivel(0);
          personagem.setVida(250);
          personagem.setAtaque(280);
        }
  
         return personagem;
         
       } catch (Exception e) {
         return null;
    }
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
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}