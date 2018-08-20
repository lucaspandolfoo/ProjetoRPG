/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lucas.pandolfo
 */
public class Personagem {
    
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int ataque;
    private int bau;
    private double moedas;
    private int experiencia;
    private int pratas;
    private int pvida;
    private int pataque;
    private int pexp;

    public int getPvida() {
        return pvida;
    }

    public void setPvida(int pvida) {
        this.pvida = pvida;
    }


    public int getPataque() {
        return pataque;
    }

    public void setPataque(int pataque) {
        this.pataque = pataque;
    }

    public int getPexp() {
        return pexp;
    }

    public void setPexp(int pexp) {
        this.pexp = pexp;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public int getBau() {
        return bau;
    }

    public void setBau(int bau) {
        this.bau = bau;
    }

    public double getMoedas() {
        return moedas;
    }

    public void setMoedas(double moedas) {
        this.moedas = moedas;
    }

    public int getPratas() {
        return pratas;
    }

    public void setPratas(int pratas) {
        this.pratas = pratas;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
    
    public String toString() {
        return
        "Classe: " + classe + "\n" +
        "Nível: " + nivel + "\n" +
        "Vida: " + vida + "\n" +
        "Ataque: " + ataque + "\n" +
        "Moedas: " + moedas + "\n";   
    }
    
}
