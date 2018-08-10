/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ferramentas.CaixaDeDialogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import modelo.Oponente;
import modelo.Personagem;

/**
 *
 * @author lucas.pandolfo
 */
public class ViewConfronto extends javax.swing.JFrame {
   Personagem personagem;
   Oponente oponente = new Oponente();
   Random gerador = new Random();
   public static int ataque = 0;
  public static int ataqueO = 0;
  public static Timer tempo;

    /**
     * Creates new form ViewConfronto
     */
    public ViewConfronto(Personagem personagemEscolhido) {
        initComponents();
        limparLabels();
        this.personagem = personagemEscolhido;
        
        mostrarPersonagem(); //Preenche os dados do personagem
        gerarOponente(); // Gera um novo oponente
        mostrarOponente(); //Preenche os dados do oponente

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeP = new javax.swing.JLabel();
        lblAtaqueP = new javax.swing.JLabel();
        lblVidaP = new javax.swing.JLabel();
        txtNomeP = new javax.swing.JLabel();
        txtAtaqueP = new javax.swing.JLabel();
        txtVidaP = new javax.swing.JLabel();
        lblClasseP = new javax.swing.JLabel();
        txtClasseP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBatalha = new javax.swing.JLabel();
        lblNivelP = new javax.swing.JLabel();
        txtNivelP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAtaqueB = new javax.swing.JLabel();
        lblVidaB = new javax.swing.JLabel();
        txtNomeB = new javax.swing.JLabel();
        txtAtaqueB = new javax.swing.JLabel();
        txtVidaB = new javax.swing.JLabel();
        lblNomeB = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        lblAtaqueDe = new javax.swing.JLabel();
        lblAtkPersonagem = new javax.swing.JLabel();
        lblAtkOponente = new javax.swing.JLabel();
        lblVezOponente = new javax.swing.JLabel();
        lblVezPersonagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        lblNomeP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomeP.setText("Nome:");

        lblAtaqueP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAtaqueP.setText("Ataque:");

        lblVidaP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVidaP.setText("Vida:");

        txtNomeP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNomeP.setText("........................");

        txtAtaqueP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAtaqueP.setText("......");

        txtVidaP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVidaP.setText(".......");

        lblClasseP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClasseP.setText("Classe:");

        txtClasseP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtClasseP.setText(".......................");

        lblBatalha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBatalha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBatalha.setText("Campo de Batalha");

        lblNivelP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNivelP.setText("Nível:");

        txtNivelP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNivelP.setText("......");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        lblAtaqueB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAtaqueB.setText("Ataque:");

        lblVidaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVidaB.setText("Vida:");

        txtNomeB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNomeB.setText("........................");

        txtAtaqueB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAtaqueB.setText("......");

        txtVidaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVidaB.setText(".......");

        lblNomeB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomeB.setText("Nome:");

        btnAtacar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });

        lblAtkPersonagem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblAtkPersonagem.setText("Ataque do Personagem");

        lblAtkOponente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblAtkOponente.setText("Ataque do Oponente");

        lblVezOponente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblVezOponente.setText("Vez de seu oponente atacar");

        lblVezPersonagem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblVezPersonagem.setText("Sua vez de atacar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(lblBatalha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAtacar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblClasseP)
                                            .addComponent(lblNivelP))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClasseP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNivelP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNomeP)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblAtaqueP)
                                                    .addComponent(lblVidaP))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtAtaqueP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtVidaP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(241, 241, 241)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVidaB)
                                    .addComponent(lblAtaqueB))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVidaB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAtaqueB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblNomeB)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblAtaqueDe, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAtkPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVezPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVezOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAtkOponente, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeP)
                            .addComponent(txtNomeP))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClasseP)
                            .addComponent(txtClasseP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNivelP)
                            .addComponent(txtNivelP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtaqueP)
                            .addComponent(txtAtaqueP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVidaP)
                            .addComponent(txtVidaP)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBatalha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeB)
                            .addComponent(txtNomeB))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtaqueB)
                            .addComponent(txtAtaqueB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVidaB)
                            .addComponent(lblVidaB)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblVezPersonagem)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblVezOponente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtkPersonagem)
                    .addComponent(lblAtkOponente))
                .addGap(28, 28, 28)
                .addComponent(lblAtaqueDe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btnAtacar)
                .addGap(89, 89, 89))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        // TODO add your handling code here
        int valorDado = gerador.nextInt(2) + 1;
        if (valorDado == 1) {
        System.out.println("Ataque do seu personagem: " + valorDado);
        lblVezPersonagem.setText("Sua Vez de Atacar");  
        lblVezOponente.setText("");
        lblAtkOponente.setText("");
        ataquePersonagem();
         } else {
        System.out.println("Ataque do seu oponente: "  + valorDado);
        lblVezOponente.setText("É a vez de seu oponente atacar"); 
        lblVezPersonagem.setText("");
        lblAtkPersonagem.setText("");
        ataqueOponente();
        }
        
        //Valida se o oponente já morreu e gera um novo para lutar.
        if (oponente.getVida() > 0) {
        mostrarOponente();
        } else {
        mostrarOponente();
        CaixaDeDialogo.obterinstancia().exibirMensagem("Parabéns, você derrotou o oponente " + oponente.getNome(),"Atenção",'i');
        gerarOponente();
        mostrarOponente();
        
        if (personagem.getVida() < 100) {
        boolean wResposta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Atenção sua vida está abaixo de 100\nDeseja continuar lutando?","Vida",'p');         
        if (wResposta == true) {
        gerarOponente();
        limparLabels();
        mostrarOponente();
        } else {
            limparLabels();
            return;
         }
        }
        }
       
        //Valida se o personagem não ficou sem vida
         if (personagem.getVida() > 0) {
         mostrarPersonagem();
         } else {
         mostrarPersonagem();
         CaixaDeDialogo.obterinstancia().exibirMensagem("Você foi derrotado!\nEsperamos que você esteja mais forte na próxima luta. " + oponente.getNome(),"GAME OVER",'i');
         Principal tela = new Principal();
         tela.setVisible(true);
         this.setVisible(false);
         } 
         
// barra de vida progresso
// array de oponentes
// dado para ver se personagem ou oponente ataca.
   
    }//GEN-LAST:event_btnAtacarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewConfronto(null).setVisible(true);
            }
        });
    }
    
    private Oponente gerarOponente () {
    try {    
    // +1 não deixa gerar 0
    int numero = gerador.nextInt(5) + 1;
    
    if (numero == 1) {
        oponente.setNome("Mandala");
        oponente.setVida(600);
        oponente.setAtaque(200);    
    }
    else if (numero == 2) {
        oponente.setNome("Rei Leão-Dourado");
        oponente.setVida(300);
        oponente.setAtaque(150);    
    }
      else if (numero == 3) {
        oponente.setNome("Corcel do Inferno");
        oponente.setVida(800);
        oponente.setAtaque(300);    
    }
      else if (numero == 4) {
        oponente.setNome("Dragão de Fogo");
        oponente.setVida(400);
        oponente.setAtaque(200);    
    }
      else if (numero == 5) {
        oponente.setNome("Louva-Deus");
        oponente.setVida(500);
        oponente.setAtaque(300);    
    }
        return oponente;
    
    } catch (Exception e) {
        CaixaDeDialogo.obterinstancia().exibirMensagem(e.getMessage().toString(),"ERRO",'e');
        return null;
    }
    }
    
    private void mostrarPersonagem() {
        txtNomeP.setText(personagem.getNome());
        txtClasseP.setText(personagem.getClasse());
        txtNivelP.setText(String.valueOf(personagem.getNivel()));
        txtAtaqueP.setText(String.valueOf(personagem.getAtaque()));
        txtVidaP.setText(String.valueOf(personagem.getVida()));
    }
    
    private void mostrarOponente() {
         //Preenche o Oponente
        txtNomeB.setText(oponente.getNome());
        txtAtaqueB.setText(String.valueOf(oponente.getAtaque()));
        txtVidaB.setText(String.valueOf(oponente.getVida()));
                
    }
    
    private void ataquePersonagem() {
        //Personagem ataca o oponente
       int valorDado = gerador.nextInt(20) + 1;
        if (valorDado > 13) { //Ataque Critico 
           ataque = personagem.getAtaque() / 2;
        } else {
            ataque = personagem.getAtaque() / 3;
        }
        System.out.println("DADO = " + valorDado);
        System.out.println("Ataque = " + ataque);
        
        lblAtkPersonagem.setText("Seu ataque foi de: " + ataque);
        
        int vidaRestante = (oponente.getVida() - ataque);
        System.out.println("Vida restante do Oponente: " + vidaRestante);
        oponente.setVida(vidaRestante);   
  }
    private void ataqueOponente() {
        //Oponente ataca o personagem
        int valorDado = gerador.nextInt(20) + 1;
        if (valorDado > 18) { //Ataque Critico 
            ataque = oponente.getAtaque() / 2;
        } else {
            ataque = oponente.getAtaque() / 4;
        }
        System.out.println("DADO = " + valorDado);
        System.out.println("Ataque = " + ataque);
        
       //Vez do ataque e tempo    
        lblAtkOponente.setText("O ataque do seu oponente foi de: " + ataque);

        int vidaRestante = personagem.getVida() - ataque;
        System.out.println("Vida restante do Personagem: " + vidaRestante);
        personagem.setVida(vidaRestante);   
  }
    
    public void limparLabels() {
        lblAtkPersonagem.setText("");
        lblAtkOponente.setText("");
        lblVezPersonagem.setText("");
        lblVezOponente.setText("");    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAtaqueB;
    private javax.swing.JLabel lblAtaqueDe;
    private javax.swing.JLabel lblAtaqueP;
    private javax.swing.JLabel lblAtkOponente;
    private javax.swing.JLabel lblAtkPersonagem;
    private javax.swing.JLabel lblBatalha;
    private javax.swing.JLabel lblClasseP;
    private javax.swing.JLabel lblNivelP;
    private javax.swing.JLabel lblNomeB;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblVezOponente;
    private javax.swing.JLabel lblVezPersonagem;
    private javax.swing.JLabel lblVidaB;
    private javax.swing.JLabel lblVidaP;
    private javax.swing.JLabel txtAtaqueB;
    private javax.swing.JLabel txtAtaqueP;
    private javax.swing.JLabel txtClasseP;
    private javax.swing.JLabel txtNivelP;
    private javax.swing.JLabel txtNomeB;
    private javax.swing.JLabel txtNomeP;
    private javax.swing.JLabel txtVidaB;
    private javax.swing.JLabel txtVidaP;
    // End of variables declaration//GEN-END:variables
}
