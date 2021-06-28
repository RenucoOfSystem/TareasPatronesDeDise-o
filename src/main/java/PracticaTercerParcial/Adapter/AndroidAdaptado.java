package PracticaTercerParcial.Adapter;

public class AndroidAdaptado implements IEmpresaWeb{

    private String ipDefault;
    private Android androidAdaptee;

    public AndroidAdaptado(Android androidAdaptee) {
        System.out.println("Adaptando android");
        this.androidAdaptee = androidAdaptee;
        this.ipDefault = "192.168.0.1";
    }

    public String getIpDefault() {
        return ipDefault;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Ingresando al perfil en la pagina web de: "+this.androidAdaptee.getUsuario());
        System.out.println("Desde: " + getIpDefault());
        System.out.println("Con el password: " + this.androidAdaptee.getPwd());
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Saliendo del perfil : " + this.androidAdaptee.getUsuario());
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("Datos generados : " + this.androidAdaptee.getReportes());
    }

    @Override
    public void showInfo() {
        System.out.println("Perfil: " + androidAdaptee.getUsuario());
        System.out.println("Password: " + androidAdaptee.getPwd());
        System.out.println("Datos generados: " + androidAdaptee.getReportes());
        System.out.println("Ip usada: " + getIpDefault());
    }
}
