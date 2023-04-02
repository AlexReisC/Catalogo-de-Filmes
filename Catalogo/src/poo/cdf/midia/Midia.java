package poo.cdf.midia;

public abstract class Midia {
    protected String titulo;
    protected int anoDePublicacao;
    protected String diretor;
    protected String genero;
    protected double avaliacao;

    public Midia(String titulo, int ano, String diretor, String genero, double avaliacao){
        this.titulo = titulo;
        this.anoDePublicacao = ano;
        this.diretor = diretor;
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

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
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
