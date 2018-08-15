/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Views.ViewSelecao;
import java.util.Random;

/**
 *
 * @author lucas.pandolfo
 */
public class ProjetoRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random gerador = new Random();
        int valor = 1;
        //Inicializações do jogo
        int numero = gerador.nextInt(5);
        System.out.println("Inicializando o projeto...");
        System.out.println(numero);
       
    }
     
}
