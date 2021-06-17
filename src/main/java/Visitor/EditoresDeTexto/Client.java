package Visitor.EditoresDeTexto;

public class Client {
    public static void main(String[]args){
        Sublime archivo1 = new Sublime(".java");
        archivo1.showInfo();
        archivo1.crear("hola al franco");
        archivo1.showInfo();
        archivo1.editar("ola franco");



        Word archivo2 = new Word( );
        archivo2.showInfo();
        archivo2.crear("hola al Franco");
        archivo2.showInfo();
        archivo2.editar("ola francoooooo");



        NotePad archivo3 = new NotePad( );
        archivo3.showInfo();
        archivo3.crear("hola al franco123");
        archivo3.showInfo();
        archivo3.editar("ola franco8888888");
        Plugin plugin = new Plugin();

        archivo1.accept(plugin);
        archivo2.accept(plugin);
        archivo3.accept(plugin);

    }
}
