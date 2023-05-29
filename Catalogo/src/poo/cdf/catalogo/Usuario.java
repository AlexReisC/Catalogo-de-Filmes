package poo.cdf.catalogo;

import java.util.ArrayList;
import poo.cdf.midia.*;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private ArrayList<Midia> favoritos = new ArrayList<>();

    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    // Marcar midias como favoritas
    public void favoritar(Midia m){
        favoritos.add(m);
    }

    public void listarFavoritos(){
        if(favoritos.isEmpty()){
            System.out.println("Sem favoritos adicionados");
        } else{
            System.out.println("Seus favoritos");
            for (Midia fav : favoritos) {
                System.out.println("Titulo: " + fav.getTitulo() + " - " + fav.getGenero() + " (" + fav.getAnoDeEstreia() + ")");
            }
            System.out.println("------------------\n");
        }
    }

    /* Permitir que os usuários possam pesquisar por filmes e séries utilizando palavras-chave, gênero, ano de lançamento, classificação etária, entre outros filtros.

    Permitir que os usuários possam marcar títulos como favoritos ou adicionar à sua lista de interesse, facilitando a navegação e a escolha do que assistir.

    Permitir que os usuários possam avaliar e escrever críticas sobre os títulos, bem como visualizar as avaliações e críticas de outros usuários.

    Permitir que os usuários possam receber notificações sobre novos lançamentos e títulos adicionados ao catálogo de gêneros marcados como favorito. */
    
}
