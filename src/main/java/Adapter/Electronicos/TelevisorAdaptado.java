package Adapter.Electronicos;

public class TelevisorAdaptado implements IEmpresaA{
    private Televisor teleAdaptee;

    public TelevisorAdaptado(Televisor tele) {
        System.out.println("***Adaptando televisor***");
        this.teleAdaptee = tele;
    }

    @Override
    public void obtenerPrecio() {
        teleAdaptee.obtenerCosto();
    }

    @Override
    public void obtenerTiempoDeVida() {
        switch (teleAdaptee.getClase()){
            case "A":
                System.out.println("El tiempo de vida es de 5 años");
                break;
            case "B":
                System.out.println("El tiempo de vida es de 3 años");
                break;
            case "C":
                System.out.println("El tiempo de vida es de 2 años");
                break;
            default:
                break;

        }

    }
}
