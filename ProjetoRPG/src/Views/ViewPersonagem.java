/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ferramentas.CaixaDeDialogo;
import java.awt.Color;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Personagem;

/**
 *
 * @author Windows
 */
public class ViewPersonagem extends javax.swing.JFrame {
     Personagem personagem;
     int vez =0;
     Random gerador = new Random();

    /**
     * Creates new form ViewPersonagem
     */
    public ViewPersonagem(Personagem personagemEscolhido) {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE); 
        this.personagem = personagemEscolhido;
        lblImagemP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/"+personagem.getClasse().toLowerCase()+".png")));
        mostrarPersonagem();
    }

    private ViewPersonagem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        btnCampoBatalha = new javax.swing.JButton();
        txtNivelP = new javax.swing.JLabel();
        lblNomeP = new javax.swing.JLabel();
        lblAtaqueP = new javax.swing.JLabel();
        lblVidaP = new javax.swing.JLabel();
        txtNomeP = new javax.swing.JLabel();
        txtAtaqueP = new javax.swing.JLabel();
        txtVidaP = new javax.swing.JLabel();
        lblClasseP = new javax.swing.JLabel();
        txtClasseP = new javax.swing.JLabel();
        lblNivelP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTelaPersonagem = new javax.swing.JLabel();
        lblImagemP = new javax.swing.JLabel();
        btnBau = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Personagem");
        setPreferredSize(new java.awt.Dimension(1000, 650));

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

        btnCampoBatalha.setBackground(new java.awt.Color(255, 255, 255));
        btnCampoBatalha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCampoBatalha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/shield.png"))); // NOI18N
        btnCampoBatalha.setText("Campo de Batalha");
        btnCampoBatalha.setToolTipText("Ir para o campo de batalha");
        btnCampoBatalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampoBatalhaActionPerformed(evt);
            }
        });

        txtNivelP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblNomeP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomeP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/usuario.png"))); // NOI18N
        lblNomeP.setText("Nome:");
        lblNomeP.setToolTipText("Nome do Personagem");

        lblAtaqueP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAtaqueP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ataque.png"))); // NOI18N
        lblAtaqueP.setText("Ataque:");
        lblAtaqueP.setToolTipText("Ataque do Personagem");

        lblVidaP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVidaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coracao.png"))); // NOI18N
        lblVidaP.setText("Vida:");
        lblVidaP.setToolTipText("Vida do Personagem");

        txtNomeP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAtaqueP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtVidaP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblClasseP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClasseP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/classe.png"))); // NOI18N
        lblClasseP.setText("Classe:");
        lblClasseP.setToolTipText("Classe do Personagem");

        txtClasseP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblNivelP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNivelP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/nivel.png"))); // NOI18N
        lblNivelP.setText("Nível:");
        lblNivelP.setToolTipText("Nível do Personagem");

        lblTelaPersonagem.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lblTelaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelaPersonagem.setText("Tela do Personagem");

        lblImagemP.setToolTipText("Imagem do Personagem");

        btnBau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bau.png"))); // NOI18N
        btnBau.setText("Baú do dia");
        btnBau.setToolTipText("");
        btnBau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTelaPersonagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVidaP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVidaP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAtaqueP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAtaqueP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNivelP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNivelP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblClasseP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtClasseP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblNomeP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImagemP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBau)
                    .addComponent(btnCampoBatalha))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeP)
                            .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtClasseP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClasseP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNivelP)
                            .addComponent(txtNivelP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtaqueP)
                            .addComponent(txtAtaqueP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVidaP)
                            .addComponent(txtVidaP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagemP, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBau)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnCampoBatalha))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewSelecao telaSelecao = new ViewSelecao();
        telaSelecao.setVisible(true);

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCampoBatalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampoBatalhaActionPerformed
         try {
             // TODO add your handling code here:
             
             ViewConfronto tela = new ViewConfronto(personagem);
             tela.setVisible(true);
             this.setVisible(false);
            } catch (IOException ex) {
             CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao iniciar a tela campo de batalha","Atenção",'e');
         }
                
    }//GEN-LAST:event_btnCampoBatalhaActionPerformed

    private void btnBauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBauActionPerformed
        // TODO add your handling code here:
       int valorBau = gerador.nextInt(2) + 1;
       if (personagem.getBau() == 2) {
           // não pode pegar
            CaixaDeDialogo.obterinstancia().exibirMensagem("Você já pegou sua recompensa hoje!","Atenção",'e');
            
       } else {
           // pega premio
           if (valorBau == 1) {      
            CaixaDeDialogo.obterinstancia().exibirMensagem("Parabéns sua recompensa é: 200 de vida","Atenção",'i');
            personagem.setVida(personagem.getVida()+200); 
            mostrarPersonagem();
            personagem.setBau(2);
           } else {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Parabéns sua recompensa é: 200 de Ataque","Atenção",'i');
            personagem.setAtaque(personagem.getAtaque()+200);   
            personagem.setBau(2);
            mostrarPersonagem();
           }
       }
    }//GEN-LAST:event_btnBauActionPerformed

    /**
     * @param args the command line arguments
     */
    
      private void mostrarPersonagem() {
        txtNomeP.setText(personagem.getNome());
        txtClasseP.setText(personagem.getClasse());
        txtNivelP.setText(String.valueOf(personagem.getNivel()));
        txtAtaqueP.setText(String.valueOf(personagem.getAtaque()));
        txtVidaP.setText(String.valueOf(personagem.getVida()) + "/" + String.valueOf(personagem.getVida()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBau;
    private javax.swing.JButton btnCampoBatalha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAtaqueP;
    private javax.swing.JLabel lblClasseP;
    private javax.swing.JLabel lblImagemP;
    private javax.swing.JLabel lblNivelP;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblTelaPersonagem;
    private javax.swing.JLabel lblVidaP;
    private javax.swing.JLabel txtAtaqueP;
    private javax.swing.JLabel txtClasseP;
    private javax.swing.JLabel txtNivelP;
    private javax.swing.JLabel txtNomeP;
    private javax.swing.JLabel txtVidaP;
    // End of variables declaration//GEN-END:variables
}
