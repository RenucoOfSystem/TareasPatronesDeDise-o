package Bridge.EmpresasDeEnvio;

public class EnvioPorMar implements MetodoDeEnvio{

    private String tipoEnvio;

    public EnvioPorMar() {
        this.tipoEnvio = "MAR";
    }
    @Override
    public String getTipoEnvio() {
        return tipoEnvio;
    }

    @Override
    public double porcentajeDeEnvio() {
        return 0.25;
    }
}
