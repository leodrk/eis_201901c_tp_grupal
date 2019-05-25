package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;


public class Bagulaa extends Cuerpo {

    private int vida;

    public Bagulaa (Celda celdaActual) {
        this.setCeldaActual(celdaActual);
        this.getCeldaActual().setCuerpoActual(this);
        this.vida = 1;
    }

    @Override
    public boolean sePuedeAtravezar() {
        return false;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void serDestruido() {
        this.getCeldaActual().setCuerpoActual(null);
        this.vida = 0;
    }
}
