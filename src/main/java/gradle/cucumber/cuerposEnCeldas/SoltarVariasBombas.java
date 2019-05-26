package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public class SoltarVariasBombas extends Poder {
    private int bombasASoltar;

    public SoltarVariasBombas(Celda celdaActual, int bombasASoltar) {
        super(celdaActual);
        bombasASoltar = bombasASoltar;
    }

    @Override
    public void activarPoder(Bomberman bomberman) {
        bomberman.setCantidadDeBombasALanzar(bombasASoltar);
    }


}
