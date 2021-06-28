package PracticaTercerParcial.Decorator;

public class Personaje1 {
    private String nombre;
    private int     nivel;
    private String  armas;
    private int     porcentajeArmadura;
    private int     puntosAtaque;
    private int     puntosDefensa;
    private int     regeneracionVida;



    public Personaje1(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public int getPorcentajeArmadura() {
        return porcentajeArmadura;
    }

    public void setPorcentajeArmadura(int porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getRegeneracionVida() {
        return regeneracionVida;
    }

    public void setRegeneracionVida(int regeneracionVida) {
        this.regeneracionVida = regeneracionVida;
    }


}
