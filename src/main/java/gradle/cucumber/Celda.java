package gradle.cucumber;

import gradle.cucumber.cuerposEnCeldas.Bomberman;
import gradle.cucumber.cuerposEnCeldas.Cuerpo;

public class Celda {
    private Cuerpo cuerpoActual;

    public Cuerpo getCuerpoActual() {
        return cuerpoActual;
    }

    public void setCuerpoActual(Cuerpo cuerpoActual) {
        cuerpoActual = cuerpoActual;
    }

    public boolean isEmpty() {
        return cuerpoActual == null;
    }
}
