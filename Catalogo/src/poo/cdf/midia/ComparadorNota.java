package poo.cdf.midia;

import java.util.Comparator;

public class ComparadorNota implements Comparator<Midia>{
    //Comparar notas
    @Override
    public int compare(Midia o1, Midia o2) {
        if(o1.getAvaliacao() < o2.getAvaliacao()){
            return -1;   
        } else if(o1.getAvaliacao() > o2.getAvaliacao()){
            return 1;
        } else{
            return 0;
        }
    }
}
