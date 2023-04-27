package poo.cdf.midia;

public class Documentario extends Midia{

    public Documentario(String titulo, int ano, String diretor, String estudio, String genero) {
        super(titulo, ano, diretor, estudio, genero);
    }

    @Override
    public void getInformacoes() {
        System.out.println("Titulo: " + this.titulo + " \nGenero: " + this.genero + "\nAno de estreia: " + 
        this.anoDeEstreia + "\nDirigido por: " + this.diretor + "\nAvaliação: " + this.avaliacao);
    }
    
}