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
public interface IGeneradorNumerosAleatorios {
    
    public LinkedList<Double> generarSerie(int semilla, int cantidad);
    public double generarNumero(int semilla);
    public double generarProximoNumero();
    
}
