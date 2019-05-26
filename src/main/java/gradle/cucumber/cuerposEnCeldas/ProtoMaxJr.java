package gradle.cucumber.cuerposEnCeldas;

import gradle.cucumber.Celda;

public class ProtoMaxJr extends Cuerpo {

    private Poder poder;
    private boolean estavivo;

    public ProtoMaxJr (Celda celdaActual) {
        super(celdaActual);
        this.setPoder(new Ninguno());
        this.estavivo = true;
    }

    @Override
    public void serDestruido() {

    }

    @Override
    public void chocarConBomberman(Bomberman bomberman) {

    }

    @Override
    protected void serSaltadoPorBomberman(Bomberman bomberman, String dir) {

    }

    @Override
    protected void recibirBomberman(Bomberman bomberman, String dir) {

    }

    @Override
    protected void rebotarBomba(String dir, int ticks) {

    }

    @Override
    protected void setPoder(Ninguno ninguno) {

    }

    @Override
    public void dejarBomba(int parseInt) {

    }

    @Override
    public void dejarPoder(int parseInt) {

    }

}
