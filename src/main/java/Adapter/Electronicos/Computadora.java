package Adapter.Electronicos;

public class Computadora implements IEmpresaA{

    private int serie;
    private String marca;
    private String calidad;


    public Computadora(int serie, String marca, String calidad) {
        System.out.println("Creando computadora");
        this.serie = serie;
        this.marca = marca;
        this.calidad = calidad;
    }

    public int getSerie() {
        return serie;
    }

    public String getMarca() {
        return marca;
    }

    public String getCalidad() {
        return calidad;
    }

    @Override
    public void obtenerPrecio() {
        switch (getMarca()){
            case "Apple":
                System.out.println("El precio es: 1000 sus");
                break;
            case "Samsung":
                System.out.println("El precio es: 700 sus");
                break;
            case "Huawei":
                System.out.println("El precio es: 500 sus");
                break;
            default:
                break;
        }

    }

    @Override
    public void obtenerTiempoDeVida() {
        switch (getCalidad()){
            case "Alta":
                System.out.println("El tiempo de vida es de 5 años");
                break;
            case "Media":
                System.out.println("El tiempo de vida es de 3 años");
                break;
            case "Baja":
                System.out.println("El tiempo de vida es de 2 años");
                break;
            default:
                break;

        }

    }
    void showInfo(){
        System.out.println("La marca es : " + marca);
        System.out.println("El numero de serie es: "+ serie);
        System.out.println("La calidad es: " +calidad);

    }
}
