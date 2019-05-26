package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public abstract class Enemigo extends Cuerpo {
    public Enemigo(Celda celdaActual) {
        super(celdaActual);
    }

    @Override
    public boolean sePuedeAtravezar(Bomberman bomberman) {
        bomberman.muere();
        return true;
    }


}
