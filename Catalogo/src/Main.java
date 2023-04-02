import filmes.Catalogo;
import filmes.Filme;

public class Main {
    public static void main(String[] args) {
        Catalogo c = new Catalogo();

        Filme filme1 = new Filme("Homem de Ferro", 2008, "Kevin Feige", "Marvel Studios", 7.5);
        Filme filme2 = new Filme("Vingadores: Guerra Infinita", 2019, "Antony Russo", "Marvel Studios", 8.5);       
        
        c.adicionarFilme(filme1);
        c.listarFilmes();
        c.adicionarFilme(filme2);
        c.listarFilmes();

        c.excluirFilme(filme1);
        c.listarFilmes();
    }
}
