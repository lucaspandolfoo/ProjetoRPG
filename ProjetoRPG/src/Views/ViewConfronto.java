/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ferramentas.CaixaDeDialogo;
import java.util.Random;
import modelo.Oponente;
import modelo.Personagem;

/**
 *
 * @author lucas.pandolfo
 */
public class ViewConfronto extends javax.swing.JFrame {
   Personagem personagem;
   Oponente oponente;
   Random gerador = new Random();

    /**
     * Creates new form ViewConfronto
     */
    public ViewConfronto(Personagem personagemEscolhido) {
        initComponents();
        this.personagem = personagem;
        mostrarPersonagem();
        mostrarOponente();
        gerarOponente();

       
       
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 700));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(lblBatalha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtacar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClasseP)
                                    .addComponent(lblNivelP))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClasseP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNivelP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(279, 279, 279))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblAtaqueDe, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(254, 254, 254)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVidaB)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAtaqueB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVidaB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAtaqueB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeB)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBatalha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNomeB)
                                    .addComponent(txtNomeB))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAtaqueB)
                                    .addComponent(txtAtaqueB))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVidaB)
                                    .addComponent(txtVidaB)))))
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
                            .addComponent(txtVidaP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(lblAtaqueDe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(btnAtacar)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        // TODO add your handling code here
        
        //Valida se o oponente já morreu e gerar um novo para lutar.
        if (oponente.getVida() > 0) {
        mostrarOponente();
        } else {
        gerarOponente();
        mostrarOponente();
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
    Oponente oponente = new Oponente();
    // +1 não deixa gerar 0
    int numero = gerador.nextInt(6) + 1;
    
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
        oponente.setAtaque(600);    
    }
      else if (numero == 4) {
        oponente.setNome("Dragão de Fogo");
        oponente.setVida(400);
        oponente.setAtaque(400);    
    }
      else if (numero == 5) {
        oponente.setNome("Louva-Deus Maligno");
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
         //Prenchee o Oponente
        Oponente oponenteSelecionado = gerarOponente();
        txtNomeB.setText(oponente.getNome());
        txtAtaqueB.setText(String.valueOf(oponente.getAtaque()));
        txtVidaB.setText(String.valueOf(oponente.getVida()));
                
    }
    
    private void ataque() {
        //Personagem ataca o oponente
        int ataque = personagem.getAtaque();
        int valorDado = gerador.nextInt(20) + 1;
        if (valorDado > 13) { //Ataque Critico 
            ataque = personagem.getAtaque() / 2;
        } else {
             ataque = personagem.getAtaque() / 3;
        }
        System.out.println("DADO = " + valorDado);
        System.out.println("Ataque" + ataque);
        
        int vidaRestante = oponente.getVida() - personagem.getAtaque();
        oponente.setVida(vidaRestante);
      
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAtaqueB;
    private javax.swing.JLabel lblAtaqueDe;
    private javax.swing.JLabel lblAtaqueP;
    private javax.swing.JLabel lblBatalha;
    private javax.swing.JLabel lblClasseP;
    private javax.swing.JLabel lblNivelP;
    private javax.swing.JLabel lblNomeB;
    private javax.swing.JLabel lblNomeP;
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