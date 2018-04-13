package Logica;

import java.util.LinkedList;

public class GeneradorCongruencialMultiplicativo implements IGeneradorNumerosAleatorios {

    int a, m, xi, semilla = 1;

    public void setA(int a) {
        this.a = a;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public int getM() {
        return m;
    }

    public int getXi() {
        return xi;
    }

    public int getSemilla() {
        return semilla;
    }

    @Override
    public LinkedList<Double> generarSerie(int semilla, int cantidad) {
        this.semilla = semilla;
        this.xi = semilla;
        LinkedList<Double> lista = new LinkedList<>();

        for (int i = 0; i < cantidad; i++) {
            lista.add(generarProximoNumero());
        }

        return lista;
    }

    @Override
    public double generarNumero(int semilla) {
        this.semilla = semilla;
        this.xi = (a * semilla) % m;
        return (double) xi / (double) m;
    }

    @Override
    public double generarProximoNumero() {
        this.xi = (a * this.xi) % m;
        return (double) xi / (double) m;
    }

}
