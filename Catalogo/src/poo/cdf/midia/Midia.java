package poo.cdf.midia;

public abstract class Midia{
    protected String titulo;
    protected int anoDeEstreia;
    protected String estudio;
    protected String diretor;
    protected String genero;
    protected double nota;
    protected int classificacaoEtaria;
    protected String critica;

    public Midia(String titulo, int ano, String diretor, String estudio, String genero){
        this.titulo = titulo;
        this.anoDeEstreia = ano;
        this.diretor = diretor;
        this.estudio = estudio;
        this.genero = genero;
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
    
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    // Obter as informações sobre filme
    public void getInformacoes(){
    }

    public String getCritica() {
        return critica;
    }
    public void setCritica(String critica) {
        this.critica = critica;
    }
    
}