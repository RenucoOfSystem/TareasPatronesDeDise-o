package Bridge.EmpresasDeEnvio;

public class EmpresaSRL implements IEmpresa{

    private String nombreEmpresa;
    private int nit;
    private Paquete paquete;
    protected MetodoDeEnvio metodoDeEnvio;

    public EmpresaSRL(MetodoDeEnvio metodoDeEnvio){
        this.metodoDeEnvio = metodoDeEnvio;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public void showInfo() {
        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("Nit de la empresa: " + nit);
        paquete.showInfoPaquete();
    }

    @Override
    public void enviarPaquete() {
        System.out.println("Enviando el paquete por " +metodoDeEnvio.getTipoEnvio()+"...");
        System.out.println("Precio original del paquete: "+paquete.getPrecioPaquete());
        double precioTotal = (double)paquete.getPrecioPaquete()+(paquete.getPrecioPaquete()* metodoDeEnvio.porcentajeDeEnvio());
        System.out.println("Total mas envio: "+ precioTotal);

    }
}
