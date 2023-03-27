package filmes;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Filme> filmes;
    
    public Catalogo(List<Filme> f){
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme f){
        filmes.add(f);
        System.out.println("Filme adicionado ao catalogo!");
    }

    public void listarFilmes(){
        
    }

    public Filme buscar(Filme f){
           
    }

}
