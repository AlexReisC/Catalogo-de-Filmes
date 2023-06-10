package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.Scanner;
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
            if (midia.getTitulo() == nome) {
                favoritos.add(midia);
            }
        }
        System.out.println("Adicionado aos favoritos!");
    }

    // Listar favoritos
    public void listarFavoritos(){
        System.out.println("*   FAVORITOS   *");
        for (Midia midia : favoritos) {
            System.out.println(midia.getTitulo());
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
            System.out.println("Nenhuma midia encontrada.");
        }
        System.out.println("-----------------\n");
    }

    // Buscar uma obra por um genero especifico
    public void pesquisarPorGenero(String genero, ArrayList<Midia> midias){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo do genero " + genero + ":");
        boolean achou = false;
        for (Midia m : midias) {
            if(m.getGenero() == genero){
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                achou = true;
            }
        }
        if(achou == false){
            System.out.println("Nenhuma midia encontrada com esse genero.");
        }
        System.out.println("-----------------\n");
    }

    // Buscar uma obra pela classificacao etaria
    public void pesquisarPorClassificao(int idade, ArrayList<Midia> midias){
        System.out.println("\n-----------------");
        System.out.println("Midias no catalogo de classificação indicativa de " + idade + ":");
        boolean achou = false;
        for (Midia m : midias) {
            if(m.getClassificacaoEtaria() == idade){
                System.out.println(m.getTitulo() + " (" + m.getAnoDeEstreia() + ")");
                achou = true;
            }
        }
        if(achou == false){
            System.out.println("Nenhuma midia encontrada com esse genero.");
        }
        System.out.println("-----------------\n");
    }

    // Buscar uma obra por uma plavra chave
    public void pesquisarPalavraChave(String palavra, ArrayList<Midia> midias){
        boolean achou = false;
        if(midias.isEmpty()){
            System.out.println("Catalogo vazio.");
        } else{
            for (Midia m : midias) {
                if (m.getTitulo().contains(palavra)) {
                    m.getInformacoes();
                    achou = true;
                }
            }
        }
        if(achou == false){
            System.out.println("Midia não encontrada!");
        }
    }

    // -----------------------

    // Avaliar uma obra especifica
    public void avaliar(String nome, ArrayList<Midia>midias){
        Scanner scan = new Scanner(System.in);
        String texto;
        double nota;
        System.out.println("--- Avaliar obra ---");
        for (Midia m : midias) {
            if(m.getTitulo() == nome){
                System.out.print("Sua critica: ");
                texto = scan.nextLine();
                m.setCritica(texto);
                System.out.print("Sua nota: ");
                nota = scan.nextDouble();
                m.setNota(nota);
            }
        }
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
