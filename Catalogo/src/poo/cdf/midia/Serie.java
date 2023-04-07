package poo.cdf.midia;

public class Serie extends Midia {
    private int temporadas;
    private int episodios;
    // Ideia: matriz de temporadas e episodios   

    public Serie(String titulo, int ano, String diretor, String estudio, String genero, double avaliacao,
            int temporadas, int episodios) {
        super(titulo, ano, diretor, estudio, genero, avaliacao);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    @Override
    public void getInformacoes() {
        System.out.println("Titulo: " + this.titulo + " \nGenero: " + this.genero + "\nAno de estreia: " + 
        this.anoDeEstreia + "\nDirigido por: " + this.diretor + "\nAvaliação: " + this.avaliacao);
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
