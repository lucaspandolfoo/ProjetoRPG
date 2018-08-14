/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class Usuario {
    private String nome;
    private String senha;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String salvar () {
       try {
           String caminho = new File ("../ProjetoRPG/usuarios/Usuario "+nome.toUpperCase()+".txt").getCanonicalPath();
            FileWriter fw = new FileWriter (caminho);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(nome);
            pw.println(senha);
            pw.println(email);
            pw.println(0);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
      return "Usuário cadastrado com sucesso!";
    }
}
