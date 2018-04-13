/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import UI.VentanaPrincipal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author matias
 */
public class Gestor {

    public static final int GENERADOR_JAVA = 0;
    public static final int GENERADOR_CONGRUENCIAL_MIXTO = 1;
    public static final int GENERADOR_CONGRUENCIAL_MULTIPLICATIVO = 2;
    private IGeneradorNumerosAleatorios generadorCongruencialCU01;    
    public Gestor() {
        iniciarEjecucion();
    }
    
    private void iniciarEjecucion(){
        VentanaPrincipal vtn = new VentanaPrincipal(this);
        vtn.setVisible(true);
    }
    
    public ListaFrecuenciaIntervalo generarFrecuenciasJiCuadrado( 
            int metodo, 
            int tamanio, 
            int intervalos, 
            int sensibilidad,
            int a,
            int c,
            int m,
            int semilla
    ){
        IGeneradorNumerosAleatorios generador;
        if( metodo == GENERADOR_JAVA ) {
            generador = new GeneradorJava();
            
        } else {
            generador = new GeneradorCongruencialMixto();
            ((GeneradorCongruencialMixto) generador).setA(a); 
            ((GeneradorCongruencialMixto) generador).setC(c);
            ((GeneradorCongruencialMixto) generador).setM(m);
        }
        /*
        long t1, t2;
        t1 = System.currentTimeMillis();
        LinkedList<Double> numeros = generador.generarSerie(semilla, tamanio);
        double k = 1.0 / (double) intervalos;
        
        int vector[] = new int[intervalos];
        for (int i = 0; i < intervalos; i++) vector[i] = 0;
        
        for (Double num: numeros) {
            int j = 0;
            double t = k;
            while(num > t) {
                t += k;
                j += 1;
            }
            vector[j] += 1;
        }
        t2 = System.currentTimeMillis();
        */
        // No usamos el metodo que devuelve la lista enlazada porque requiere mantener todos los numeros en memoria para después procesarlos.
        // Optamos por usar el método que devuelve el próximo número, decidimos a qué intervalo va, y generamos el próximo apuntandolo con la misma referencia.
        long t1, t2;
        t1 = System.currentTimeMillis();
        double k = 1.0 / (double) intervalos;
        
        int vector[] = new int[intervalos];
        for (int i = 0; i < intervalos; i++) vector[i] = 0;
        
        double num = generador.generarNumero(semilla);
        for (int i = 0; i < tamanio; i++) {
            int j = 0;
            double t = k;
            while(num > t) {
                t += k;
                j += 1;
            }
            vector[j] += 1;
            num = generador.generarProximoNumero();
        }
        t2 = System.currentTimeMillis();
        
        //System.out.println( TimeUnit.MILLISECONDS.toSeconds(t1-t2) );
        return new ListaFrecuenciaIntervalo(vector, sensibilidad);
    }
    
    /**
     * El siguiente método genera una lista de enteros aleatorios.
     * @param metodo: el metodo que se usará para generar los numeros, debe ser una constante de las que están definidas en el gestor.
     * @param tamanio: la cantidad de enteros aleatorios que genera el método.
     * @param semilla: la semilla del método.
     * @param a: constante del método.
     * @param c: constante del método.
     * @param m: constante del método.
     * @param maximo: numero máximo que la serie debe generar.
     * @return Una LinkedList del tamanio solicitado con los numeros enteros creados.
     */
    public LinkedList<Double> generarSerieEnterosAleatorios(
            int metodo,
            int tamanio,
            int semilla, 
            int a,
            int c,
            int m,
            double maximo//@CHANGE
    ) {
        if (metodo == GENERADOR_CONGRUENCIAL_MULTIPLICATIVO) {
            this.generadorCongruencialCU01 = new GeneradorCongruencialMultiplicativo();
            ((GeneradorCongruencialMultiplicativo) this.generadorCongruencialCU01).setA(a);
            ((GeneradorCongruencialMultiplicativo) this.generadorCongruencialCU01).setM(m);
        } else if (metodo == GENERADOR_CONGRUENCIAL_MIXTO) {
            this.generadorCongruencialCU01 = new GeneradorCongruencialMixto();
            ((GeneradorCongruencialMixto) this.generadorCongruencialCU01).setA(a);
            ((GeneradorCongruencialMixto) this.generadorCongruencialCU01).setC(c);
            ((GeneradorCongruencialMixto) this.generadorCongruencialCU01).setM(m);
        }

        LinkedList<Double> numeros = this.generadorCongruencialCU01.generarSerie(semilla, tamanio);//@CHANGE
        
        LinkedList<Double> numerosEnteros = new LinkedList<>();//@CHANGE
        for (Double numero: numeros) { //@CHANGE
            numerosEnteros.add((double)(numero * maximo));//@CHANGE
        }    
        /**
         * System.out.println("Metodo " +  metodo);
        System.out.println("Tamaño " + tamanio);
        System.out.println("Semilla " + semilla);
        System.out.println("a " + a);
        System.out.println("c " + c);
        System.out.println("m " + m);
        System.out.println("maximo " + maximo);
         */
        
        
        return numerosEnteros;
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * El siguiente método devuelve el proximo numero entero creado por el generador pasado como parámetro.
     * @param maximo: el entero debe ser menor al maximo.
     * @return
     */
    public Double generarProximoEntero(Double maximo){
        //Este método debe invocar al generarProximoNumero(), multipliocarlo por el maximo y devolverlo en formato int.
        //System.out.println(maximo);
        return (Double) (this.generadorCongruencialCU01.generarProximoNumero() * maximo);           
    }
    
    public int generarCAutomatico(int m) {
        if (m < 0) return 0;
        BigInteger bi = new BigInteger( "" + m );
        return bi.nextProbablePrime().intValue();
    }
    
}
