package poo.cdf.midia;

public abstract class Midia {
    protected String titulo;
    protected int anoDeEstreia;
    protected String estudio;
    protected String genero;
    protected double avaliacao;

    public Midia(String titulo, int ano, String estudio, String genero, double avaliacao){
        this.titulo = titulo;
        this.anoDeEstreia = ano;
        this.estudio = estudio;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    // gets e setters dos atributos:
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeEstreia() {
        return anoDeEstreia;
    }

    public void setAnoDeEstreia(int anoDeEstreia) {
        this.anoDeEstreia = anoDeEstreia;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    // ------------------------

    // Obter as informações sobre filme
    public void getInformacoes(){
    }

}
