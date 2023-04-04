package poo.cdf.midia;

public class Serie extends Midia {
    private int temporadas;
    private int nEpsodios;
    // Ideia: matriz de temporadas e episodios   

    public Serie(String titulo, int ano, String estudio, String genero, double avaliacao, int temp) {
        super(titulo, ano, estudio, genero, avaliacao);
        this.temporadas = temp;
    }

    @Override
    public void getInformacoes() {
        super.getInformacoes();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getnEpsodios() {
        return nEpsodios;
    }

    public void setnEpsodios(int nEpsodios) {
        this.nEpsodios = nEpsodios;
    }
    
}
