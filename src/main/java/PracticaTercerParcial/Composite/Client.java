package PracticaTercerParcial.Composite;

public class Client {
    public static void main(String[]args){
        CompositeEntidad folder1 = new CompositeEntidad("Folder", "folder1", 0);
        folder1.add(new Archivo("Archivo", "aaa", 10));
        folder1.add(new Archivo("Archivo", "bbb", 10));
        folder1.add(new Archivo("Archivo", "ccc", 10));
        folder1.showNumeroDePalabras();

        CompositeEntidad folder2 = new CompositeEntidad("Folder", "folder2", 0);
        folder2.add(new Archivo("Archivo", "ppp", 10));
        folder2.add(new Archivo("Archivo", "ooo", 10));
        folder2.add(new Archivo("Archivo", "iii", 10));

        CompositeEntidad unidadDeDisco = new CompositeEntidad("Disco", "Disco D", 0);
        unidadDeDisco.add(folder2);
        unidadDeDisco.add(folder1);

        unidadDeDisco.operation();
        unidadDeDisco.showNumeroDePalabras();
    }
}
