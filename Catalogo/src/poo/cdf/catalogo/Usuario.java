package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;

import poo.cdf.midia.*;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private ArrayList<Midia> favoritos = new ArrayList<>();
    protected List<Midia> midias;

    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Midia> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Midia> favoritos) {
        this.favoritos = favoritos;
    }

    // Buscar uma midia especifica e obter suas informações
    public void pesquisarMidia(String titulo){
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

    public void pesquisarPorAnoDeEstreia(int ano){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo do ano de " + ano + ":");
        int achou = 0;
        for (Midia m : midias) {
            if(m.getAnoDeEstreia() == ano){
                System.out.println(m.getTitulo());
                achou++;
            }
        }
        if(achou == 0){
            System.out.println("Nenhuma midia encontrada.");
        }
        System.out.println("-----------------\n");
    }

    public void pesquisarPorGenero(String genero){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo do genero " + genero + ":");
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

    /* Permitir que os usuários possam pesquisar por filmes e séries utilizando palavras-chave, gênero, ano de lançamento, classificação etária, entre outros filtros.

    Permitir que os usuários possam marcar títulos como favoritos ou adicionar à sua lista de interesse, facilitando a navegação e a escolha do que assistir.

    Permitir que os usuários possam avaliar e escrever críticas sobre os títulos, bem como visualizar as avaliações e críticas de outros usuários.

    Permitir que os usuários possam receber notificações sobre novos lançamentos e títulos adicionados ao catálogo de gêneros marcados como favorito. */
    
}
