package poo.midia;

import java.util.Comparator;

public class ComparadorNota implements Comparator<Midia>{
    //Comparar notas
    @Override
    public int compare(Midia o1, Midia o2) {
        if(o1.getNota() < o2.getNota()){
            return 1;
        } else if(o1.getNota() > o2.getNota()){
            return -1;
        } else{
            return 0;
        }
    }
}
