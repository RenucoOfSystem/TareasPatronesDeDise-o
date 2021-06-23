package Bridge.EmpresasDeEnvio;

public class Paquete {

    private String nombrePaquete;
    private int precioPaquete;

    public Paquete(String nombrePaquete, int precioPaquete) {
        this.nombrePaquete = nombrePaquete;
        this.precioPaquete = precioPaquete;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public int getPrecioPaquete() {
        return precioPaquete;
    }

    public void showInfoPaquete(){
        System.out.println("Nombre del paquete: " + getNombrePaquete());
        System.out.println("Precio: " + getPrecioPaquete());

    }
}
