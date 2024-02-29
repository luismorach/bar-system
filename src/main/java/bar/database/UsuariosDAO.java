package bar.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bar.sistema.BaseDeDatos;

public class UsuariosDAO {

    public UsuariosDTO getUser(String user, String password,String tipo) {
        
        UsuariosDTO result=new UsuariosDTO();
        String sql = "SELECT User, Password, TipoDeUser, Autorizacion "
                + "FROM Nomina WHERE User = ? AND Password = ? AND TipoDeUser = ?";

        try (Connection conn = BaseDeDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            pstmt.setString(3, tipo);
            ResultSet rs = pstmt.executeQuery();
           
            while (rs.next()) {
                result.setUser(rs.getString("User"));
                result.setPassword(rs.getString("Password"));
                result.setTipoDeUser(rs.getString("TipoDeUser"));
                result.setAutorizacion(rs.getString("Autorizacion"));
                result.setCedula(rs.getString("Cedula"));
                result.setNombre(rs.getString("Nombre"));
                result.setApellido(rs.getString("Apellido"));
                System.out.println(user + " - " + password);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public ArrayList<UsuariosDTO>  getUsers() {
        ArrayList<UsuariosDTO> users=new ArrayList<>();
        UsuariosDTO result;
        String sql = "SELECT * FROM Nomina";

        try (Connection conn = BaseDeDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
           
            while (rs.next()) {
                result=new UsuariosDTO();
                result.setUser(rs.getString("User"));
                result.setPassword(rs.getString("Password"));
                result.setTipoDeUser(rs.getString("TipoDeUser"));
                result.setAutorizacion(rs.getString("Autorizacion"));
                result.setCedula(rs.getString("Cedula"));
                result.setNombre(rs.getString("Nombre"));
                result.setApellido(rs.getString("Apellido"));
                users.add(result);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }
    public UsuariosDTO getUser(String cedula) {
        
        UsuariosDTO result=new UsuariosDTO();
        String sql = "SELECT * FROM Nomina WHERE Cedula = ?";

        try (Connection conn = BaseDeDatos.conectar();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();
           
            while (rs.next()) {
                result.setUser(rs.getString("User"));
                result.setPassword(rs.getString("Password"));
                result.setTipoDeUser(rs.getString("TipoDeUser"));
                result.setAutorizacion(rs.getString("Autorizacion"));
                result.setCedula(rs.getString("Cedula"));
                result.setNombre(rs.getString("Nombre"));
                result.setApellido(rs.getString("Apellido"));
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public String setUser(UsuariosDTO user){
         String sql = "INSERT OR REPLACE INTO Nomina "
                + "(Nombre, Apellido, Cedula, User, Password, TipoDeUser, Autorizacion) "
                + "VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = BaseDeDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getNombre().trim());
            pstmt.setString(2, user.getApellido().trim());
            pstmt.setString(3, user.getCedula().trim());
            pstmt.setString(4, user.getUser().trim());
            pstmt.setString(5, user.getPassword().trim());
            pstmt.setString(6, user.getTipoDeUser());
            pstmt.setString(7, user.getAutorizacion());
            pstmt.executeUpdate();
            return "Usuario: " + user.getUser() +" "+ user.getTipoDeUser()
            + "\n Registrado \n Y " + user.getAutorizacion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: "+ e.getMessage();
        }
    }
    public String updateUser(String cedula,UsuariosDTO user){
         String sql = "UPDATE Nomina SET (Nombre, Apellido, Cedula, User, Password, Autorizacion) = (?,?,?,?,?,?)"
                + "WHERE Cedula = ? ";

        try (Connection conn = BaseDeDatos.conectar();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getNombre().trim());
            pstmt.setString(2, user.getApellido().trim());
            pstmt.setString(3, user.getCedula().trim());
            pstmt.setString(4, user.getUser().trim());
            pstmt.setString(5, user.getPassword().trim());
            pstmt.setString(6, user.getAutorizacion());
            pstmt.setString(7, cedula);
            pstmt.executeUpdate();
            return "Actualizacion Exitosa";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: "+ e.getMessage();
        }
    }
    public String deleteUser(String cedula){
         String sql = "DELETE FROM Nomina WHERE Cedula = ?";
        try (Connection conn = BaseDeDatos.conectar();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            pstmt.executeUpdate();
           return "Eliminacion Exitosa";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: "+ e.getMessage();
        }
    }
}
