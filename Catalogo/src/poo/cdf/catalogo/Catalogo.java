package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import poo.cdf.midia.*;

public class Catalogo{
    // Lista das midias
    public ArrayList<Midia> midias;
    // Lista de usuarios
    public ArrayList<Usuario> usuarios;

    public Catalogo(){
        midias = new ArrayList<Midia>();
        usuarios = new ArrayList<Usuario>();
    }

    // Adicionar uma midia ao catalogo
    // ADMINISTRADOR
    public void adicionarMidia(Midia m){
        // verificar se é o administrador
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
    // ADMINISTRADOR
    public void excluirMidia(Midia m){
        if(midias.isEmpty()){
            System.out.println("Catalogo de midias vazio!");
        } else{
            midias.remove(m);
            System.out.println(m.getTitulo() + " foi removido.");
        }
    }
    // --------------------
    
    // Rankear as midias com as melhores avaliacoes
    public void rank(){
        System.out.println("------------------");
        System.out.println("Midias mais bem avaliadas");
        Collections.sort(midias, new ComparadorNota());
        if(midias.isEmpty()) {
            System.out.println("Catalogo vazio!");
        }
        for (int i = 0; i < midias.size(); i++) {
            System.out.println((i+1) + ". " + midias.get(i).getTitulo() + " - " + midias.get(i).getNota());
        }
        System.out.println("-----------------");
    }
    //-------------------

    
    public List<Midia> getLista(){
        return midias;
    }

    // Lista de usuarios: login e senha
    /* public void Logar(Usuario usuario){
        for (Usuario u : usuarios) {
            if(u.getLogin().equals(usuario.getLogin()) && u.getSenha().equals(usuario.getSenha())){
                usuario.midias = getLista();
            }
        }
    } */

    /* FUNCIONALIDADES
    Permitir que os usuários possam pesquisar por filmes e séries utilizando palavras-chave, gênero, ano de lançamento, classificação etária, entre outros filtros.

    Permitir que os administradores do sistema possam cadastrar novos títulos, incluindo informações como nome, sinopse, elenco, diretor, gênero, classificação, entre outras informações relevantes.

    Permitir que os usuários possam marcar títulos como favoritos ou adicionar à sua lista de interesse, facilitando a navegação e a escolha do que assistir.

    Permitir que os usuários possam avaliar e escrever críticas sobre os títulos, bem como visualizar as avaliações e críticas de outros usuários.

    Permitir que os usuários possam receber notificações sobre novos lançamentos e títulos adicionados ao catálogo de gêneros marcados como favorito.

 */
}