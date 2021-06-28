package PracticaTercerParcial.Adapter;

public class Client {
    public static void main(String[]args){
        Android android = new Android("Renuco1", "111", "aaaa");
        android.loguIn();
        android.logOut();
        android.reporte();

        WindowsPhone windowsPhone = new WindowsPhone("Renuco2", "222", "bbb");
        windowsPhone.loguIn();
        windowsPhone.logOut();
        windowsPhone.reporte();

        IOs iOs = new IOs("Renuco3", "333", "ccc");
        iOs.loguIn();
        iOs.logOut();
        iOs.reporte();

        AplicacionEscritorio aplicacionEscritorio = new AplicacionEscritorio("Renuco4", "000", "ppp", "1929913");
        aplicacionEscritorio.iniciarSesion();
        aplicacionEscritorio.cerrarSesion();
        aplicacionEscritorio.generacionDeDatos();

        AplicacionesWeb aplicacionesWeb = new AplicacionesWeb("Renuco5", "999", "ooo", "988753");
        aplicacionesWeb.iniciarSesion();
        aplicacionesWeb.cerrarSesion();
        aplicacionesWeb.generacionDeDatos();

        AndroidAdaptado androidAdaptado = new AndroidAdaptado(android);
        androidAdaptado.iniciarSesion();
        androidAdaptado.cerrarSesion();
        androidAdaptado.generacionDeDatos();

        WindowsPhoneAdaptado windowsPhoneAdaptado = new WindowsPhoneAdaptado(windowsPhone);
        windowsPhoneAdaptado.iniciarSesion();
        windowsPhoneAdaptado.cerrarSesion();
        windowsPhoneAdaptado.generacionDeDatos();

        IOsAdaptado iOsAdaptado = new IOsAdaptado(iOs);
        iOsAdaptado.iniciarSesion();
        iOsAdaptado.cerrarSesion();
        iOsAdaptado.generacionDeDatos();
    }
}
