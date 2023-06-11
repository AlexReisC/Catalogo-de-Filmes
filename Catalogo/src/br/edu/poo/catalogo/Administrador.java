package poo.catalogo;

import poo.midia.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Administrador {
    private String nome;
    private String login;
    private String senha;

    public Administrador(String nome, String login, String senha) {
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

    // Adicionar um titulo ao catalogo
    public void adicionarMidia(Midia m, ArrayList<Midia> midias){
        Scanner scan = new Scanner(System.in);

        System.out.print("Titulo: ");
        m.setTitulo(scan.nextLine());
        System.out.print("Genero: ");
        m.setGenero(scan.nextLine());
        System.out.print("Estudio: ");
        m.setEstudio(scan.nextLine());
        System.out.print("Diretor: ");
        m.setDiretor(scan.nextLine());
        
        try {
            System.out.print("Ano de Lançamento: ");
            m.setAnoDeEstreia(scan.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("O ano deve ser um inteiro. Tente novamente: ");
            scan.nextLine();
            m.setAnoDeEstreia(scan.nextInt());
        }
        
        try {
            System.out.print("Classificação etária: ");
            m.setClassificacaoEtaria(scan.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("A classificacao etaria deve ser um inteiro. Tente novamente: ");
            scan.nextLine();
            m.setClassificacaoEtaria(scan.nextInt());
        }

        System.out.println("Midia adicionada!");
        midias.add(m);
        scan.close();
    }

    // Remover um titulo do catalogo
    public void removerrMidia(Midia m, ArrayList<Midia> midias){
        if(midias.isEmpty()){
            System.out.println("Catalogo está vazio!");
        } else{
            midias.remove(m);
            System.out.println(m.getTitulo() + " foi removido.");
        }
    }
    
}
