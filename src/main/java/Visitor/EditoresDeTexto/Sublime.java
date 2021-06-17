package Visitor.EditoresDeTexto;

public class Sublime implements IEditor{
    private String text;
    private String type;

    public Sublime(String type){
        this.text ="*Archivo vacio*";
        this.type = type;
        System.out.println("***Creando archivo en  Sublime***");

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showInfo(){
        System.out.println("Archivo: " +getType() );
        System.out.println(getText());
    }

}
