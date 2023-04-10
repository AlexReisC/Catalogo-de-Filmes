import poo.cdf.catalogo.Catalogo;
import poo.cdf.midia.*;

public class Main {
    public static void main(String[] args) {
        Catalogo c = new Catalogo();

        Filme filme1 = new Filme("Homem de Ferro", 2008, "Kevin Feige", "Marvel Studios", "Super-Herói", 7.5);
        Filme filme2 = new Filme("Vingadores: Guerra Infinita", 2019, "Antony Russo", "Marvel Studios", "Super-Herói", 8.5);
        Serie s1 = new Serie("The Boys", 2020, "Sei lá", "HBO","Super-Heroi/Comedia/Adulto", 9.0, 3, 36);

        c.adicionarFilme(filme1);
        c.adicionarFilme(filme2);
        c.adicionarSerie(s1);
        //c.listarFilmes();
        //c.listarSeries();
        
        /* c.excluirFilme(filme1);
        c.buscarFilme(filme1);
        c.buscarFilme(filme2); */
        
    }
}
