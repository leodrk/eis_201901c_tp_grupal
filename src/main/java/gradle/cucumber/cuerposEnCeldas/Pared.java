package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public abstract class Pared extends Cuerpo {
    public Pared(Celda celdaActual) {
        super(celdaActual);
    }

    public boolean sePuedeAtravezar(Bomberman bomberman){
        return false;
    }
}
