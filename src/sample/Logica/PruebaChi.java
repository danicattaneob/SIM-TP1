package sample.Logica;

public class PruebaChi {

    private double[] serie;
    private int[] vectorFrecObt;
    private int t; //Intervalos
    private int n; //Tam Muestra
    private int FE; //Frecuencia esperada

    public PruebaChi(int t, int n) {
        this.serie = new double[n];
        this.vectorFrecObt = new int[t];
        this.t = t;
        this.n = n;
        this.FE = n / t;
    }

    public void addSerie(double x, int i) {
        serie[i] = x;
    }

    public void addVectorFO() {
        double max = maxValue();
        double min = minValue();
        double rango = (max - min) / t;
        for (int i = 0; i < vectorFrecObt.length; i++) {
            int k = 0;
            for (int j = 0; j < serie.length; j++) {
                if ((min + (i * rango)) < serie[j] && (min + ((i + 1) * rango)) >= serie[j]) {
                    k++;
                }
            }
            vectorFrecObt[i] = k;
        }
    }

    public boolean cumplePrueba() {
        double chiCalc=0;
        for (int i = 0; i < vectorFrecObt.length; i++) {
            chiCalc+=((int) Math.pow((double) (vectorFrecObt[i]-FE) , (int) 2))/FE;            
        }
        //Revisar
        if (chiCalc<=43.8) {
            return true;
        } else {
            return false;
        }
    }

    //AUXILIARES
    
    public double maxValue() {
        double max = serie[0];
        for (int i = 0; i < serie.length; i++) {
            if (serie[i] > max) {
                max = serie[i];
            }
        }
        return max;
    }

    public double minValue() {
        double min = serie[0];
        for (int i = 0; i < serie.length; i++) {
            if (serie[i] < min) {
                min = serie[i];
            }
        }
        return min;
    }
    

    public String toString1() {
        String salida1 = "";
        for (int i = 0; i < serie.length; i++) {
            salida1 += ";" + serie[i];
        }
        return salida1;
    }

    public String toString() {
        String salida1 = "";
        for (int i = 0; i < vectorFrecObt.length; i++) {
            salida1 += ";" + vectorFrecObt[i];
        }
        return salida1;
    }
}
