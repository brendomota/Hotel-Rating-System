package br.unesp.rc.testeprojeto.repositorio;

import br.unesp.rc.testeprojeto.modelo.Avaliacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class AvaliacaoRepositorio {
    
    static List<Avaliacao> avaliacoes = new ArrayList<>();

    public AvaliacaoRepositorio() {
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
    public void adicionar(Avaliacao a){
        avaliacoes.add(a);
    }
    
    public void imprimir(){
        System.out.println("----------AVALIACOES----------");
        for(Avaliacao a : avaliacoes){
            System.out.println("---");
            System.out.println("Cliente: " + a.getCliente().getNome());;
            System.out.println("Hotel: " + a.getHotel().getNome());
            System.out.println("Comentario: " + a.getComentario().getMenssagem());
            System.out.println("Sentimento: " + a.getSentimento());
        }
    }
    
    public void calcularNumeroAvaliacoesHotel(){
        for(Avaliacao a : avaliacoes){
            if("Positivo".equals(a.getSentimento())){
                a.getHotel().setNumeroComentariosPositovos(a.getHotel().getNumeroComentariosPositovos()+1);
            }
            if("Neutro".equals(a.getSentimento())){
                a.getHotel().setNumeroComentariosNeutros(a.getHotel().getNumeroComentariosNeutros()+1);
            }
            if("Negativo".equals(a.getSentimento())){
                a.getHotel().setNumeroComentariosNegativos(a.getHotel().getNumeroComentariosNegativos()+1);
            }
        }
    }
}
