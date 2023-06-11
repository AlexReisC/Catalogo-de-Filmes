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
        if (midias.isEmpty()) {
            System.out.println("Catalogo vazio T_T");
        } else{
            System.out.println("\n-----------------\nObras no catalogo:");
            for (Midia m : midias) {
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
            }
        }
        System.out.println("-----------------");
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
        if(usuarios.isEmpty()){
            System.out.println("Sem usuarios T_T");
        } else{
            System.out.println("\n----- Usuarios -----");
            for (Usuario u : usuarios) {
                System.out.println(u.getLogin());
            }
        }
    }
    
}