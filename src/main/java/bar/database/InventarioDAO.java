package bar.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bar.sistema.BaseDeDatos;

public class InventarioDAO {
    public void insertarInventario(InventarioDTO inventario) {
        String sql = "INSERT OR REPLACE INTO Inventario(ID, RonDorado, Bitter, CocaCola, ZumoDeLimon)"
                + " VALUES(?,?,?,?,?)";
        try (Connection conn = BaseDeDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "1");
            pstmt.setFloat(2, inventario.getRonDorado());
            pstmt.setFloat(3, inventario.getBitter());
            pstmt.setFloat(4, inventario.getCocaCola());
            pstmt.setFloat(5, inventario.getZumoDeLimon());
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public InventarioDTO consultarInventario() {
        String sql = "SELECT * FROM Inventario WHERE ID = ?";
        InventarioDTO inventario = new InventarioDTO();
        try (Connection conn = BaseDeDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "1");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                inventario.setRonDorado(rs.getFloat("RonDorado"));
                inventario.setBitter(rs.getFloat("Bitter"));
                inventario.setCocaCola(rs.getFloat("CocaCola"));
                inventario.setZumoDeLimon(rs.getFloat("ZumoDeLimon"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return inventario;
    }

    public String actualizarInventario(InventarioDTO inventario) {
        String sql = "UPDATE Inventario SET (RonDorado,Bitter, CocaCola, ZumoDeLimon) = (?,?,?,?)"
                + "WHERE ID = 1 ";

        try (Connection conn = BaseDeDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setFloat(1, inventario.getRonDorado());
            pstmt.setFloat(2, inventario.getBitter());
            pstmt.setFloat(3, inventario.getCocaCola());
            pstmt.setFloat(4, inventario.getZumoDeLimon());
            pstmt.executeUpdate();
            return "Inventario eliminado";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: " + e.getMessage();
        }
    }
}
