package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.Collections;

import poo.cdf.midia.*;

public class Catalogo{
    // Lista dos titulos do tipo Midia
    public ArrayList<Midia> midias;
    // Lista de usuarios
    public ArrayList<Usuario> usuarios;

    public Catalogo(){
        midias = new ArrayList<Midia>();
        usuarios = new ArrayList<Usuario>();
    }
    
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

    // Lista de usuarios: login e senha
    /* public void Logar(Usuario usuario){
        for (Usuario u : usuarios) {
            if(u.getLogin().equals(usuario.getLogin()) && u.getSenha().equals(usuario.getSenha())){
                usuario.midias = getLista();
            }
        }
    } */

    // Mostrar as avaliacoes dde cada titulo

    /* FUNCIONALIDADES
    Permitir que os usuários possam receber notificações sobre novos lançamentos e títulos adicionados ao catálogo de gêneros marcados como favorito. */
}