package Adapter.Electronicos;

public class LavadoraAdaptada implements IEmpresaA{

    private Lavadora lavadoraAdaptee ;

    public LavadoraAdaptada(Lavadora lavadora){
        System.out.println("***Adaptando lavadora***");
        this.lavadoraAdaptee = lavadora;
    }


    @Override
    public void obtenerPrecio() {
        lavadoraAdaptee.obtenerCosto();


    }

    @Override
    public void obtenerTiempoDeVida() {
        switch (lavadoraAdaptee.getClase()){
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
