package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import poo.cdf.midia.*;

public class Catalogo{
    // Lista das midias
    private List<Midia> midias;
    // lista de generos favoritos

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
        if(midias.isEmpty()){
            System.out.println("Catalogo vazio!");
        }else{
            for (Midia m : midias) {
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
            }
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
    public void buscarMidia(String titulo){
        boolean achou = false;
        if(midias.isEmpty()){
            System.out.println("Catalogo vazio.");
        } else{
            
            for (Midia midia : midias) {
                if (midia.getTitulo() == titulo) {
                    midia.getInformacoes();
                    achou = true;
                }
            }
        }
        if(achou == false){
            System.out.println("Midia não encontrada!");
        }
    }
    // ----------------------
    
    // Rankear as midias com as melhores avaliacoes
    public void ranker(){
        System.out.println("------------------");
        System.out.println("Midias mais bem avaliadas");
        Collections.sort(midias, new ComparadorNota());
        if(midias.isEmpty()) {
            System.out.println("Catalogo vazio!");
        }
        for (int i = 0; i < midias.size(); i++) {
            System.out.println((i+1) + ". " + midias.get(i).getTitulo() + " - " + midias.get(i).getAvaliacao());
        }
        System.out.println("-----------------");
    }
    //-------------------

    // Listar midias por genero
    public void listarMidiasPorGenero(String genero){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo do genero " + genero);
        int achou = 0;
        for (Midia m : midias) {
            if(m.getGenero() == genero){
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                achou++;
            }
        }
        if(achou == 0){
            System.out.println("Nenhuma midia encontrada com esse genero.");
        }
        System.out.println("-----------------\n");
    }
    // ---------------------

    // Metodo para adicionar os generos favoritos

    // Metodo para notificar quando uma midia de um genero favorito for adicionado ao catalogo

    // Metodos para avaliar as midias, fazer crticas e ver criticas
}