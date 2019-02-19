/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricomcpato.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import ricomcpato.bl.Propiedad;
import ricomcpato.bl.Inquilino;
import ricomcpato.tl.Controller;

public class UI {

    static Controller gestor = new Controller();
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream imprimir = System.out;

    public static void main(String[] args) throws IOException {
        int opcion;
        boolean salirAplicacion;
        salirAplicacion = false;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            salirAplicacion = ejecutarAccion(opcion);
        } while (salirAplicacion == false);
    }

    public static void mostrarMenu() {
        imprimir.println("");
        imprimir.println("Menú Principal:");
        imprimir.println("");
        imprimir.println("1. Registrar una propiedad.");
        imprimir.println("2. Ver propiedades registradas.");
        imprimir.println("3. Buscar propiedad.");
        imprimir.println("4. Ver total de ganancias de alquileres.");
        imprimir.println("5. Registrar un inquilino.");
        imprimir.println("6. Ver inquilinos registrados.");
        imprimir.println("7. Buscar inquilino.");
        imprimir.println("8. Alquilar propiedad.");
        imprimir.println("9. Ver alquileres registrados.");
        imprimir.println("10. Salir");
    }

    public static int pedirOpcion() throws IOException {
        int opcion;
        opcion = Integer.parseInt(leer.readLine());
        return opcion;
    }

    public static boolean ejecutarAccion(int popcion) throws IOException {
        boolean salir;
        switch (popcion) {
            case 1:
                pedirInfoPropiedad();
                salir = false;
                break;

            case 2:
                mostrarPropiedades();
                salir = false;
                break;

            case 3:
                //busquedaPropiedad();
                salir = false;
                break;

            case 4:
                //mostrarTotalAlquileres();
                salir = false;
                break;
                
            case 5:
                pedirInfoInquilino();
                salir = false;
                break;
                
            case 6:
                mostrarInquilinos();
                salir = false;
                break;
                
            case 7:
                //busquedaInquilino();
                salir = false;
                break;
                
            case 8:
                //alquilarPropiedades();
                salir = false;
                break;

            case 9:
                //mostrarAlquileres();
                salir = false;
                break;

            case 10:
                salir = true;
                break;

            default:
                error(1);
                salir = false;
                break;
        }

        return salir;
    }

    public static void pedirInfoPropiedad() throws IOException {
        String nombre, direccion, residencial;
        int codigo, habitaciones, valor, numero, espacios, opcPatio, opcGaraje;
        boolean propiedadValida, patio, garaje;
        Propiedad nuevoRegistro;
        imprimir.println("");
        imprimir.println("");
        imprimir.println("Registro de propiedades");
        imprimir.println("");
        imprimir.println("Código:");
        codigo = Integer.parseInt(leer.readLine());
        imprimir.println("Nombre:");
        nombre = leer.readLine();
        imprimir.println("Precio de la propedad:");
        valor = Integer.parseInt(leer.readLine());
        imprimir.println("Direccion:");
        direccion = leer.readLine();
        imprimir.println("Residencial:");
        residencial = leer.readLine();
        imprimir.println("Numero de casa:");
        numero = Integer.parseInt(leer.readLine());
        imprimir.println("Tiene patio:");
        imprimir.println("  1. Si.");
        imprimir.println("  2. No.");
        opcPatio = Integer.parseInt(leer.readLine());
        if(opcPatio == 1){
            patio = true;
        }else{
            patio = false;
        }
        imprimir.println("Número de cuartos:");
        habitaciones = Integer.parseInt(leer.readLine());
        imprimir.println("Tiene garaje:");
        imprimir.println("  1. Si.");
        imprimir.println("  2. No.");
        opcGaraje = Integer.parseInt(leer.readLine());
        if(opcGaraje == 1){
            garaje = true;
            imprimir.println("Numero de espacios:");
            espacios = Integer.parseInt(leer.readLine());
        }else{
            garaje = false;
            espacios = 0;
        }

        nuevoRegistro = new Propiedad(codigo, nombre, valor, direccion, residencial, numero, patio, habitaciones, garaje, espacios);
        propiedadValida = gestor.validarPropiedad(nuevoRegistro);
        
        if (propiedadValida) {
            gestor.registrarPropiedad(nuevoRegistro);
        } else {
            error(2);
        }
    }
    
    public static void pedirInfoInquilino() throws IOException {
        String nombre, apellidos, correo, direccion, genero;
        int identificacion, telefono;
        boolean inquilinoValido;
        imprimir.println("");
        imprimir.println("");
        imprimir.println("Registro de inquilinos");
        imprimir.println("");
        imprimir.println("Nombre:");
        nombre = leer.readLine();
        imprimir.println("Apellidos:");
        apellidos = leer.readLine();
        imprimir.println("Correo electronico:");
        correo = leer.readLine();
        imprimir.println("Direccion:");
        direccion = leer.readLine();
        imprimir.println("Telefono:");
        telefono = Integer.parseInt(leer.readLine());
        imprimir.println("Identificacion:");
        identificacion = Integer.parseInt(leer.readLine());
        imprimir.println("Genero:");
        genero = leer.readLine();
        
        Inquilino nuevoRegistro = new Inquilino(nombre, apellidos, correo, direccion, telefono, identificacion, genero);
        
        inquilinoValido = gestor.validarInquilino(nuevoRegistro);
        if (inquilinoValido) {
            gestor.registrarInquilino(nuevoRegistro);
        } else {
            error(3);
        }
    }

    public static void mostrarPropiedades() {
        int i = 0;
        ArrayList<Propiedad> propiedades = gestor.pedirPropiedades();
        imprimir.println("Propiedades Registradas");
        imprimir.println();
        
        if(propiedades.size() == 0){
            imprimir.println("No hay propiedades registradas en este momento.");
        }
    
        for (Propiedad dato : propiedades) {
            if (dato != null) {
                imprimir.println((i + 1) + ". " + dato);
            }
            i++;
        }
    }
    
    public static void mostrarInquilinos() {
        int i = 0;
        ArrayList<Inquilino> inquilinos = gestor.pedirInquilinos();
        imprimir.println("Inuilinos Registradas");
        imprimir.println();
        
        if(inquilinos.size() == 0){
            imprimir.println("No hay propiedades registradas en este momento.");
        }
    
        for (Inquilino dato : inquilinos) {
            if (dato != null) {
                imprimir.println((i + 1) + ". " + dato);
            }
            i++;
        }
    }
    
//    public static void mostrarAlquileres() {
//        imprimir.println("Propiedades Alquileres");
//        imprimir.println();
//        imprimir.println("Cedula de Residente, Propiedad");
//        if (CL.cedulas[0] == 0) {
//            imprimir.println("No hay inquilinos registrados en este momento.");
//        }
//        for (int i = 0; i < CL.cedulas.length; i++) {
//            if (CL.cedulas[i] != 0) {
//                imprimir.println((i + 1) + ". " + CL.cedulas[i] + " - " + CL.propiedades[i]);
//            }
//        }
//    }
//
//    public static void mostrarTotalAlquileres() {
//        imprimir.println("El ingreso total de los alquileres de las propiedades registradas en este momento es de $" + CL.totalAlquileres);
//    }
//
//    public static void busquedaPropiedad() throws IOException {
//        String paramBusqueda, propiedad;
//        imprimir.println("Ingrese el codigo de la propiedad que desea buscar.");
//        paramBusqueda = leer.readLine();
//        propiedad = CL.buscarPropiedad(paramBusqueda);
//        imprimir.println(propiedad);
//    }
//    
//    public static void busquedaInquilino() throws IOException {
//        String paramBusqueda, inquilino;
//        imprimir.println("Ingrese la cedula o nombre del inquilino que desea buscar.");
//        paramBusqueda = leer.readLine();
//        inquilino = CL.buscarInquilino(paramBusqueda);
//        imprimir.println(inquilino);
//    }
//
//    public static void mostrarProvincias() {
//        imprimir.println("  1. San José");
//        imprimir.println("  2. Cartago");
//        imprimir.println("  3. Heredia");
//        imprimir.println("  4. Alajuela");
//        imprimir.println("  5. Puntarenas");
//        imprimir.println("  6. Guanacaste");
//        imprimir.println("  7. Limón");
//    }
//
//    public static void alquilarPropiedades()throws IOException{
//        int opcPropiedad, opcInquilino;
//        String propiedad, inquilino;
//        
//        imprimir.println("Alquiler de Propiedades");
//        imprimir.println("");
//        
//        imprimir.println("Escoja una propiedad a alquilar:");
//        mostrarPropiedades();
//        opcPropiedad = (Integer.parseInt(leer.readLine()))-1;
//        
//        imprimir.println("Escoja un inquilino para la propiedad escogida:");
//        mostrarInquilinos();
//        opcInquilino = (Integer.parseInt(leer.readLine()))-1;
//        
//        CL.ejecutarAlquiler(opcPropiedad, opcInquilino);
//        
//    }
    
    public static void error(int perror) {
        switch(perror){
            case 1:
                imprimir.println();
                imprimir.println("La opción que escogió no es válida, escoja entre las opciones del menú.");
                break;
                
            case 2:
                imprimir.println();
                imprimir.println("La propiedad que intentó registrar ya se encuentra registrada.");
                break;
                
            case 3:
                imprimir.println();
                imprimir.println("El inquilino que intentó registrar ya se encuentra registrado.");
                break;
                
            case 4:
                imprimir.println();
                imprimir.println("El alquiler no se pudo registrar correctamente.");
                
            default:
                break;
        }
        
    }
    
}
