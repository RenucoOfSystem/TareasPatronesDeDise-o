package PracticaTercerParcial.Composite;

public class Client {
    public static void main(String[]args){
        CompositeEntidad folder1 = new CompositeEntidad("Folder", "folder1");
        folder1.add(new Archivo("Archivo", "aaa hhh jjjj"));
        folder1.add(new Archivo("Archivo", "bbb k"));

        folder1.operation();
        System.out.println(folder1.getNumeroPalabras());

        CompositeEntidad folder2 = new CompositeEntidad("Folder", "folder2");
        folder2.add(new Archivo("Archivo", "aaa hhh jjjj as as"));
        folder2.add(new Archivo("Archivo", "bbb"));

        CompositeEntidad disco = new CompositeEntidad("Disco", "D");
        disco.add(folder1);
        disco.add(folder2);

        disco.operation();
        System.out.println(disco.getNumeroPalabras());



    }
}
