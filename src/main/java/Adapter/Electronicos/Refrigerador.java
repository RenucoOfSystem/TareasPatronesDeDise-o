package Adapter.Electronicos;

public class Refrigerador implements IEmpresaB{

    private int serie;
    private String tamano;
    private String clase;
    private boolean garantiaExtendida;

    public Refrigerador(int serie, String tamano, String clase, boolean garantiaExtendida) {
        System.out.println("Creando refrigerador");
        this.serie = serie;
        this.tamano = tamano;
        this.clase = clase;
        this.garantiaExtendida = garantiaExtendida;
    }

    public int getSerie() {
        return serie;
    }

    public String getTamano() {
        return tamano;
    }

    public String getClase() {
        return clase;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    @Override
    public void obtenerCosto() {
        switch (getTamano()){
            case "Grande":
                System.out.println("El costo es de 2000 sus");
                break;
            case "Mediano":
                System.out.println("El costo es de 1500 sus");
                break;
            case "Pequeño":
                System.out.println("El costo es de 1200 sus");
                break;
            default:
                break;

        }

    }

    @Override
    public void obtenerTiempoDeGarantia() {
        if(isGarantiaExtendida())
            System.out.println("La garantia es de 5 años");
        else {
            System.out.println("La garantia es de 2 años");
        }


    }
    void showInfo(){
        System.out.println("El tamaño es : " + tamano);
        System.out.println("El numero de serie es: "+ serie);
        System.out.println("La clase es: " +clase);

    }
}
