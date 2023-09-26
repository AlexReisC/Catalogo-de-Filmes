package poo.catalogo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import poo.midia.*;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private boolean logado = false;
    private ArrayList<Midia> favoritos;
    Scanner scan;

    public Usuario(String nome){
        this.nome = nome;
        favoritos = new ArrayList<>();
        scan = new Scanner(System.in);
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

    // Adicionar um titulo aos favoritos
    public void favoritar(String nome, ArrayList<Midia> midias){
        boolean achou = false;
        for (Midia midia : midias) {
            if (midia.getTitulo().equalsIgnoreCase(nome)) {
                favoritos.add(midia);
                achou = true;
                System.out.println("Adicionado aos favoritos!");
            }
        }
        if (!achou) {
            System.out.println("Obra não encontrada :(");
        }
    }

    // Listar favoritos
    public void listarFavoritos(){
        if(favoritos.isEmpty()){
            System.out.println("Você ainda não adicionou nenhum favorito");
        } else{
            System.out.println("*   FAVORITOS   *");
            for (Midia m : favoritos) {
                System.out.println(m.getTitulo());
            }
        }
    }

    // Buscar uma obra pelo ano de estreia
    public void pesquisarPorAnoDeEstreia(int ano, ArrayList<Midia> midias){
        boolean achou = false;
        if (midias.isEmpty()) {
            System.out.println("Catalogo vazio T_T");
        } else {
            System.out.println("\n-----------------\nObras do ano " + ano + ":");

            for (Midia m : midias) {
                if (m.getAnoDeEstreia() == ano) {
                    System.out.println(m.getTitulo());
                    achou = true;
                }
            }
        }
        if(!achou){
            System.out.println("Nenhuma obra encontrada.\n-----------------");
        }
    }

    // Buscar uma obra por um genero especifico
    public void pesquisarPorGenero(String genero, ArrayList<Midia> midias){
        boolean achou = false;
        if(midias.isEmpty()){
            System.out.println("Catalogo vazio T_T");
        }else{
            System.out.println("\n-----------------\nObras do genero " + genero + ":");

            for (Midia m : midias) {
                if (m.getGenero().equalsIgnoreCase(genero)) {
                    System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                    achou = true;
                }
            }
        }
        if(!achou){
            System.out.println("Nenhuma obra encontrada.\n-----------------");
        }
    }

    // Buscar uma obra pela classificacao etaria
    public void pesquisarPorClassificao(int idade, ArrayList<Midia> midias){
        boolean achou = false;
        if (midias.isEmpty()) {
            System.out.println("Catalogo vazio T_T");
        } else {
            System.out.println("\n-----------------\nObras com classificação indicativa de " + idade + ":");

            for (Midia m : midias) {
                if (m.getClassificacaoEtaria() == idade) {
                    System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                    achou = true;
                }
            }
        }
        if(!achou){
            System.out.println("Nenhuma obra encontrada.\n-----------------");
        }
    }

    // Buscar uma obra por uma plavra chave
    public void pesquisarPalavraChave(String palavra, ArrayList<Midia> midias){
        boolean achou = false;
        if (midias.isEmpty()) {
            System.out.println("Catalogo vazio T_T");
        } else {
            System.out.println("\n-----------------\nObras encontradas: ");
            for (Midia m : midias) {
                if (m.getTitulo().contains(palavra)) {
                    System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                    achou = true;
                }
            }
        }
        
        if(!achou){
            System.out.println("Nenhuma obra encontrada.\n----------------");
        }
    }

    // -----------------------

    // Avaliar uma obra especifica
    public void avaliar(Midia m){
        if(logado == true){
            System.out.println("\n--- Avaliar obra ---");
            System.out.println("Critica: ");
            m.setCritica(scan.nextLine());

            try {
                System.out.println("Nota: ");
                m.setNota(scan.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Digite um numero ponto flutuante ('8,5')");
                m.setNota(scan.nextDouble());
            }
        } else{
            System.out.println("Faça login para avaliar.");
        }

    }

    // Usuario se cadastra no catalogo
    public void cadastrar(ArrayList<Usuario> u, String login, String senha){
        this.login = login;
        this.senha = senha;
        u.add(this);
    }

    // Usuario faz login no catalogo
    public void login(Catalogo catalogo, String login, String senha){
        if (this.login.equals(login) && this.senha.equals(senha)) {
            logado = true;
            System.out.println("Login realizado!");
        } else {
            System.out.println("Login ou senha incorretos. Tente novamente.");
        }
    }

}
