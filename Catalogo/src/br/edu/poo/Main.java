package poo;

import poo.catalogo.*;
import poo.midia.*;

public class Main {
    public static void main(String[] args){
        Catalogo c = new Catalogo();

        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie s1 = new Serie();

        Administrador adm = new Administrador("Alex", "Alek2", "12345");
        adm.adicionarMidia(filme2, c.midias);
        /* adm.adicionarMidia(filme1, c.midias);
        adm.adicionarMidia(s1, c.midias); */
        //c.listarMidias();
        //adm.removerrMidia(filme2, c.midias);

        Usuario u1 = new Usuario("Alex");
        u1.cadastrar(c.usuarios, "Alek", "1234");
        //u1.login(c, "Alek", "1234");
        //c.listarUsuarios();
        //u1.pesquisarPorAnoDeEstreia(2008, c.midias);
        //u1.pesquisarPalavraChave("Homem", c.midias);
        //u1.pesquisarPorClassificao(12, c.midias);
        //u1.pesquisarPorGenero("Super heroi", c.midias);
        //u1.favoritar("Homem de Ferro", c.midias);
        //u1.listarFavoritos();
        //u1.avaliar(filme2, c.midias);
    }
}
