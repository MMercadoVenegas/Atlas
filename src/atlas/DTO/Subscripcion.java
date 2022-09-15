package atlas.DTO;

public class Subscripcion {
    private date InicioSubscripcion;
    private int ValorSubscripcion;
    private String Equipo;
    private int AbonoTotal;
    private Usuario Usuario;
    private ClubDeportivo ClubDeportivo;
    
    public Subscripcion(){
        this.InicioSubscripcion = new date();
        this.ValorSubscripcion = 0;
        this.Equipo = "";
        this.AbonoTotal = 0;
        this.Usuario = new Usuario();
        this.ClubDeportivo = new ClubDeportivo();
        
    }

    public Subscripcion(date InicioSubscripcion, int ValorSubscripcion, String Equipo, int AbonoTotal, Usuario Usuario, ClubDeportivo ClubDeportivo) {
        this.InicioSubscripcion = InicioSubscripcion;
        this.ValorSubscripcion = ValorSubscripcion;
        this.Equipo = Equipo;
        this.AbonoTotal = AbonoTotal;
        this.Usuario = Usuario;
        this.ClubDeportivo = ClubDeportivo;
    }

    public date getInicioSubscripcion() {
        return InicioSubscripcion;
    }

    public void setInicioSubscripcion(date InicioSubscripcion) {
        this.InicioSubscripcion = InicioSubscripcion;
    }

    public int getValorSubscripcion() {
        return ValorSubscripcion;
   }

    public void setValorSubscripcion(int ValorSubscripcion) {
        this.ValorSubscripcion = ValorSubscripcion;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public ClubDeportivo getClubDeportivo() {
        return ClubDeportivo;
    }

    public void setClubDeportivo(ClubDeportivo ClubDeportivo) {
        this.ClubDeportivo = ClubDeportivo;
    }
    
}
