package atlas;

import atlas.DTO.ClubDeportivo;
import atlas.DTO.Subscripcion;
import atlas.DTO.Usuario;
import java.util.Date;

public class PRINCIPAL {
    public static void main(String[] args) {
      Usuario usuario1 = new Usuario();
      usuario1.setId(1000);
      usuario1.setPrimerNombre("David");
      usuario1.setSegundoNombre("Andres");
      usuario1.setApellidoPaterno("Cogiolle");
      usuario1.setApellidoMaterno("Venegas");
      usuario1.setNumeroRut(19523373);
      usuario1.setDigitoVerificador("k");
      usuario1.setFechaNacimiento(new Date(10000,11,23));
      usuario1.setTelefono(78945612);
      usuario1.setEmail("david.cogiolle@gmail.com");
      usuario1.setNombreUsuario("dcog");
      usuario1.setContrasena("Afds22231");
      
        System.out.println("Creado usuario: "+ usuario1.getPrimerNombre()+" "+usuario1.getApellidoPaterno());
        
      Usuario usuario2 = new Usuario();
      usuario2.setId(1001);
      usuario2.setPrimerNombre("Giovanni");
      usuario2.setSegundoNombre("Andres");
      usuario2.setApellidoPaterno("Adere");
      usuario2.setApellidoMaterno("Venegas");
      usuario2.setNumeroRut(19523374);
      usuario2.setDigitoVerificador("0");
      usuario2.setFechaNacimiento(new Date(10000,12,23));
      usuario2.setTelefono(12345674);
      usuario2.setEmail("gerr.adere@live.cl");
      usuario2.setNombreUsuario("ggft");
      usuario2.setContrasena("G1ovanniGg34");
      
              System.out.println("Creado usuario: "+ usuario2.getPrimerNombre()+" "+usuario2.getApellidoPaterno());

      Usuario usuario3 = new Usuario();
      usuario3.setId(1002);
      usuario3.setPrimerNombre("Sergio");
      usuario3.setSegundoNombre("Andres");
      usuario3.setApellidoPaterno("Villanueva");
      usuario3.setApellidoMaterno("Venegas");
      usuario3.setNumeroRut(19523375);
      usuario3.setDigitoVerificador("1");
      usuario3.setFechaNacimiento(new Date(10000,12,13));
      usuario3.setTelefono(78985236);
      usuario3.setEmail("sergio.villanueva@gmail.com");
      usuario3.setNombreUsuario("scodiio");
      usuario3.setContrasena("5534Gato33");
      
              System.out.println("Creado usuario: "+ usuario3.getPrimerNombre()+" "+usuario3.getApellidoPaterno());

      ClubDeportivo clubdeportivo1 = new ClubDeportivo();
      clubdeportivo1.setRolUnico("ARH11");
      clubdeportivo1.setNombreClub("Arsenal de Coquimbo");
      clubdeportivo1.setNombreFundador("Alberto Contri");
      clubdeportivo1.setAnoFundacion(1875);
      clubdeportivo1.setPaisOrigen("Yugoslavia");
      clubdeportivo1.setLema("Cañones a los puertos");
      clubdeportivo1.setColores("Amarillo, Rojo");
      clubdeportivo1.setValorSubscripcion(10050);
      
      ClubDeportivo clubdeportivo2 = new ClubDeportivo();
      clubdeportivo2.setRolUnico("MCH12");
      clubdeportivo2.setNombreClub("Manquehue City");
      clubdeportivo2.setNombreFundador("Primitivo Segundo");
      clubdeportivo2.setAnoFundacion(1935);
      clubdeportivo2.setPaisOrigen("Imeperio Otomano");
      clubdeportivo2.setLema("Vivir y Fuerza");
      clubdeportivo2.setColores("Celeste, Blanco");
      clubdeportivo2.setValorSubscripcion(15100);
      
      ClubDeportivo clubdeportivo3 = new ClubDeportivo();
      clubdeportivo3.setRolUnico("LCH13");
      clubdeportivo3.setNombreClub("Los Cóndores Unidos");
      clubdeportivo3.setNombreFundador("Petronila Torquemada");
      clubdeportivo3.setAnoFundacion(1961);
      clubdeportivo3.setPaisOrigen("URSS");
      clubdeportivo3.setLema("Desde lo alto al sol");
      clubdeportivo3.setColores("Amarillo, Naranjo");
      clubdeportivo3.setValorSubscripcion(13200);
        
      System.out.println("Creado Club: "+ clubdeportivo1.getNombreClub());
    
      Subscripcion subscripcion1 = new Subscripcion();
      subscripcion1.setInicioSubscripcion(new Date(10000,11,23));
      subscripcion1.setValorSubscripcion(25150);
      subscripcion1.setEquipo("ARH11 $10.050; MCH12 $15.100;");
      subscripcion1.setAbonoTotal(25150);
      subscripcion1.setUsuario(usuario1);
      subscripcion1.setClubDeportivo(clubdeportivo1);
      
      Subscripcion subscripcion2 = new Subscripcion();
      subscripcion2.setInicioSubscripcion(new Date(10000,07,13));
      subscripcion2.setValorSubscripcion(13200);
      subscripcion2.setEquipo("LCH13 $13.200");
      subscripcion2.setAbonoTotal(13200);
      subscripcion2.setUsuario(usuario2);
      subscripcion2.setClubDeportivo(clubdeportivo2);
      
      Subscripcion subscripcion3 = new Subscripcion();
      subscripcion3.setInicioSubscripcion(new Date(10000,10,13));
      subscripcion3.setValorSubscripcion(18300);
      subscripcion3.setEquipo("LCH13 $13.200;MCH12 $15.100");
      subscripcion3.setAbonoTotal(18300);
      subscripcion3.setUsuario(usuario3);
      subscripcion3.setClubDeportivo(clubdeportivo3);
    }
    
}
