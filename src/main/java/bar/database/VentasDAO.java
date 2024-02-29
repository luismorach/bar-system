package bar.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import bar.sistema.BaseDeDatos;

public class VentasDAO {

    public String añadirVenta(VentasDTO venta) {
        String sql = "INSERT OR REPLACE INTO Ventas(Fecha,CubaLibre, Total)"
                + " VALUES(?,?,?)";
        try (Connection conn = BaseDeDatos.conectar();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, venta.getFecha());
            pstmt.setString(2, venta.getCubaLibre());
            pstmt.setInt(3, venta.getTotal());
            pstmt.executeUpdate();
           return "Venta Registrada Con Exito";
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: "+ e.getMessage();

        }
    }

    public VentasDTO consultarVentas() {
        String sql = "SELECT CubaLibre, Total, Fecha FROM Ventas";
        VentasDTO venta = new VentasDTO();
        try (Connection conn = BaseDeDatos.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                venta.setTotal(rs.getInt("Total"));
                venta.setCubaLibre(rs.getString("CubaLibre"));
                venta.setFecha(rs.getString("Fecha"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return venta;
    }
}
