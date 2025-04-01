package br.unesp.rc.testeprojeto.modelo;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {
    
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String email, String telefone, String nome, int idade) {
        super(nome, idade);
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + ", telefone=" + telefone + super.toString() + '}';
    }
}
