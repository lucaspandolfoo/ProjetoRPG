/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author guilherme.klafki
 */
public class Oponente {
    
    private String nome;
    private int vida;
    private int ataque;
    private String descricao;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return
        "Atributos do Oponente: " + "\n" +
        "Nome: " + nome + "\n" +
        "Vida: " + vida + "\n" +
        "Ataque: " + ataque + "\n" +
        "Descrição: " + descricao + "\n";       
    }
    
}
