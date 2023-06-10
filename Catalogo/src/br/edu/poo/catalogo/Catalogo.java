package poo.catalogo;

import java.util.ArrayList;
import java.util.Collections;

import poo.midia.*;

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
    public void listarObras(){
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
    // ------------------
    
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

    // Listar usuarios: login
    public void listarUsuarios(){
        System.out.println("\n----- Usuarios -----");
        for (Usuario u : usuarios) {
            System.out.println(u.getLogin());
        }
    }
    
}