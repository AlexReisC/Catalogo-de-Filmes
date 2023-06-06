import java.util.ArrayList;

import poo.cdf.catalogo.Catalogo;
import poo.cdf.catalogo.Usuario;
import poo.cdf.midia.*;

public class Main {
    public static void main(String[] args) {
        Catalogo c = new Catalogo();

        Filme filme1 = new Filme("Homem de Ferro", 2008, "Kevin Feige", "Marvel Studios", "Super-Herói");
        Filme filme2 = new Filme("Vingadores: Guerra Infinita", 2019, "Antony Russo", "Marvel Studios", "Super-Herói");
        Serie s1 = new Serie("The Boys", 2020, "Sei lá", "HBO","Super-Heroi", 3, 36);

        /* c.adicionarMidia(filme1);
        c.adicionarMidia(filme2);
        c.adicionarMidia(s1); */
        //c.listarMidias();

        ArrayList<Midia> midias = new ArrayList<>();
        midias.add(s1);
        Usuario u1 = new Usuario("Alex", "Alek", "123");
        u1.pesquisarMidia("The Boys", midias);
        //c.excluirMidia(filme2);
        // c.pesquisarMidia("Vingadores: Guerra Infinita");
        /*c.ranker();
        c.pesquisarPorGenero("Super-Herói"); */
        //c.pesquisarPorAnoDeEstreia(2020);
    }
}
