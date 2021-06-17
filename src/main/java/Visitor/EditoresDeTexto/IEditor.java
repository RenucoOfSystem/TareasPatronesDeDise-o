package Visitor.EditoresDeTexto;

public interface IEditor {
    void accept(IPlugin plugin);
    void crear(String content);
    void editar(String content);
    void eliminar();
}
