package filmes;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Filme> filmes;

    public Catalogo(){
        filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme f){
        filmes.add(f);
        System.out.println("Filme " + f.getTitulo() + " adicionado ao catalogo.");
    }

    public void listarFilmes(){
        System.out.println("\n-----------------");
        System.out.println("Filmes no catalogo:");
        for (int i = 0; i < filmes.size() ; i++) {
            System.out.println(filmes.get(i).getTitulo());
        }
        System.out.println("-----------------\n");
    }

    public void excluirFilme(Filme f){
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

    /* public Filme buscar(Filme f){
           
    } */

}
