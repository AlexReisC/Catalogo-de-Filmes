package poo.midia;

public class Filme extends Midia{

    public Filme(){}

    @Override
    public void getInformacoes() {
        System.out.println("\n -----------" + "\nTitulo: " + this.titulo + " - " + this.anoDeEstreia + " \nGenero: " + this.genero +  "\nEstudio: " + this.estudio + "\nNota: " + this.nota);
    }
    
}
