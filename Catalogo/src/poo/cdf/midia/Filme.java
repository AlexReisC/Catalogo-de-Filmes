package poo.cdf.midia;

public class Filme extends Midia{

    public Filme(String titulo, int ano, String diretor, String estudio, String genero) {
        super(titulo, ano, diretor, estudio, genero);
    }

    @Override
    public void getInformacoes() {
        System.out.println("Titulo: " + this.titulo + " - " + this.anoDeEstreia + " \nGenero: " + this.genero +  "\nDirigido por: " + this.diretor + "\nNota: " + this.nota);
    }
    
}
