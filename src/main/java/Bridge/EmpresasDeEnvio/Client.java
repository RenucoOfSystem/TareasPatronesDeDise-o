package Bridge.EmpresasDeEnvio;

public class Client {
    public static void main(String[]args){
        EmpresaSA empresaSA = new EmpresaSA(new EnvioPorMar());
        empresaSA.setNombreEmpresa("Empresa 1");
        empresaSA.setNit(111);
        empresaSA.setPaquete(new Paquete("Paquete1", 100));
        empresaSA.showInfo();
        empresaSA.enviarPaquete();

        EmpresaSA empresaSA1= new EmpresaSA(new EnvioPorAire());
        empresaSA1.setNombreEmpresa("Empresa2");
        empresaSA1.setNit(222);
        empresaSA1.setPaquete(new Paquete("Paquete2", 100));
        empresaSA1.showInfo();
        empresaSA1.enviarPaquete();

        EmpresaSA empresaSA2= new EmpresaSA(new EnvioPorTierra());
        empresaSA2.setNombreEmpresa("Empresa3");
        empresaSA2.setNit(333);
        empresaSA2.setPaquete(new Paquete("Paquete3", 100));
        empresaSA2.showInfo();
        empresaSA2.enviarPaquete();

        EmpresaSRL empresaSRL = new EmpresaSRL(new EnvioPorTierra());
        empresaSRL.setNombreEmpresa("EmpresaSRL1");
        empresaSRL.setNit(999);
        empresaSRL.setPaquete(new Paquete("PaqueteSRL1", 200));
        empresaSRL.showInfo();
        empresaSRL.enviarPaquete();

        EmpresaSRL empresaSRL2 = new EmpresaSRL(new EnvioPorAire());
        empresaSRL2.setNombreEmpresa("EmpresaSRL2");
        empresaSRL2.setNit(888);
        empresaSRL2.setPaquete(new Paquete("PaqueteSRL2", 200));
        empresaSRL2.showInfo();
        empresaSRL2.enviarPaquete();

        EmpresaSRL empresaSRL3 = new EmpresaSRL(new EnvioPorMar());
        empresaSRL3.setNombreEmpresa("EmpresaSRL3");
        empresaSRL3.setNit(777);
        empresaSRL3.setPaquete(new Paquete("PaqueteSRL3", 200));
        empresaSRL3.showInfo();
        empresaSRL3.enviarPaquete();

    }
}
