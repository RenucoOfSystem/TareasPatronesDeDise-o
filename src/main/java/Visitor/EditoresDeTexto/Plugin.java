package Visitor.EditoresDeTexto;

public class Plugin implements IPlugin{

    public Plugin(){System.out.println("Creando plugin");}

    @Override
    public void saveAsPDF(Sublime sublime) {
        System.out.println("Guardando como pdf: ");
        sublime.showInfo();
        int num = sublime.getText().length();
        System.out.println("Archivo guardado con : " + num + " caracteres");

    }

    @Override
    public void saveAsPDF(Word word) {
        System.out.println("Guardando como pdf: ");
        word.showInfo();
        int num = word.getText().length();
        System.out.println("Archivo guardado con : " + num + " caracteres");
    }

    @Override
    public void saveAsPDF(NotePad notePad) {
        System.out.println("Guardando como pdf: ");
        notePad.showInfo();
        int num = notePad.getText().length();
        System.out.println("Archivo guardado con : " + num + " caracteres");
    }
}
