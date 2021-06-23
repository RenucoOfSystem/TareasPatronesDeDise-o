package Bridge.EmpresasDeEnvio;

public class EnvioPorAire implements MetodoDeEnvio{

    private String tipoEnvio;

    public EnvioPorAire() {
        this.tipoEnvio = "AIRE";
    }
    @Override
    public String getTipoEnvio() {
        return tipoEnvio;
    }

    @Override
    public double porcentajeDeEnvio() {
        return 0.10;
    }
}
