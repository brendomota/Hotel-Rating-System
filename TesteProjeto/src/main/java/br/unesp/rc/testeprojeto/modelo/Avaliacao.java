package br.unesp.rc.testeprojeto.modelo;

/**
 *
 * @author aluno
 */
public class Avaliacao {
    
    private Cliente cliente;
    private Hotel hotel;
    private Comentario comentario;
    private String sentimento;

    public Avaliacao() {
    }

    public Avaliacao(Cliente cliente, Hotel hotel, Comentario comentario) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.comentario = comentario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public String getSentimento() {
        return sentimento;
    }

    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "cliente=" + cliente + ", hotel=" + hotel + ", comentario=" + comentario + '}';
    }
}
