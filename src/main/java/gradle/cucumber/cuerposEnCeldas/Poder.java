package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public abstract class Poder extends Cuerpo{
    public Poder(Celda celdaActual) {
        super(celdaActual);
    }

    @Override
    public void serDestruido() {
        celdaActual.setCuerpoActual(null);
    }

    @Override
    public boolean sePuedeAtravezar(Bomberman bomberman) {
        activarPoder(bomberman);
        return true;
    }

    public abstract void activarPoder(Bomberman bomberman);
}
