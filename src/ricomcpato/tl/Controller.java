package ricomcpato.tl;

import java.util.ArrayList;
import ricomcpato.bl.Propiedad;
import ricomcpato.bl.Inquilino;
import ricomcpato.cl.CL;

public class Controller {
    static CL logica = new CL();
    
    public boolean validarPropiedad(Propiedad nuevoRegistro){
        boolean valido = logica.verificarPropiedad(nuevoRegistro);
        return valido;
    }
    
    public void registrarPropiedad(Propiedad nuevoRegistro){
        logica.efectuarRegistroPropiedad(nuevoRegistro);
    }
    
    public ArrayList<Propiedad> pedirPropiedades(){
        ArrayList<Propiedad> datos = logica.enviarPropiedades();
        return datos;
    }
    
    public boolean validarInquilino(Inquilino nuevoRegistro){
        boolean valido = logica.verificarInquilino(nuevoRegistro);
        return valido;
    }
    
    public void registrarInquilino(Inquilino nuevoRegistro){
        logica.efectuarRegistroInquilino(nuevoRegistro);
    }
    
    public ArrayList<Inquilino> pedirInquilinos(){
        ArrayList<Inquilino> datos = logica.enviarInquilinos();
        return datos;
    }
}
