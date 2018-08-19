/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import static Views.ViewConfronto.ataque;
import static Views.ViewConfronto.tempo;
import ferramentas.CaixaDeDialogo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import modelo.Personagem;

/**
 *
 * @author Windows
 */
public class ViewPersonagem extends javax.swing.JFrame {
     Personagem personagem;
     int vez =0;
     Random gerador = new Random();
     DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Creates new form ViewPersonagem
     */
    public ViewPersonagem(Personagem personagemEscolhido) {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE); 
        this.personagem = personagemEscolhido;
        lblImagemP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personagens/"+personagem.getClasse().toLowerCase()+".png")));
        mostrarPersonagem();
        if (personagem.getVida() == 0) {
        tempoVida();
        }
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
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
        lblMoedas = new javax.swing.JLabel();
        txtMoedasP = new javax.swing.JLabel();
        lblPratas = new javax.swing.JLabel();
        txtMoedasP1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuConfiguracoes = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        IMTelaPersonagem = new javax.swing.JMenuItem();
        MenuLoja = new javax.swing.JMenu();
        MenuLojaP = new javax.swing.JMenuItem();
        IMAdquirirPratas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        IMSobreJogo = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Personagem");

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

        lblMoedas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMoedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coins.png"))); // NOI18N
        lblMoedas.setText("Moedas:");

        txtMoedasP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPratas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPratas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pratas.png"))); // NOI18N
        lblPratas.setText("Pratas:");

        txtMoedasP1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setPreferredSize(new java.awt.Dimension(178, 30));

        jMenu2.setText("Jogo");

        menuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/settings.png"))); // NOI18N
        menuConfiguracoes.setText("Configurações");
        menuConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfiguracoesActionPerformed(evt);
            }
        });
        jMenu2.add(menuConfiguracoes);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sign-error.png"))); // NOI18N
        menuSair.setText("Sair do Jogo");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu2.add(menuSair);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Personagem");

        IMTelaPersonagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/dependable.png"))); // NOI18N
        IMTelaPersonagem.setText("Tela do Personagem");
        IMTelaPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMTelaPersonagemActionPerformed(evt);
            }
        });
        jMenu3.add(IMTelaPersonagem);

        jMenuBar1.add(jMenu3);

        MenuLoja.setText("Loja");

        MenuLojaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/online-store.png"))); // NOI18N
        MenuLojaP.setText("Ir para Loja");
        MenuLojaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLojaPActionPerformed(evt);
            }
        });
        MenuLoja.add(MenuLojaP);

        IMAdquirirPratas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/bank.png"))); // NOI18N
        IMAdquirirPratas.setText("Adquirir Pratas");
        IMAdquirirPratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMAdquirirPratasActionPerformed(evt);
            }
        });
        MenuLoja.add(IMAdquirirPratas);

        jMenuBar1.add(MenuLoja);

        jMenu6.setText("Sobre");

        IMSobreJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/game-controller.png"))); // NOI18N
        IMSobreJogo.setText("Sobre o Jogo");
        jMenu6.add(IMSobreJogo);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTelaPersonagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblVidaP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVidaP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAtaqueP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAtaqueP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNivelP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNivelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomeP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblClasseP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtClasseP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImagemP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(454, 454, 454)
                        .addComponent(btnBau)
                        .addGap(75, 75, 75)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCampoBatalha))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMoedas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMoedasP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPratas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMoedasP1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemP, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(btnBau)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMoedasP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMoedas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPratas)
                            .addComponent(txtMoedasP1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
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
       int valorBau = gerador.nextInt(4) + 1;
       if (personagem.getBau() == 10) {
           // não pode pegar
            CaixaDeDialogo.obterinstancia().exibirMensagem("Você já pegou sua recompensa hoje!","Atenção",'e');
            
       } else {
           // pega premio
           if (valorBau == 1) {      
            CaixaDeDialogo.obterinstancia().exibirMensagem("Parabéns sua recompensa é: 200 de vida","Atenção",'i');
            personagem.setVida(personagem.getVida()+200); 
            mostrarPersonagem();
            personagem.setBau(10);
           }
           else if(valorBau == 2) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Parabéns sua recompensa é: 200 de Ataque","Atenção",'i');
            personagem.setAtaque(personagem.getAtaque()+200);   
            personagem.setBau(10);
            mostrarPersonagem();
           }
           else if(valorBau == 3) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Parabéns sua recompensa é: 200 Moedas","Atenção",'i');
            personagem.setMoedas(personagem.getMoedas()+ 200);   
            personagem.setBau(10);
            mostrarPersonagem();
           }
           else if(valorBau == 4) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Parabéns sua recompensa é: 1 Prata","Atenção",'i');
            personagem.setPratas(personagem.getPratas()+1);   
            personagem.setBau(10);
            mostrarPersonagem();
           }
       }
    }//GEN-LAST:event_btnBauActionPerformed

    private void menuConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfiguracoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConfiguracoesActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        boolean wResposta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Atenção, você realmente deseja sair do jogo?","Sair",'p');         
        if (wResposta == true) {
        System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void MenuLojaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLojaPActionPerformed
        // TODO add your handling code here:
        ViewLoja telaLoja = new ViewLoja((personagem));
        telaLoja.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuLojaPActionPerformed

    private void IMAdquirirPratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMAdquirirPratasActionPerformed
        // TODO add your handling code here:
        ViewCompra telaCompra = new ViewCompra(this, true);
        telaCompra.setLocationRelativeTo(null);
        telaCompra.setVisible(true);
    }//GEN-LAST:event_IMAdquirirPratasActionPerformed

    private void IMTelaPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMTelaPersonagemActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_IMTelaPersonagemActionPerformed

    /**
     * @param args the command line arguments
     */
    
      private void mostrarPersonagem() {
        txtNomeP.setText(personagem.getNome());
        txtClasseP.setText(personagem.getClasse());
        txtNivelP.setText(String.valueOf(personagem.getNivel()));
        txtAtaqueP.setText(String.valueOf(personagem.getAtaque()));
        txtVidaP.setText(String.valueOf(personagem.getVida()) + "/" + String.valueOf(personagem.getVida()));
        txtMoedasP.setText(String.valueOf(df.format(personagem.getMoedas())));
        txtMoedasP1.setText(String.valueOf(personagem.getPratas()));
    }
      
    private void tempoVida() {
        tempo = new Timer(2000, new ActionListener() {//vai esperar 5 segundos e executar essa ação
        @Override
        public void actionPerformed(ActionEvent e) {
            if (personagem.getVida() < 500) {
               personagem.setVida(personagem.getVida() + 10);
               mostrarPersonagem();
        } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Sua vida foi recuperada com sucesso!","Atenção",'i');
                mostrarPersonagem();
                tempo.stop();
                return;
            }
        }
        });
        tempo.start();
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IMAdquirirPratas;
    private javax.swing.JMenuItem IMSobreJogo;
    private javax.swing.JMenuItem IMTelaPersonagem;
    private javax.swing.JMenu MenuLoja;
    private javax.swing.JMenuItem MenuLojaP;
    private javax.swing.JButton btnBau;
    private javax.swing.JButton btnCampoBatalha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAtaqueP;
    private javax.swing.JLabel lblClasseP;
    private javax.swing.JLabel lblImagemP;
    private javax.swing.JLabel lblMoedas;
    private javax.swing.JLabel lblNivelP;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblPratas;
    private javax.swing.JLabel lblTelaPersonagem;
    private javax.swing.JLabel lblVidaP;
    private javax.swing.JMenuItem menuConfiguracoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JLabel txtAtaqueP;
    private javax.swing.JLabel txtClasseP;
    private javax.swing.JLabel txtMoedasP;
    private javax.swing.JLabel txtMoedasP1;
    private javax.swing.JLabel txtNivelP;
    private javax.swing.JLabel txtNomeP;
    private javax.swing.JLabel txtVidaP;
    // End of variables declaration//GEN-END:variables
}
