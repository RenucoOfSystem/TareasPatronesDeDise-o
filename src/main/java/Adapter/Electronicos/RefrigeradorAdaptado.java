package Adapter.Electronicos;

public class RefrigeradorAdaptado implements IEmpresaA{
    private Refrigerador refriAdaptee;

    public RefrigeradorAdaptado(Refrigerador refri) {
        System.out.println("***Adaptando refri***");
        this.refriAdaptee = refri;
    }

    @Override
    public void obtenerPrecio() {
        refriAdaptee.obtenerCosto();
    }

    @Override
    public void obtenerTiempoDeVida() {
        switch (refriAdaptee.getClase()){
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
