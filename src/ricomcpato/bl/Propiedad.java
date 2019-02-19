/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricomcpato.bl;

/**
 *
 * @author esteb
 */
public class Propiedad {
    protected int codigo;
    protected String nombre;
    protected int valor;
    protected String direccion;
    protected String residencial;
    protected int numero;
    protected boolean patio;
    protected int habitaciones;
    protected boolean garaje;
    protected int espacios;

    public Propiedad(int codigo, String nombre, int valor, String direccion, String residencial, int numero, boolean patio, int habitaciones, boolean garaje, int espacios) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
        this.direccion = direccion;
        this.residencial = residencial;
        this.numero = numero;
        this.patio = patio;
        this.habitaciones = habitaciones;
        this.garaje = garaje;
        this.espacios = espacios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getResidencial() {
        return residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    @Override
    public String toString() {
        String strPatio, strGaraje, propiedad;
        if(patio){
            strPatio = "Si";
        }else{
            strPatio = "No";
        }
        
        if(garaje){
            strGaraje = "Si";
            propiedad = "Codigo: " + codigo + ", Nombre: " + nombre + ", Valor: " + valor + ", Direccion: " + direccion + ", Residencial: " + residencial + ", Numero de casa:" + numero + ", Patio: " + strPatio + ", Cantidad de habitaciones: " + habitaciones + ", Garaje: " + strGaraje + ", Espacios:" + espacios;
        }else{
            strGaraje = "No";
            propiedad = "Codigo: " + codigo + ", Nombre: " + nombre + ", Valor: " + valor + ", Direccion: " + direccion + ", Residencial: " + residencial + ", Numero de casa:" + numero + ", Patio: " + strPatio + ", Cantidad de habitaciones: " + habitaciones + ", Garaje: " + strGaraje;
        }
        
        return propiedad;
    }
    
    
}
