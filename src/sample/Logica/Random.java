package sample.Logica;

public class Random {

    private int g;
    private int k;
    private int c;
    private int i;
    private int x0;
    private int m;
    private int a;


    //Congruencial Mixto
    public Random(int g, int k, int c, int x0) {
        this.g = g;
        this.k = k;
        this.c = c;
        this.i = 1;
        this.x0 = x0;
        this.m = (int) Math.pow((double) 2, (double) g);
        this.a = 1 + (4 * k);
    }


    //Congruencial Multiplicativo
    public Random(int g, int k, int x0) {
        this.g = g;
        this.k = k;
        this.c = 0; //Esto es para que sea congruencial multiplicativo
        this.i = 1;
        this.x0 = x0;
        this.m = (int) Math.pow((double) 2, (double) g);
        this.a = 3 + (8 * k);
    }

    public int obtenerAleatorio(){
        x0 = (a * x0 + c) % m;
        i++;
        int ri = (int)(((double) x0 / ((double) m )) * 10000);
        return ri;
    }

}