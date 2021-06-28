package PracticaTercerParcial.Visitor;

public class App implements IApp{
    @Override
    public void recomendarMatenimiento(Celular celular) {
        System.out.println("Recomendando mantenimiento para el celular...");
        celular.showInfo();
        System.out.println("Se recomienda un mantenimiento PREVENTIVO");

    }

    @Override
    public void recomendarMatenimiento(Computadora computadora) {
        System.out.println("***Recomendando mentenimiento para la computadora***");
        int random = (int)Math.floor(Math.random()*(100-1+1)+1);
        if(random%2==0)
            System.out.println("Se recomienda un tratamiento PREVENTIVO");
        else{
            System.out.println("Se recomienda un tratamiento CORRECTIVO");
        }

    }

    @Override
    public void recomendarMatenimiento(Televisor televisor) {
        System.out.println("Recomendando mantenimiento para el Televisor...");
        televisor.showInfo();

    }
}
