package br.unesp.rc.testeprojeto.repositorio;

import br.unesp.rc.testeprojeto.modelo.Hotel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class HotelRepositorio {
    
    static List<Hotel> hoteis = new ArrayList<>();

    public HotelRepositorio() {
    }

    public List<Hotel> getHoteis() {
        return hoteis;
    }

    public void setHoteis(List<Hotel> hoteis) {
        this.hoteis = hoteis;
    }
    
    public void adicionar(Hotel h){
        hoteis.add(h);
    }
    
    public void imprimir(){
        System.out.println("--------------HOTEIS--------------");
        for(Hotel h : hoteis){
            System.out.println("---Hotel: " + h.getNome() + "---");
            System.out.println("Proprietario: " + h.getProprietario().getNome());
            System.out.println("Endereco: " + h.getEndereco());
            String s = "";
            if(h.getServicos().isAcademia()){
                s+=" Academia ";
            }
            if(h.getServicos().isCafeManha()){
                s+=" Cafe da manha ";
            }
            if(h.getServicos().isPiscina()){
                s+=" Piscina ";
            }
            if(h.getServicos().isWifi()){
                s+=" wi-fi ";
            }
            System.out.println("Servicos: " + s);
        }
    }
}
