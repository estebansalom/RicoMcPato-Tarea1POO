
package ricomcpato.bl;

public class Inquilino {
   private String nombre;
   private String apellidos;
   private String correo;
   private String direccion;
   private int telefono;
   private int identificacion;
   private String genero;

    public Inquilino(String nombre, String apellidos, String correo, String direccion, int telefono, int identificacion, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String isGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", direccion=" + direccion + ", telefono=" + telefono + ", identificacion=" + identificacion + ", genero=" + genero + '}';
    }
   
   
}
