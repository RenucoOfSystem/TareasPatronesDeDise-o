package Bridge.EmpresasDeEnvio;

public class EnvioPorTierra implements MetodoDeEnvio{

    private String tipoEnvio;

    public EnvioPorTierra() {
        this.tipoEnvio = "TIERRA";
    }
    @Override
    public String getTipoEnvio() {
        return tipoEnvio;
    }

    @Override
    public double porcentajeDeEnvio() {
        return 0.05;
    }
}
