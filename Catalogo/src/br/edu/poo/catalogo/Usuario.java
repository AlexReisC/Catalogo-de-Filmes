package poo.catalogo;

import java.util.ArrayList;
import java.util.Scanner;
import poo.midia.*;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private ArrayList<Midia> favoritos;

    public Usuario(String nome){
        this.nome = nome;
        favoritos = new ArrayList<>();
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
        for (Midia midia : midias) {
            if (midia.getTitulo().equals(nome)) {
                favoritos.add(midia);
                System.out.println("Adicionado aos favoritos!");
            }
        }
    }

    // Listar favoritos
    public void listarFavoritos(){
        System.out.println("*   FAVORITOS   *");
        for (Midia m : favoritos) {
            System.out.println(m.getTitulo());
        }
    }

    // Buscar uma obra pelo ano de estreia
    public void pesquisarPorAnoDeEstreia(int ano, ArrayList<Midia> midias){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo do ano " + ano + ":");
        boolean achou = false;
        for (Midia m : midias) {
            if(m.getAnoDeEstreia() == ano){
                System.out.println(m.getTitulo());
                achou = true;
            }
        }
        if(achou == false){
            System.out.println("Nenhuma obra encontrada.");
        }
        System.out.println("-----------------");
    }

    // Buscar uma obra por um genero especifico
    public void pesquisarPorGenero(String genero, ArrayList<Midia> midias){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo do genero " + genero + ":");
        boolean achou = false;
        for (Midia m : midias) {
            if(m.getGenero().equals(genero)){
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                achou = true;
            }
        }
        if(achou == false){
            System.out.println("Nenhuma obra encontrada.\n-----------------");
        }
    }

    // Buscar uma obra pela classificacao etaria
    public void pesquisarPorClassificao(int idade, ArrayList<Midia> midias){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo com classificação indicativa de " + idade + ":");
        boolean achou = false;
        for (Midia m : midias) {
            if(m.getClassificacaoEtaria() == idade){
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                achou = true;
            }
        }
        if(achou == false){
            System.out.println("Nenhuma obra encontrada.");
        }
        System.out.println("-----------------");
    }

    // Buscar uma obra por uma plavra chave
    public void pesquisarPalavraChave(String palavra, ArrayList<Midia> midias){
        System.out.println("\n-----------------");
        System.out.println("Midias relacionadas no catalogo: ");
        boolean achou = false;
        for (Midia m : midias) {
            if (m.getTitulo().contains(palavra)) {
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                achou = true;
                }
            }

        if(achou == false){
            System.out.println("Nenhuma obra encontrada.");
        }
        System.out.println("----------------");
    }

    // -----------------------

    // Avaliar uma obra especifica
    public void avaliar(Midia m, ArrayList<Midia>midias){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n--- Avaliar obra ---");
        
        System.out.println("Critica: ");
        m.setCritica(scan.nextLine());
        System.out.println("Nota: ");
        m.setNota(scan.nextDouble());

        scan.close();
    }

    // Usuario se cadastrar no catalogo
    public void cadastrar(ArrayList<Usuario> u, String login, String senha){
        this.login = login;
        this.senha = senha;
        u.add(this);
    }

    // Usuario faz login no catalogo
    public void login(Catalogo catalogo, String login, String senha){
        if(this.login == login && this.senha == senha){
            System.out.println("Login realizado");
        } else{
            System.out.println("Login ou senha incorretos. Tente novamente.");
        }
    }

}
