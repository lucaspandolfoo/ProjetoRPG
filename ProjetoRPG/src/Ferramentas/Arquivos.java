/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;
    
import java.io.*;

/**
 *
 * @author Lucas
 */
public class Arquivos {
	public static void main(String[] args) {
		
	}
        
	public static void escrever(String path, String texto) {
		try {
			// O parametro é que indica se deve sobrescrever ou continua no
			// arquivo.
			FileWriter fw = new FileWriter(path, false);
			BufferedWriter conexao = new BufferedWriter(fw);
			conexao.write(texto);
			conexao.newLine();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
   
