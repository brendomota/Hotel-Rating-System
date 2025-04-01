package br.unesp.rc.testeprojeto.modelo;

/**
 *
 * @author aluno
 */
public class ServicosHotel {
    
    private boolean wifi;
    private boolean piscina;
    private boolean academia;
    private boolean cafeManha;

    public ServicosHotel() {
    }

    public ServicosHotel(boolean wifi, boolean piscina, boolean academia, boolean cafeManha) {
        this.wifi = wifi;
        this.piscina = piscina;
        this.academia = academia;
        this.cafeManha = cafeManha;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isAcademia() {
        return academia;
    }

    public void setAcademia(boolean academia) {
        this.academia = academia;
    }

    public boolean isCafeManha() {
        return cafeManha;
    }

    public void setCafeManha(boolean cafeManha) {
        this.cafeManha = cafeManha;
    }

    @Override
    public String toString() {
        return "ServicosHotel{" + "wifi=" + wifi + ", piscina=" + piscina + ", academia=" + academia + ", cafeManha=" + cafeManha + '}';
    }
}
