
package atlas.DTO;

import java.util.Date;

public class Usuario {
    private int Id;
    private String PrimerNombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int NumeroRut;
    private String DigitoVerificador;
    private Date FechaNacimiento;
    private String Email;
    private String Contrasena;
    
    public Usuario(){
        this.Id = 0;
        this.PrimerNombre = "";
        this.SegundoNombre = "";
        this.ApellidoPaterno = "";
        this.ApellidoMaterno = "";
        this.NumeroRut = 0;
        this.DigitoVerificador = "";
        this.FechaNacimiento = new Date();
        this.Email = "";
        this.Contrasena = "";
    }
    public Usuario(int Id, String PrimerNombre, String SegundoNombre,
            String ApellidoPaterno, String ApellidoMaterno, int NumeroRut,
            String DigitoVerificador, Date FechaNacimiento, String Email,
            String Contraseña){
        this.Id = Id;
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.NumeroRut = NumeroRut;
        this.DigitoVerificador = DigitoVerificador;
        this.FechaNacimiento = FechaNacimiento;
        this.Email = Email;
        this.Contrasena = Contraseña;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public int getNumeroRut() {
        return NumeroRut;
    }

    public void setNumeroRut(int NumeroRut) {
        this.NumeroRut = NumeroRut;
    }

    public String getDigitoVerificador() {
        return DigitoVerificador;
    }

    public void setDigitoVerificador(String DigitoVerificador) {
        this.DigitoVerificador = DigitoVerificador;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
}