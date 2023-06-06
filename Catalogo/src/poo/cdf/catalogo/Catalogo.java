package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import poo.cdf.midia.*;

public class Catalogo{
    // Lista das midias
    public List<Midia> midias;
    // Lista de usuarios
    public List<Usuario> usuarios;
    // lista de generos favoritos

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

    // Buscar um midia especifico e obter suas informações
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
    // ----------------------
    
    // Rankear as midias com as melhores avaliacoes
    public void rank(){
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
    // ---------------------

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