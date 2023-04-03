package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;

import poo.cdf.midia.Midia;

public class Catalogo {
    private List<Midia> midias; // cria uma lista de midias

    public Catalogo(){
        midias = new ArrayList<>();
    }

    // Adicionar um filme ao catalogo
    public void adicionarMidia(Midia f){
        midias.add(f);
        System.out.println("Midia " + f.getTitulo() + " adicionado ao catalogo.");
    }

    // Listar todos os midias presentes
    public void listarMidias(){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo:");
        for (int i = 0; i < midias.size() ; i++) {
            System.out.println(midias.get(i).getTitulo());
        }
        System.out.println("-----------------\n");
    }

    // Remover um midia do catalogo
    public void excluirMidia(Midia f){
        if(midias.isEmpty()){
            System.out.println("Catalogo vazio!");
        } else{
            for (int i = 0; i < midias.size(); i++) {
                if(midias.get(i) == f){
                    midias.remove(f);
                }
            }
            System.out.println("O midia foi removido.");
        }
    }

    // Buscar um midia especifico e obter suas informações
    public void buscar(Midia f){
        for (Midia midia : midias) {
            if (midia.equals(f)) {
                f.getInformacoes();
            } else{
                System.out.println("Midia não encontrado no catalogo.");
            }
        }
    }

}
