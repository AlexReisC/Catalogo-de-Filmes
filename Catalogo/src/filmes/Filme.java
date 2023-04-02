package filmes;

public class Filme {
    private String titulo;
    private int anoDePublicacao;
    private String diretor;
    private String genero;
    private double avaliacao;

    public Filme(String titulo, int ano, String diretor, String genero, double av){
        this.titulo = titulo;
        this.anoDePublicacao = ano;
        this.diretor = diretor;
        this.genero = genero;
        this.avaliacao = av;
    }

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
    
    public void getInformacoes(){
        
    }
    
}
