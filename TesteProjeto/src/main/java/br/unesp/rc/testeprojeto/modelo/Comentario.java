package br.unesp.rc.testeprojeto.modelo;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Comentario {
    
    private String menssagem;
    private Date data;

    public Comentario() {
    }

    public Comentario(String menssagem, Date data) {
        this.menssagem = menssagem;
        this.data = data;
    }

    public String getMenssagem() {
        return menssagem;
    }

    public void setMenssagem(String menssagem) {
        this.menssagem = menssagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Comentario{" + "menssagem=" + menssagem + ", data=" + data + '}';
    }
    
    
}
