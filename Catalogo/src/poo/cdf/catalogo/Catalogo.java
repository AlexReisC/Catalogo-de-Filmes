package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;

import poo.cdf.midia.Midia;

public class Catalogo {
    private List<Midia> filmes; // cria uma lista de midias

    public Catalogo(){
        filmes = new ArrayList<>();
    }

    // Adicionar um filme ao catalogo
    public void adicionarFilme(Midia f){
        filmes.add(f);
        System.out.println("Filme " + f.getTitulo() + " adicionado ao catalogo.");
    }

    // Listar todos os filmes presentes
    public void listarFilmes(){
        System.out.println("\n-----------------");
        System.out.println("Filmes no catalogo:");
        for (int i = 0; i < filmes.size() ; i++) {
            System.out.println(filmes.get(i).getTitulo());
        }
        System.out.println("-----------------\n");
    }

    // Remover um filme do catalogo
    public void excluirFilme(Midia f){
        if(filmes.isEmpty()){
            System.out.println("Catalogo vazio!");
        } else{
            for (int i = 0; i < filmes.size(); i++) {
                if(filmes.get(i) == f){
                    filmes.remove(f);
                }
            }
            System.out.println("O filme foi removido.");
        }
    }

    // Buscar um filme especifico e obter suas informações
    public void buscar(Midia f){
        for (Midia filme : filmes) {
            if (filme.equals(f)) {
                f.getInformacoes();
            } else{
                System.out.println("Filme não encontrado no catalogo.");
            }
        }
    }

}
