/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar.sistema;


import java.util.ArrayList;

import bar.database.InventarioDAO;
import bar.database.InventarioDTO;
import bar.database.UsuariosDAO;
import bar.database.UsuariosDTO;
import bar.database.VentasDAO;
import bar.database.VentasDTO;
import bar.util.Instancia;

/**
 *
 * @author Administrador
 */
public class Facade {
    public Facade(){}

    public static int c;
    static InventarioDAO acceso = (InventarioDAO) Instancia.getInstancia("bar.database.InventarioDAO");
    static VentasDAO acceso1 = (VentasDAO) Instancia.getInstancia("bar.database.VentasDAO");
    static UsuariosDAO acceso7 = (UsuariosDAO) Instancia.getInstancia("bar.database.UsuariosDAO");

   
    public static String AñadirUsuarios(UsuariosDTO Usuario) {
        return acceso7.setUser(Usuario);
    } 
    public static ArrayList<UsuariosDTO>  ConsultarUsuarios() {
        return acceso7.getUsers();
    }
    public static UsuariosDTO ConsultarUsuario(String user,String password,String tipo) {
        return acceso7.getUser(user,password,tipo);
    }
    public static UsuariosDTO ConsultarUsuario(String cedula) {
        return acceso7.getUser(cedula);
    }
    public static String EliminarUsuario(String cedula) {
        return acceso7.deleteUser(cedula);
    }
   
    public static String ActualizarUsuarios(String cedula, UsuariosDTO user) {
        return acceso7.updateUser(cedula, user);
    } 
    public static void agregarInventario(InventarioDTO inventario){
        acceso.insertarInventario(inventario);
    }
    public static InventarioDTO consultarInventario(){
        return acceso.consultarInventario();
    }
    public static String actualizarInventario(InventarioDTO inventario) {
        return acceso.actualizarInventario(inventario);
    }
    public static String insertarVenta(VentasDTO venta){
       return acceso1.añadirVenta(venta);
    }
    public static VentasDTO consultarVentas(){
       return  acceso1.consultarVentas();
    }
     
}
