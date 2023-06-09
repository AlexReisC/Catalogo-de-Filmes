package poo.cdf.catalogo;

import poo.cdf.midia.*;
import java.util.ArrayList;

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
        midias.add(m);
    }

    

    // Permitir que os administradores do sistema possam cadastrar novos títulos, incluindo informações como nome, sinopse, elenco, diretor, gênero, classificação, entre outras informações relevantes.
}
