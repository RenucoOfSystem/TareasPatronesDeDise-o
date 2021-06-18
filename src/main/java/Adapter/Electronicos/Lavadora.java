package Adapter.Electronicos;

public class Lavadora implements IEmpresaB{

    private int serie;
    private String tamaño;
    private String clase;
    private boolean garantiaExtendida;

    public Lavadora(int serie, String tamaño, String clase, boolean garantiaExtendida) {
        this.serie = serie;
        this.tamaño = tamaño;
        this.clase = clase;
        this.garantiaExtendida = garantiaExtendida;
    }

    public int getSerie() {
        return serie;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getClase() {
        return clase;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    @Override
    public void obtenerCosto() {

    }

    @Override
    public void obtenerTiempoDeGarantia() {

    }
}
