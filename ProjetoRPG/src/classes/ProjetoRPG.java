/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import projetorpg.Principal;

/**
 *
 * @author lucas.pandolfo
 */
public class ProjetoRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializações do jogo
        System.out.println("Inicializando o projeto...");
        
        //ABERTURA DA TELA PRINCIPAL
        Principal tela = new Principal();
        tela.setVisible(true);
    }
     
}
