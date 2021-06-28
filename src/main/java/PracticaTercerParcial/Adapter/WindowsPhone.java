package PracticaTercerParcial.Adapter;

public class WindowsPhone implements IEmpresaAplicaciones{

    private String usuario;
    private String pwd;
    private String reportes;

    public WindowsPhone(String usuario, String pwd, String reportes) {
        System.out.println("Creando aplicacion para Windows Phone");
        this.usuario = usuario;
        this.pwd = pwd;
        this.reportes = reportes;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPwd() {
        return pwd;
    }

    public String getReportes() {
        return reportes;
    }

    @Override
    public void loguIn() {
        System.out.println("Ingresando a la cuenta de: " + getUsuario());
        System.out.println("Con el password: " + getPwd());

    }

    @Override
    public void logOut() {
        System.out.println("Saliendo de la cuentade : " + getUsuario());

    }

    @Override
    public void reporte() {
        System.out.println("El reporte es: " + getReportes());

    }

    @Override
    public void showInfo() {
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Password: " + getPwd());
        System.out.println("Reportes: " + getReportes());

    }

}
