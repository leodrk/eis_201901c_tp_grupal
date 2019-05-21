package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

import java.util.List;

public class Bomberman extends Cuerpo{

    public void setPosicionActual(Celda unaCelda) {
        this.celdaActual = unaCelda;
    }

    public void setCeldasAl(List<Celda> celdas, String dir) {
        // hardcodeado, despues se harian direcciones con el enum (?
        celdasAlNorte = celdas;
    }

    public void moverAl(String dir) {
        // hardcodeado, dspues se implementarian direcciones (?

        celdaActual.setCuerpoActual(null);
        celdasAlNorte.get(0).setCuerpoActual(this);
        celdaActual = celdasAlNorte.get(0);
        reorganizarCeldasMoviendoseAl(dir);
    }

    private void reorganizarCeldasMoviendoseAl(String dir) {
        //todo la idea seria que las listas de celdas en direcciones norte sur este y oeste se actualizen cada vez que haya un movimiento

    }
}
