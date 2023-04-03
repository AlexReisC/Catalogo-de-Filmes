package poo.cdf.midia;

public class Filme extends Midia{

    public Filme(String titulo, int ano, String diretor, String genero, double avaliacao) {
        super(titulo, ano, diretor, genero, avaliacao);
    }

    @Override
    public void getInformacoes() {
        System.out.println("Titulo do filme: " + this.titulo + " Genero: " + this.genero + "\nAno de estreia: " + 
        this.anoDePublicacao + "\nDirigido por: " + this.diretor + "\nAvaliação: " + this.avaliacao);
    }
    
}
