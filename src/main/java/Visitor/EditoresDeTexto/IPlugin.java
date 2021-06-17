package Visitor.EditoresDeTexto;

public interface IPlugin {
    void saveAsPDF(Sublime sublime);
    void saveAsPDF(Word word);
    void saveAsPDF(NotePad notePad);
}
