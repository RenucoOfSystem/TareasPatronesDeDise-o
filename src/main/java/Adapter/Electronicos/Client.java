package Adapter.Electronicos;

public class Client {
    public static void main(String [] args){
        Celular celular = new Celular(001, "Samsung", "Baja");
        celular.showInfo();
        celular.obtenerPrecio();
        celular.obtenerTiempoDeVida();


        Computadora computadora = new Computadora(222, "Apple", "Media");
        computadora.showInfo();
        computadora.obtenerPrecio();
        computadora.obtenerTiempoDeVida();

        Tablet tablet = new Tablet(333, "Huawei", "Alta");
        tablet.showInfo();
        tablet.obtenerPrecio();
        tablet.obtenerTiempoDeVida();

        Lavadora lavadora = new Lavadora(999, "Pequeño", "C", false);
        lavadora.showInfo();
        lavadora.obtenerCosto();
        lavadora.obtenerTiempoDeGarantia();

        Refrigerador refrigerador = new Refrigerador(888, "Grande", "A", true);
        refrigerador.showInfo();
        refrigerador.obtenerCosto();
        refrigerador.obtenerTiempoDeGarantia();

        Televisor televisor = new Televisor(777, "Mediano", "B", false);
        televisor.showInfo();
        televisor.obtenerCosto();
        televisor.obtenerTiempoDeGarantia();

        LavadoraAdaptada lavadoraAdaptada = new LavadoraAdaptada(lavadora);
        lavadoraAdaptada.obtenerPrecio();
        lavadoraAdaptada.obtenerTiempoDeVida();

        RefrigeradorAdaptado refrigeradorAdaptado = new RefrigeradorAdaptado(refrigerador);
        refrigeradorAdaptado.obtenerPrecio();
        refrigeradorAdaptado.obtenerTiempoDeVida();

        TelevisorAdaptado televisorAdaptado = new TelevisorAdaptado(televisor);
        televisorAdaptado.obtenerPrecio();
        televisorAdaptado.obtenerTiempoDeVida();

    }
}
