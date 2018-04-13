/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.LinkedList;

/**
 *
 * @author matias
 */
public class GeneradorCongruencialMixto implements IGeneradorNumerosAleatorios {

    private int semilla = 0;
    private int a, c, m, xi;
    
    
    public int getSemilla() {
        return semilla;
    }

    public int getXi(){
        return xi;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    
   @Override
    public LinkedList<Double> generarSerie(int semilla, int cantidad) {
        this.semilla = semilla;
        this.xi = semilla;
        LinkedList<Double> list = new LinkedList<>();
        
        for (int i = 0; i < cantidad; i++) {            
            list.add(generarProximoNumero());            
        }
        return list;    
    }

    @Override
    public double generarNumero(int semilla) {
       this.semilla = semilla;
       this.xi = ( (a * semilla) + c) % m;
       return (double) xi/ (double) m;
    }

    @Override
    public double generarProximoNumero() {
       this.xi = ( (a * xi) + c) % m;
       return (double) xi/ (double) m;       
    }
   
 }
