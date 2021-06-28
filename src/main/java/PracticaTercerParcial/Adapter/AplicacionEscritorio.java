package PracticaTercerParcial.Adapter;

public class AplicacionEscritorio implements IEmpresaWeb{

    private String usuario;
    private String pwd;
    private String datosGenerados;
    private String ip;

    public AplicacionEscritorio(String usuario, String pwd, String datosGenerados, String ip) {
        System.out.println("Creando aplicacion de escritorio");
        this.usuario = usuario;
        this.pwd = pwd;
        this.datosGenerados = datosGenerados;
        this.ip = ip;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPwd() {
        return pwd;
    }

    public String getDatosGenerados() {
        return datosGenerados;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Ingresando al perfil de la app de escritorio: "+getUsuario());
        System.out.println("Desde: "+getIp());
        System.out.println("Con el password: " + getPwd());

    }

    @Override
    public void cerrarSesion() {
        System.out.println("Saliendo del perfil : " + getUsuario());
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("Se generaros los siguientes datos: " + getDatosGenerados());

    }

    @Override
    public void showInfo() {
        System.out.println("Perfil: " + getUsuario());
        System.out.println("Password: " + getPwd());
        System.out.println("Datos generados: " + getDatosGenerados());
        System.out.println("Ip usada: " + getIp());

    }
}
