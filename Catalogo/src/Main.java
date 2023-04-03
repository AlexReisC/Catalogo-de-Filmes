import poo.cdf.catalogo.Catalogo;
import poo.cdf.midia.*;

public class Main {
    public static void main(String[] args) {
        // Catalogo c = new Catalogo();

        //Midia filme1 = new Midia("Homem de Ferro", 2008, "Kevin Feige", "Marvel Studios", 7.5);
        //Midia filme2 = new Midia("Vingadores: Guerra Infinita", 2019, "Antony Russo", "Marvel Studios", 8.5);       
        
        /* c.adicionarFilme(filme1);
        c.listarFilmes();
        c.adicionarFilme(filme2);
        c.listarFilmes();

        c.excluirFilme(filme1);
        c.listarFilmes(); */

        Filme f1 = new Filme("Vingadores", 2010, "Anthony Russo", "Ação", 7.5);
        Filme f2 = new Filme("Vingadores", 2010, "Anthony Russo", "Ação", 7.5);
        Filme f3 = f1;
        Serie s1 = new Serie("The Boys", 2020, "Sei lá", "Super-Heroi/Comedia/Adulto", 9.0);
        
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
        System.out.println("Class f1: " + f1.getClass() + " Class f2: " + f2.getClass());
        System.out.println(f1 == f3);
        System.out.println(f1.equals(f3));
        System.out.println(f1.hashCode() + "\n" + f3.hashCode());
        System.out.println("Class f3: " + f3.getClass());
        System.out.println("Class s1: " + s1.getClass());
    }
}
