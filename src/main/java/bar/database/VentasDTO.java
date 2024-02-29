package bar.database;

public class VentasDTO {
    String Fecha;
    String CubaLibre;
    int Total;
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public String getCubaLibre() {
        return CubaLibre;
    }
    public void setCubaLibre(String cubaLibre) {
        CubaLibre = cubaLibre;
    }
    public int getTotal() {
        return Total;
    }
    public void setTotal(int total) {
        Total = total;
    }
}
