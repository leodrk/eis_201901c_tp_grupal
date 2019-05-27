package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public class Bagulaa extends Enemigo {
    private Poder poder;
    private boolean estavivo;

    public Bagulaa(Celda celdaActual) {
        super(celdaActual);
    }

    @Override
    public void serDestruido() {

        celdaActual.setCuerpoActual(null);
        getCeldaActual().setPoderActual(new LanzarBombas());
    }
}
