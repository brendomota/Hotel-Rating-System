package br.unesp.rc.testeprojeto;

import br.unesp.rc.testeprojeto.modelo.Avaliacao;
import br.unesp.rc.testeprojeto.modelo.Cliente;
import br.unesp.rc.testeprojeto.modelo.Comentario;
import br.unesp.rc.testeprojeto.modelo.Hotel;
import br.unesp.rc.testeprojeto.modelo.Proprietario;
import br.unesp.rc.testeprojeto.modelo.ServicosHotel;
import br.unesp.rc.testeprojeto.repositorio.AvaliacaoRepositorio;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class TesteProjeto {

    public static void main(String[] args) {
        
        Cliente p1 = new Cliente("brendo@gemsil.com", "(12)98734758", "Brendo", 18);
        Cliente p2 = new Cliente("rafael@gemsil.com", "(19)953546643", "Rafael", 21);
        Cliente p3 = new Cliente("leo@gemsil.com", "(11)97162548", "Leonardo", 19);
        
        Comentario c1 = new Comentario("Achei otimo", new Date());
        Comentario c2 = new Comentario("Achei horrivel", new Date());
        Comentario c3 = new Comentario("Achei mais ou menos", new Date());
        
        ServicosHotel s1 = new ServicosHotel(true, false, false, false);
        ServicosHotel s2 = new ServicosHotel(false, true, true, false);
        ServicosHotel s3 = new ServicosHotel(true, false, false, true);
        
        Proprietario prop1 = new Proprietario(true, 100, "Rebeca", 39);
        Proprietario prop2 = new Proprietario(false, 50, "Linda", 57);
        Proprietario prop3 = new Proprietario(true, 20, "Romario", 24);
        
        Hotel h1 = new Hotel("Hotel 1", "Rua 1", prop1, s1);
        Hotel h2 = new Hotel("Hotel 2", "Rua 2", prop2, s2);
        Hotel h3 = new Hotel("Hotel 3", "Rua 3", prop3, s3);
        
        Avaliacao a1 = new Avaliacao(p1, h1, c1);
        Avaliacao a2 = new Avaliacao(p2, h2, c2);
        Avaliacao a3 = new Avaliacao(p3, h3, c3);
        
        AvaliacaoRepositorio arepositorio = new AvaliacaoRepositorio();
        arepositorio.adicionar(a1);
        arepositorio.adicionar(a2);
        arepositorio.adicionar(a3);
        arepositorio.imprimir();
        
    }
}
