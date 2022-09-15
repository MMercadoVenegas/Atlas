package atlas.DTO;

import java.util.Date;

public class ClubDeportivo {
    private String RolUnico;
    private String NombreClub;
    private String NombreFundador;
    private Date AñoFundacion;
    private String PaisOrigen;
    private String Lema;
    private String Colores;
    private int ValorSubscripcion;
    
    public ClubDeportivo(){
        this.RolUnico = "";
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AñoFundacion = new Date();
        this.PaisOrigen = "";
        this.Lema ="";
        this.Colores = "";
        this.ValorSubscripcion = 0;
        
}

    public ClubDeportivo(String RolUnico, String NombreClub, String NombreFundador, Date AñoFundacion, String PaisOrigen, String Lema, String Colores, int ValorSubscripcion) {
        this.RolUnico = RolUnico;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AñoFundacion = AñoFundacion;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.Colores = Colores;
        this.ValorSubscripcion = ValorSubscripcion;
    }

    public String getRolUnico() {
        return RolUnico;
    }

    public void setRolUnico(String RolUnico) {
        this.RolUnico = RolUnico;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public Date getAñoFundacion() {
        return AñoFundacion;
    }

    public void setAñoFundacion(Date AñoFundacion) {
        this.AñoFundacion = AñoFundacion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValorSubscripcion() {
        return ValorSubscripcion;
    }

    public void setValorSubscripcion(int ValorSubscripcion) {
        this.ValorSubscripcion = ValorSubscripcion;
    }
