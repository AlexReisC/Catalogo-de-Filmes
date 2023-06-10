package poo.cdf.midia;

public class Documentario extends Midia{

    public Documentario(){
        
    }

    @Override
    public void getInformacoes() {
        System.out.println("\n ------------" + "\nTitulo: " + this.titulo + " - " + this.anoDeEstreia +  " \nGenero: " + this.genero +"\nEstudio: " + this.estudio + "\nNota: " + this.nota);
    }
    
}