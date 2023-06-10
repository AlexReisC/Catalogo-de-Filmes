package poo.cdf;
import poo.cdf.catalogo.*;
import poo.cdf.midia.*;

public class Main {
    public static void main(String[] args) {
        Catalogo c = new Catalogo();

        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie s1 = new Serie();

        Administrador adm = new Administrador("Alex", "Alek", "1234");
        adm.adicionarMidia(filme2, c.midias);
        adm.adicionarMidia(filme1, c.midias);
        adm.adicionarMidia(s1, c.midias);
        //c.listarMidias();

        Usuario u1 = new Usuario("Alex", "Alek", "123");
        u1.pesquisarPorAnoDeEstreia(2008, c.midias);
        u1.pesquisarPalavraChave("Infinita", c.midias);
        u1.avaliar("Homem de Ferro", c.midias);
    }
}
