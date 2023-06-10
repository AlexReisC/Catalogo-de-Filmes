package poo.cdf.midia;

public class Serie extends Midia {
    private int temporadas;
    private int episodios;
    // Ideia: matriz de temporadas e episodios

    public Serie() {

    }

    @Override
    public void getInformacoes() {
        System.out.println("\n -----------" + "\nTitulo: " + this.titulo + " - " + this.anoDeEstreia + " \nGenero: " + this.genero + "\nEstudio: " + this.estudio + "\nNota: " + this.nota);
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
