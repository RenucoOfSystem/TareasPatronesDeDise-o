package PracticaTercerParcial.Bridge;

public class Client {
    public static void main(String[]args){
        InstalacionAgua instalacionAgua = new InstalacionAgua(100, new PagoAppEmpresa(), 50);
        instalacionAgua.showInfo();
        instalacionAgua.pagar();


        InstalacionAlcantarillado instalacionAlcantarillado = new InstalacionAlcantarillado(100, new PagoTigoMoney());
        instalacionAlcantarillado.showInfo();
        instalacionAlcantarillado.pagar();

        InstalacionElectrica instalacionElectrica = new InstalacionElectrica(100, new PagoTransferenciaBancaria(), 10);
        instalacionElectrica.showInfo();
        instalacionElectrica.pagar();

        InstalacionElectrica instalacionElectrica1 = new InstalacionElectrica(150, new PagoEnEfectivo(), 20);
        instalacionElectrica1.showInfo();
        instalacionElectrica1.pagar();
    }
}
