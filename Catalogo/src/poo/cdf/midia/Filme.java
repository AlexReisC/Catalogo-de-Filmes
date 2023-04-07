package poo.cdf.midia;

public class Filme extends Midia{

    public Filme(String titulo, int ano, String diretor, String estudio, String genero, double avaliacao) {
        super(titulo, ano, diretor, estudio, genero, avaliacao);
    }

    @Override
    public void getInformacoes() {
        System.out.println("Titulo: " + this.titulo + " \nGenero: " + this.genero + "\nAno de estreia: " + 
        this.anoDeEstreia + "\nDirigido por: " + this.diretor + "\nAvaliação: " + this.avaliacao);
    }
    
}
