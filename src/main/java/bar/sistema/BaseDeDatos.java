package bar.sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {

    static Connection conexion = null;

    public static Connection  conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:guarapita.db");
            if (conexion != null) {
                System.out.println("Conexion Exitosa");
                return conexion;
            }
        } catch (SQLException e) {
            System.out.println("Conexion Fallida: " + e.getMessage());
        }
        return null;
    }

    void Tablas() {

        String sqlNomina = "CREATE TABLE IF NOT EXISTS Nomina (\n"
                + "	Cedula TEXT PRIMARY KEY NOT NULL,\n"
                + "	Nombre TEXT NOT NULL,\n"
                + "	Apellido TEXT NOT NULL,\n"
                + "	User TEXT NOT NULL,\n"
                + "	Password TEXT NOT NULL,\n"
                + "	TipoDeUser TEXT NOT NULL,\n"
                + "	Autorizacion TEXT NOT NULL"
                + ");";

        String sqlInventario = "CREATE TABLE IF NOT EXISTS Inventario (\n"
                + "	ID INTEGER PRIMARY KEY,\n"
                + "	RonDorado TEXT NOT NULL,\n"
                + "	Bitter TEXT NOT NULL,\n"
                + "	CocaCola TEXT NOT NULL,\n"
                + "	ZumoDeLimon TEXT NOT NULL"
                + ");";

        String sqlVentas = "CREATE TABLE IF NOT EXISTS Ventas (\n"
                + "	Fecha TEXT PRIMARY KEY,\n"
                + "	CubaLibre TEXT NOT NULL,\n"
                + "	Total TEXT NOT NULL\n"
                + ");";

        try (Connection conn = conectar();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sqlNomina);
            stmt.execute(sqlInventario);
            stmt.execute(sqlVentas);
            System.out.println("Nomina Funcionando.");
            System.out.println("Inventario Funcionando.");
            System.out.println("Ventas Funcionando.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
