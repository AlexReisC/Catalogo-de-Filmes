package poo.cdf.catalogo;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private ArrayList<Midias> favoritos = new ArrayList<>();

    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    /* Permitir que os usuários possam pesquisar por filmes e séries utilizando palavras-chave, gênero, ano de lançamento, classificação etária, entre outros filtros.

    Permitir que os usuários possam marcar títulos como favoritos ou adicionar à sua lista de interesse, facilitando a navegação e a escolha do que assistir.

    Permitir que os usuários possam avaliar e escrever críticas sobre os títulos, bem como visualizar as avaliações e críticas de outros usuários.

    Permitir que os usuários possam receber notificações sobre novos lançamentos e títulos adicionados ao catálogo de gêneros marcados como favorito. */
}
