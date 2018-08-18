/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ferramentas.CaixaDeDialogo;
import modelo.Personagem;
import java.text.DecimalFormat;

/**
 *
 * @author Guilherme Klafki
 */
public class ViewLoja extends javax.swing.JFrame {
    Personagem personagem;

    /**
     * Creates new form ViewLoja
     */
    public ViewLoja(Personagem personagem) {
        initComponents();
         this.personagem = personagem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelaPersonagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblPocaoExp = new javax.swing.JLabel();
        btnComprarExpM = new javax.swing.JButton();
        lblImagemPocaoVida1 = new javax.swing.JLabel();
        btnComprarExpP = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPocaoAtaque = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        lblPocaoAtaque = new javax.swing.JLabel();
        btnComprarAtaqueM = new javax.swing.JButton();
        lblImagemPocaoAtaque = new javax.swing.JLabel();
        btnComprarAtaqueP = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        lblPocaoVida5 = new javax.swing.JLabel();
        btnComprarVidaM = new javax.swing.JButton();
        lblImagemPocaoVida5 = new javax.swing.JLabel();
        btnComprarVidaP = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPocaoExp = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPocaoVida = new javax.swing.JTextArea();
        btnSair1 = new javax.swing.JButton();
        txtMoedasLoja = new javax.swing.JLabel();
        lblMoedasLoja = new javax.swing.JLabel();
        lblPratasLoja = new javax.swing.JLabel();
        txtPratasLoja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblTelaPersonagem.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lblTelaPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelaPersonagem.setText("Tela da Loja");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Poções"));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(220, 145));

        lblPocaoExp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoExp.setText("Poção de Exp");

        btnComprarExpM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coins.png"))); // NOI18N
        btnComprarExpM.setText("$ 600");
        btnComprarExpM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarExpMActionPerformed(evt);
            }
        });

        lblImagemPocaoVida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pocaoExp.png"))); // NOI18N

        btnComprarExpP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pratas.png"))); // NOI18N
        btnComprarExpP.setText("$ 5");
        btnComprarExpP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarExpPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagemPocaoVida1)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprarExpM)
                    .addComponent(btnComprarExpP, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblPocaoExp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblPocaoExp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemPocaoVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnComprarExpM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprarExpP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPocaoAtaque.setEditable(false);
        txtPocaoAtaque.setColumns(20);
        txtPocaoAtaque.setRows(5);
        txtPocaoAtaque.setText("Atribui 100 de ataque no personage. Só pode ser\nutilizado fora de combate");
        txtPocaoAtaque.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtPocaoAtaque);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(220, 145));

        lblPocaoAtaque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoAtaque.setText("Poção de Ataque");

        btnComprarAtaqueM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coins.png"))); // NOI18N
        btnComprarAtaqueM.setText("$ 350");
        btnComprarAtaqueM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAtaqueMActionPerformed(evt);
            }
        });

        lblImagemPocaoAtaque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pocaoAtaque.png"))); // NOI18N

        btnComprarAtaqueP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pratas.png"))); // NOI18N
        btnComprarAtaqueP.setText("$ 2");
        btnComprarAtaqueP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAtaquePActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagemPocaoAtaque)
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnComprarAtaqueM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprarAtaqueP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblPocaoAtaque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblPocaoAtaque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemPocaoAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnComprarAtaqueM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprarAtaqueP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(220, 145));

        lblPocaoVida5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPocaoVida5.setText("Poção de Vida");

        btnComprarVidaM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coins.png"))); // NOI18N
        btnComprarVidaM.setText("$ 350");
        btnComprarVidaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarVidaMActionPerformed(evt);
            }
        });

        lblImagemPocaoVida5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PocaoVidaTop2.png"))); // NOI18N

        btnComprarVidaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pratas.png"))); // NOI18N
        btnComprarVidaP.setText("$ 2");
        btnComprarVidaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarVidaPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagemPocaoVida5)
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnComprarVidaM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprarVidaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblPocaoVida5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblPocaoVida5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemPocaoVida5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnComprarVidaM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComprarVidaP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPocaoExp.setEditable(false);
        txtPocaoExp.setColumns(20);
        txtPocaoExp.setRows(5);
        txtPocaoExp.setText("Aumenta em 50% toda a experiência adquirida. Só pode\nser utilizado fora de combate");
        txtPocaoExp.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtPocaoExp);

        txtPocaoVida.setEditable(false);
        txtPocaoVida.setColumns(20);
        txtPocaoVida.setRows(5);
        txtPocaoVida.setText("Recupera 100 de vida do personage. Só pode ser\nutilizado fora de combate");
        txtPocaoVida.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtPocaoVida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnSair1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sign-error.png"))); // NOI18N
        btnSair1.setText("Sair da Loja");
        btnSair1.setToolTipText("Voltar para tela de seleção");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        txtMoedasLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblMoedasLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMoedasLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coins.png"))); // NOI18N
        lblMoedasLoja.setText("Moedas:");

        lblPratasLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPratasLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pratas.png"))); // NOI18N
        lblPratasLoja.setText("Pratas:");

        txtPratasLoja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTelaPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnSair1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPratasLoja)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPratasLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMoedasLoja)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMoedasLoja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPersonagem)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMoedasLoja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMoedasLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPratasLoja)
                    .addComponent(txtPratasLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnSair1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private void mostrarMoedasLoja() {
    txtMoedasLoja.setText(String.valueOf((personagem.getMoedas())));
    txtPratasLoja.setText(String.valueOf((personagem.getPratas())));
     }
    
    private void btnComprarExpPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarExpPActionPerformed
        // TODO add your handling code here:
         if (personagem.getPratas() >= 5){
            personagem.setPratas(personagem.getPratas() - 5);
            personagem.setPexp(personagem.getPexp() + 1);
            
            System.out.println("Pratas " + personagem.getPratas());
            System.out.println("Poções EXP: " + personagem.getPexp());
        } else{
             CaixaDeDialogo.obterinstancia().exibirMensagem("Você não possui Pratas para essa compra!","Erro",'e');
         } 
  
    }//GEN-LAST:event_btnComprarExpPActionPerformed

    private void btnComprarAtaquePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAtaquePActionPerformed
        // TODO add your handling code here:
        if (personagem.getPratas() >= 2){
             personagem.setPratas(personagem.getPratas() - 2);
             personagem.setPataque(personagem.getPataque() + 1);      
            
             System.out.println("Pratas: " + personagem.getPratas());
             System.out.println("Poções Ataque: " + personagem.getPataque());
        }else{
             CaixaDeDialogo.obterinstancia().exibirMensagem("Você não possui Pratas para essa compra!","Erro",'e');
         }
    }//GEN-LAST:event_btnComprarAtaquePActionPerformed

    private void btnComprarVidaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarVidaPActionPerformed
        // TODO add your handling code here:
        if (personagem.getPratas() >= 2){
             personagem.setPratas(personagem.getPratas() - 2);
             personagem.setPvida(personagem.getPvida() + 1);      
            
             System.out.println("Pratas: " + personagem.getPratas());
             System.out.println("Poções Vida: " + personagem.getPvida());
        }else{
             CaixaDeDialogo.obterinstancia().exibirMensagem("Você não possui Pratas para essa compra!","Erro",'e');
         }
    }//GEN-LAST:event_btnComprarVidaPActionPerformed

    private void btnComprarExpMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarExpMActionPerformed
        // TODO add your handling code here:
         if (personagem.getMoedas() >= 350){
             personagem.setMoedas(personagem.getMoedas() - 350);
             personagem.setPexp(personagem.getPexp() + 1);      
            
             System.out.println("Moedas: " + personagem.getMoedas());
             System.out.println("Poções EXP: " + personagem.getPexp());
        }else{
             CaixaDeDialogo.obterinstancia().exibirMensagem("Você não possui Moedas para essa compra!","Erro",'e');
         }
        
    }//GEN-LAST:event_btnComprarExpMActionPerformed

    private void btnComprarVidaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarVidaMActionPerformed
        // TODO add your handling code here:
        if (personagem.getMoedas() >= 350){
             personagem.setMoedas(personagem.getMoedas() - 350);
             personagem.setPvida(personagem.getPvida() + 1);      
            
             System.out.println("Moedas: " + personagem.getMoedas());
             System.out.println("Poções Vida: " + personagem.getPvida());
        }else{
             CaixaDeDialogo.obterinstancia().exibirMensagem("Você não possui Moedas para essa compra!","Erro",'e');
         }
        
    }//GEN-LAST:event_btnComprarVidaMActionPerformed

    private void btnComprarAtaqueMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAtaqueMActionPerformed
        // TODO add your handling code here:
        if (personagem.getMoedas() >= 350){
             personagem.setMoedas(personagem.getMoedas() - 350);
             personagem.setPataque(personagem.getPataque() + 1);      
            
             System.out.println("Moedas: " + personagem.getMoedas());
             System.out.println("Poções Ataque: " + personagem.getPataque());
        }else{
             CaixaDeDialogo.obterinstancia().exibirMensagem("Você não possui Moedas para essa compra!","Erro",'e');
         }
    }//GEN-LAST:event_btnComprarAtaqueMActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
       this.dispose();
       ViewPersonagem telaP = new ViewPersonagem(personagem);
       telaP.setVisible(true);
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        mostrarMoedasLoja();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(ViewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLoja(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarAtaqueM;
    private javax.swing.JButton btnComprarAtaqueP;
    private javax.swing.JButton btnComprarExpM;
    private javax.swing.JButton btnComprarExpP;
    private javax.swing.JButton btnComprarVidaM;
    private javax.swing.JButton btnComprarVidaP;
    private javax.swing.JButton btnSair1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblImagemPocaoAtaque;
    private javax.swing.JLabel lblImagemPocaoVida1;
    private javax.swing.JLabel lblImagemPocaoVida5;
    private javax.swing.JLabel lblMoedasLoja;
    private javax.swing.JLabel lblPocaoAtaque;
    private javax.swing.JLabel lblPocaoExp;
    private javax.swing.JLabel lblPocaoVida5;
    private javax.swing.JLabel lblPratasLoja;
    private javax.swing.JLabel lblTelaPersonagem;
    private javax.swing.JLabel txtMoedasLoja;
    private javax.swing.JTextArea txtPocaoAtaque;
    private javax.swing.JTextArea txtPocaoExp;
    private javax.swing.JTextArea txtPocaoVida;
    private javax.swing.JLabel txtPratasLoja;
    // End of variables declaration//GEN-END:variables
}