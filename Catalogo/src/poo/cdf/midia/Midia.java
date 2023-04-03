package poo.cdf.midia;

public abstract class Midia {
    protected String titulo;
    protected int anoDePublicacao;
    protected String estudio;
    protected String genero;
    protected double avaliacao;

    public Midia(String titulo, int ano, String estudio, String genero, double avaliacao){
        this.titulo = titulo;
        this.anoDePublicacao = ano;
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

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
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
