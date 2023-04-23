package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import poo.cdf.midia.*;

public class Catalogo{
    // Lista das midias
    private List<Midia> midias;

    public Catalogo(){
        midias = new ArrayList<Midia>();
    }

    // Adicionar uma midia ao catalogo
    public void adicionarMidia(Midia m){
        midias.add(m);
    }
    // -------------------
    
    // Listar todas as midias presentes
    public void listarMidias(){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo:");
        for (Midia m : midias) {
            System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
        }
        System.out.println("-----------------\n");
    }
    // --------------------

    // Remover um midia do catalogo
    public void excluirMidia(Midia m){
        if(midias.isEmpty()){
            System.out.println("Catalogo de midias vazio!");
        } else{
            midias.remove(m);
            System.out.println(m.getTitulo() + " foi removido.");
        }
    }
    // --------------------

    // Buscar um midia especifico e obter suas informações
    public void buscarMidia(Midia m){
        if(midias.isEmpty()){
            System.out.println("Catalogo vazio.");
        }
        for (Midia midia : midias) {
            if (midia.equals(m)) {
                m.getInformacoes();
            }
        }
    }
    // ----------------------
    
    // Rankear as midias com as melhores avaliacoes
    public void ranker(){
        System.out.println("------------------");
        System.out.println("Midias mais bem avaliadas");
        Collections.sort(midias, new ComparadorNota());
        for (int i = 0; i < midias.size(); i++) {
            System.out.println((i+1) + ". " + midias.get(i).getTitulo() + " - " + midias.get(i).getAvaliacao());
        }
        System.out.println("-----------------");
    }

}