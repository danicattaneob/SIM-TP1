/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author matias
 */
public class Item {
    private String intervalo;
    private int frecuencia;

    public Item(String intervalo, int frecuencia) {
        this.intervalo = intervalo;
        this.frecuencia = frecuencia;
    }

    public String getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String toString() {
        return "(" + intervalo + "): " + frecuencia;
    }
}
