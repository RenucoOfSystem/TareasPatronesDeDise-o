package Visitor.EditoresDeTexto;

public class Word implements IEditor{
    private String text;

    public Word(){
        this.text ="*Archivo vacio*";
        System.out.println("***Creando archivo en Word***");

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void accept(IPlugin plugin) {
        plugin.saveAsPDF(this);
    }

    @Override
    public void crear(String content) {
        System.out.println("***Creando texto***");
        setText(content);
    }

    @Override
    public void editar(String content) {
        System.out.println("***Editando texto***");
        showInfo();
        setText(content);
        System.out.println("***Nuevo texto***");
        showInfo();
    }

    @Override
    public void eliminar() {
        System.out.println("***Eliminando***");
        showInfo();
        setText("----");
        showInfo();

    }


    public void showInfo(){
        System.out.println("Archivo Word: " );
        System.out.println(getText());
    }

}
