/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.text.NumberFormat;
import java.util.LinkedList;

/**
 *
 * @author matias
 */
public class ListaFrecuenciaIntervalo {
    
    LinkedList<Item> list;

    public ListaFrecuenciaIntervalo( int[] vector, int sensibilidad) {
        this.list = new LinkedList<>();
        
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(sensibilidad);
        nf.setMinimumFractionDigits(sensibilidad);
        double k = 1.0 / (double) vector.length;
        double limites = 0.0;
        
        for(int n : vector) {
            String s = "" +  nf.format(limites);
            s += "; ";
            limites += k;
            s += nf.format(limites - 1.0 * Math.pow(10.0, -1.0 * sensibilidad ));
            
            Item i = new Item(s, n);
            this.list.add(i);
        }
        
    }

    public LinkedList<Item> getList() {
        return list;
    }
    
    public String toString() {
        String s = "";
        for(Item i: this.list) {
            s += i.toString();
            if(this.list.iterator().hasNext())
                s += '\n';
        }
        return s;
    }
    
}
