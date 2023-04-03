package poo.cdf.midia;

public class Filme extends Midia{

    public Filme(String titulo, int ano, String estudio, String genero, double avaliacao) {
        super(titulo, ano, estudio, genero, avaliacao);
    }

    @Override
    public void getInformacoes() {
        System.out.println("Titulo do filme: " + this.titulo + " Genero: " + this.genero + "\nAno de estreia: " + 
        this.anoDePublicacao + "\nDirigido por: " + this.estudio + "\nAvaliação: " + this.avaliacao);
    }
    
}
