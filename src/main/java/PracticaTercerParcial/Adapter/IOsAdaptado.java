package PracticaTercerParcial.Adapter;

public class IOsAdaptado implements IEmpresaWeb{

    private String ipDefault;
    private IOs iOsAdaptee;

    public IOsAdaptado(IOs iOsAdaptee) {
        System.out.println("Adaptando IOs");
        this.iOsAdaptee = iOsAdaptee;
        this.ipDefault = "192.168.0.1";
    }

    public String getIpDefault() {
        return ipDefault;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Ingresando al perfil en la pagina web de: "+this.iOsAdaptee.getUsuario());
        System.out.println("Desde: " + getIpDefault());
        System.out.println("Con el password: " + this.iOsAdaptee.getPwd());
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Saliendo del perfil : " + this.iOsAdaptee.getUsuario());
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("Datos generados : " + this.iOsAdaptee.getReportes());
    }

    @Override
    public void showInfo() {
        System.out.println("Perfil: " + iOsAdaptee.getUsuario());
        System.out.println("Password: " + iOsAdaptee.getPwd());
        System.out.println("Datos generados: " + iOsAdaptee.getReportes());
        System.out.println("Ip usada: " + getIpDefault());
    }
}
