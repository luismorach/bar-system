package bar.database;

public class UsuariosDTO {
    String User;
    String Password;
    String tipoDeUser;
    String Autorizacion;
    String nombre;
     String apellido; 
     String Cedula;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getUser() {
        return User;
    }
    public void setUser(String user) {
        User = user;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getTipoDeUser() {
        return tipoDeUser;
    }
    public void setTipoDeUser(String admin) {
        tipoDeUser = admin;
    }
    public String getAutorizacion() {
        return Autorizacion;
    }
    public void setAutorizacion(String autorizacion) {
        Autorizacion = autorizacion;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getUser();
    }
}
