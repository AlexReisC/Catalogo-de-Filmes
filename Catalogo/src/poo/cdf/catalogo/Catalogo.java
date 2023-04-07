package poo.cdf.catalogo;

import java.util.ArrayList;
import java.util.List;

import poo.cdf.midia.*;

public class Catalogo {
    // Lista das midias
    private List<Filme> filmes;
    private List<Serie> series;
    private List<Documentario> documentarios;

    public Catalogo(){
        filmes = new ArrayList<>();
        series = new ArrayList<>();
        documentarios = new ArrayList<>();
    }    

    // Adicionar uma midia ao catalogo
    public void adicionarFilme(Filme f){
        filmes.add(f);
    }

    public void adicionarSerie(Serie s){
        series.add(s);
    }

    public void adicionarDocumentario(Documentario d){
        documentarios.add(d);
    }
    // -------------------
    
    // Listar todas as midias presentes
    public void listarFilmes(){
        System.out.println("\n-----------------");
        System.out.println("Filmes no catalogo:");
        for (Filme f : filmes) {
            System.out.println(f.getTitulo() + "(" + f.getAnoDeEstreia() + ")");
        }
        System.out.println("-----------------\n");
    }

    public void listarSeries(){
        System.out.println("\n-----------------");
        System.out.println("Series no catalogo:");
        for (Serie s : series) {
            System.out.println(s.getTitulo() + "(" + s.getAnoDeEstreia() + ")");
        }
        System.out.println("-----------------\n");
    }

    public void listarDocumentarios(){
        System.out.println("\n-----------------");
        System.out.println("Documentarios no catalogo:");
        for (Documentario d : documentarios) {
            System.out.println(d.getTitulo() + "(" + d.getAnoDeEstreia() + ")");
        }
        System.out.println("-----------------\n");
    }
    // --------------------

    // Remover um midia do catalogo
    public void excluirFilme(Filme f){
        if(filmes.isEmpty()){
            System.out.println("Catalogo de filmes vazio!");
        } else{
            filmes.remove(f);
            System.out.println("O filme " + f.getTitulo() + " foi removido.");
        }
    }

    public void excluirSerie(Serie s){
        if(series.isEmpty()){
            System.out.println("Catalogo de series vazio!");
        } else{
            series.remove(s);
            System.out.println("A serie " + s.getTitulo() + " foi removido.");
        }
    }

    public void excluirDocumentario(Documentario d){
        if(documentarios.isEmpty()){
            System.out.println("Catalogo de documentarios vazio!");
        } else{
            documentarios.remove(d);
            System.out.println("O documentario " + d.getTitulo() + " foi removido.");
        }
    }
    // --------------------

    // Buscar um midia especifico e obter suas informações
    public void buscarFilme(Filme f){
        for (Filme filme : filmes) {
            if (filme.equals(f)) {
                f.getInformacoes();
            } else{
                System.out.println("Filme não encontrado no catalogo.");
            }
        }
    }

    public void buscarSerie(Serie s){
        for (Serie serie : series) {
            if (serie.equals(s)) {
                s.getInformacoes();
            } else{
                System.out.println("Serie não encontrada no catalogo.");
            }
        }
    }

    public void buscarDocumentario(Documentario d){
        for (Documentario documentario : documentarios) {
            if (documentario.equals(d)) {
                d.getInformacoes();
            } else{
                System.out.println("Documentario não encontrado no catalogo.");
            }
        }
    }
    // ----------------------

    // Rankear as midias com as melhores avaliacoes
    public void rankear(){
        Midia[] avaliacoes = new Midia[10];

        for (int i = 0; i < filmes.size(); i++) {
            for (int j = 1; j < filmes.size()+1; j++) {
                if(filmes.get(i).getAvaliacao() > filmes.get(j).getAvaliacao() && avaliacoes[9] == null){
                    avaliacoes[i] = filmes.get(i);
                }
            }
        }

        for (int i = 0; i < series.size(); i++) {
            if(series.get(i).getAvaliacao() > avaliacoes[i].getAvaliacao()){
                avaliacoes[i] = series.get(i);
            }
        }

        for (int i = 0; i < documentarios.size(); i++) {
            if(documentarios.get(i).getAvaliacao() > avaliacoes[i].getAvaliacao()){
                avaliacoes[i] = documentarios.get(i);
            }
        }

        System.out.println("* Top 10 mais bem avaliados *");
        for (int i = 0; i < avaliacoes.length; i++) {
            System.out.println((i+1) + "." + avaliacoes[i].getTitulo() + " Nota: " + avaliacoes[i].getAvaliacao());
        }
    }

}
