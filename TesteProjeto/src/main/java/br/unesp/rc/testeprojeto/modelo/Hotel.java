package br.unesp.rc.testeprojeto.modelo;

/**
 *
 * @author aluno
 */
public class Hotel {
    
    private String nome;
    private String endereco;
    private Proprietario proprietario;
    private ServicosHotel servicos;
    private int numeroComentariosNegativos;
    private int numeroComentariosNeutros;
    private int numeroComentariosPositovos;

    public Hotel() {
    }

    public Hotel(String nome, String endereco, Proprietario proprietario, ServicosHotel servicos) {
        this.nome = nome;
        this.endereco = endereco;
        this.proprietario = proprietario;
        this.servicos = servicos;
        this.numeroComentariosNegativos = 0;
        this.numeroComentariosNeutros = 0;
        this.numeroComentariosPositovos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public ServicosHotel getServicos() {
        return servicos;
    }

    public void setServicos(ServicosHotel servicos) {
        this.servicos = servicos;
    }

    public int getNumeroComentariosNegativos() {
        return numeroComentariosNegativos;
    }

    public void setNumeroComentariosNegativos(int numeroComentariosNegativos) {
        this.numeroComentariosNegativos = numeroComentariosNegativos;
    }

    public int getNumeroComentariosNeutros() {
        return numeroComentariosNeutros;
    }

    public void setNumeroComentariosNeutros(int numeroComentariosNeutros) {
        this.numeroComentariosNeutros = numeroComentariosNeutros;
    }

    public int getNumeroComentariosPositovos() {
        return numeroComentariosPositovos;
    }

    public void setNumeroComentariosPositovos(int numeroComentariosPositovos) {
        this.numeroComentariosPositovos = numeroComentariosPositovos;
    }
}
