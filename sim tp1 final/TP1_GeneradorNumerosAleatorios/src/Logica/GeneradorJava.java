/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author matias
 */
public class GeneradorJava implements IGeneradorNumerosAleatorios{

    Random random;
    int semilla;
    
    public int getSemilla(){
        return semilla;
    }
    
    public GeneradorJava() {
        
    }
    
    @Override
    public LinkedList<Double> generarSerie(int semilla, int cantidad) {
        this.semilla = semilla;
        random = new Random(semilla);
        LinkedList<Double> list = new LinkedList<>();
        for (int i = 0; i < cantidad; i++) {
            list.add(random.nextDouble());
        }
        return list;
    }

    @Override
    public double generarNumero(int semilla) {
        this.semilla = semilla;
        random = new Random(semilla);
        return random.nextDouble();
    }

    @Override
    public double generarProximoNumero() {
        if( random == null ) {
            this.semilla = 0;
            return generarNumero(this.semilla);
        } else {
            return random.nextDouble();
        }
    }
    
}
