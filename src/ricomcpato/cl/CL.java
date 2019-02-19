package ricomcpato.cl;
import java.util.ArrayList;
import ricomcpato.bl.Inquilino;
import ricomcpato.bl.Propiedad;

public class CL {

    public ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
    public ArrayList<Inquilino> inquilinos =  new ArrayList<Inquilino>();
    public int contadorPropiedades = 0;
    public int contadorInquilinos = 0;
    
    public void efectuarRegistroPropiedad(Propiedad nuevoRegistro){
        propiedades.add(nuevoRegistro);
        contadorPropiedades++;
    }
    
    public boolean verificarPropiedad(Propiedad nuevoRegistro){
        boolean valido = true;
        for(Propiedad dato : propiedades){
            if((dato.toString()).equals(nuevoRegistro.toString())){
                valido = false;
                break;
            }else{
                valido = true;
            }
        }
        
        return valido;
    }
    
    public ArrayList<Propiedad> enviarPropiedades(){
        return propiedades;
    }
    
    public void efectuarRegistroInquilino(Inquilino nuevoRegistro){
        inquilinos.add(nuevoRegistro);
        contadorInquilinos++;
    }
    
    public boolean verificarInquilino(Inquilino nuevoRegistro){
        boolean valido = true;
        for(Inquilino dato : inquilinos){
            if((dato.toString()).equals(nuevoRegistro.toString())){
                valido = false;
                break;
            }else{
                valido = true;
            }
        }
        
        return valido;
    }
    
    public ArrayList<Inquilino> enviarInquilinos(){
        return inquilinos;
    }
}
