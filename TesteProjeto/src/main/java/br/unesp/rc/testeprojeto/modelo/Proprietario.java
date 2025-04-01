package br.unesp.rc.testeprojeto.modelo;

/**
 *
 * @author aluno
 */
public class Proprietario extends Pessoa{
    
    private boolean superHost;
    private int quantidadeAvaliacoes;

    public Proprietario() {
    }

    public Proprietario(boolean superHost, int quantidadeAvaliacoes, String nome, int idade) {
        super(nome, idade);
        this.superHost = superHost;
        this.quantidadeAvaliacoes = quantidadeAvaliacoes;
    }

    public boolean isSuperHost() {
        return superHost;
    }

    public void setSuperHost(boolean superHost) {
        this.superHost = superHost;
    }

    public int getQuantidadeAvaliacoes() {
        return quantidadeAvaliacoes;
    }

    public void setQuantidadeAvaliacoes(int quantidadeAvaliacoes) {
        this.quantidadeAvaliacoes = quantidadeAvaliacoes;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "superHost=" + superHost + ", quantidadeAvaliacoes=" + quantidadeAvaliacoes + super.toString() + '}';
    }
}
