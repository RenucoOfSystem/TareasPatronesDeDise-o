package PracticaTercerParcial.Adapter;

public class WindowsPhoneAdaptado implements IEmpresaWeb{

    private String ipDefault;
    private WindowsPhone windowsPhone;

    public WindowsPhoneAdaptado(WindowsPhone windowsPhone) {
        System.out.println("Adaptando windowsPhone");
        this.windowsPhone = windowsPhone;
        this.ipDefault = "192.168.0.1";
    }

    public String getIpDefault() {
        return ipDefault;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Ingresando al perfil en la pagina web de: "+this.windowsPhone.getUsuario());
        System.out.println("Desde: " + getIpDefault());
        System.out.println("Con el password: " + this.windowsPhone.getPwd());
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Saliendo del perfil : " + this.windowsPhone.getUsuario());
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("Datos generados : " + this.windowsPhone.getReportes());
    }

    @Override
    public void showInfo() {
        System.out.println("Perfil: " + windowsPhone.getUsuario());
        System.out.println("Password: " + windowsPhone.getPwd());
        System.out.println("Datos generados: " + windowsPhone.getReportes());
        System.out.println("Ip usada: " + getIpDefault());
    }
}
